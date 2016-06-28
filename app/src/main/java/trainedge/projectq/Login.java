package trainedge.projectq;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tillUserName = (TextInputLayout) findViewById(R.id.tilUserName);
        tillPassword = (TextInputLayout) findViewById(R.id.tilPassword);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et1);
        b1 = (Button) findViewById(R.id.b1);
        textlogin = (TextView) findViewById(R.id.textlogin);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);


    }
}
