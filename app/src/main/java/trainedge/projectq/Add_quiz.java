package trainedge.projectq;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

public class Add_quiz extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout TopicName;
    private EditText edit;
    private TextView textv1;
    private ImageView imagev1;
    private Button b1;
    private Button b2;
    private StorageReference riversRef;
    private boolean isImageSet = false;
    private Uri fullPhotoUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_quiz);
        TopicName = (TextInputLayout) findViewById(R.id.TopicName);
        edit = (EditText) findViewById(R.id.edit);
        textv1 = (TextView) findViewById(R.id.textv1);
        imagev1 = (ImageView) findViewById(R.id.imagev1);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        textv1.setOnClickListener(this);
        b1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        selectImage();
    }

    static final int REQUEST_IMAGE_GET = 1;

    public void selectImage() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_IMAGE_GET);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_GET && resultCode == RESULT_OK) {
            fullPhotoUri = data.getData();
            if (fullPhotoUri != null) {
                CropImage.activity(fullPhotoUri).setFixAspectRatio(true).setGuidelines(CropImageView.Guidelines.ON).start(this);
            }
            // Do work with photo saved at fullPhotoUri
            // Glide.with(this).load(fullPhotoUri).into(imagev1);
            // isImageSet = true;
        }
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                Uri resultUri = result.getUri();
                Glide.with(this).load(resultUri).into(imagev1);
                isImageSet = true;
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Exception error = result.getError();
            }
        }
    }

    private void uploadFile() {
        riversRef = FirebaseStorage.getInstance().getReference("thumbs").child(fullPhotoUri.getLastPathSegment());
        riversRef.putFile(fullPhotoUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                // Get a URL to the uploaded content
                Uri downloadUrl = taskSnapshot.getDownloadUrl();
                saveTopicToDatabase(downloadUrl);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception exception) {
                new AlertDialog.Builder(Add_quiz.this).setMessage(exception.getMessage()).create().show();

            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(UploadTask.TaskSnapshot taskSnapshot) {
            }
        });
    }

    private void saveTopicToDatabase(Uri imageUrl) {

    }
}
