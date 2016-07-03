package trainedge.projectq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    private ImageView imgV1;
    private ImageView imgV2;
    private ImageView imgV3;
    private ImageView imgV4;
    private ImageView imgV5;
    private EditText editT1;
    private EditText editT2;
    private EditText editT3;
    private EditText editT4;
    private RadioGroup rGroup;
    private RadioButton radB1;
    private RadioButton radB2;
    private TextView textV1;
    private TextView textV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        imgV1 = (ImageView) findViewById(R.id.imgV1);
        imgV2 = (ImageView) findViewById(R.id.imgV2);
        imgV3 = (ImageView) findViewById(R.id.imgV3);
        imgV4 = (ImageView) findViewById(R.id.imgV4);
        imgV5 = (ImageView) findViewById(R.id.imgV5);
        editT1 = (EditText) findViewById(R.id.editT1);
        editT2 = (EditText) findViewById(R.id.editT2);
        editT3 = (EditText) findViewById(R.id.editT3);
        editT4 = (EditText) findViewById(R.id.editT4);
        rGroup = (RadioGroup) findViewById(R.id.rGroup);
        radB1 = (RadioButton) findViewById(R.id.radB1);
        radB2 = (RadioButton) findViewById(R.id.radB2);
        textV1 = (TextView) findViewById(R.id.textV1);
        textV2 = (TextView) findViewById(R.id.textV2);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
