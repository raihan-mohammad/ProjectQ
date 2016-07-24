package trainedge.projectq;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgv1;
    private TextView textv1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first2);
        imgv1 = (ImageView) findViewById(R.id.imgv1);
        textv1 = (TextView) findViewById(R.id.textv1);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(FirstActivity.this, LoginPage.class);
        startActivity(intent);
    }
}
