package trainedge.projectq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private EditText et1;
    private EditText et2;
    private Button b1;
    private Button b2;
    private Button b3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv1 =(TextView)findViewById(R.id.tv1);
        tv2 =(TextView)findViewById(R.id.tv2);
        tv3 =(TextView)findViewById(R.id.tv3);
        et1 =(EditText)findViewById(R.id.et1);
        et2 =(EditText)findViewById(R.id.et2);
        b1 =(Button)findViewById(R.id.b1);
        b2 =(Button)findViewById(R.id.b2);
        b3 =(Button)findViewById(R.id.b3);




    }

}
