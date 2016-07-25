package trainedge.projectq;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yongchun.library.view.ImageSelectorActivity;

import java.io.File;
import java.util.ArrayList;

public class Add_quiz extends AppCompatActivity implements View.OnClickListener {

    private TextInputLayout TopicName;
    private EditText edit;
    private TextView textv1;
    private ImageView imagev1;
    private Button b1;
    private Button b2;

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
        start(Add_quiz.this, 1, ImageSelectorActivity.MODE_SINGLE, true, true, true);


    }

    public static void start(Activity activity, int maxSelectNum, int mode, boolean isShow, boolean enablePreview, boolean enableCrop) {
        Intent intent = new Intent(activity, ImageSelectorActivity.class);
        intent.putExtra(ImageSelectorActivity.EXTRA_MAX_SELECT_NUM, maxSelectNum);
        intent.putExtra(ImageSelectorActivity.EXTRA_SELECT_MODE, mode);
        intent.putExtra(ImageSelectorActivity.EXTRA_SHOW_CAMERA, isShow);
        intent.putExtra(ImageSelectorActivity.EXTRA_ENABLE_PREVIEW, enablePreview);
        intent.putExtra(ImageSelectorActivity.EXTRA_ENABLE_CROP, enableCrop);
        activity.startActivityForResult(intent, ImageSelectorActivity.REQUEST_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == ImageSelectorActivity.REQUEST_IMAGE) {
            ArrayList<String> images = (ArrayList<String>) data.getSerializableExtra(ImageSelectorActivity.REQUEST_OUTPUT);
            String s = images.get(0);
            Glide.with(Add_quiz.this).load(new File(s)).into(imagev1);
        }
    }
}
