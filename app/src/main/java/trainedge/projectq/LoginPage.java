package trainedge.projectq;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView et1;
    private TextView et2;
    private TextView b1;
    private TextView b2;
    private TextView b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tv1 =(TextView)findViewById(R.id.tv1);
        tv2 =(TextView)findViewById(R.id.tv2);
        tv3 =(TextView)findViewById(R.id.tv3);
        et1 =(TextView)findViewById(R.id.et1);
        et2 =(TextView)findViewById(R.id.et2);
        b1 =(TextView)findViewById(R.id.b1);
        b2 =(TextView)findViewById(R.id.b2);
        b3 =(TextView)findViewById(R.id.b3);




    }

}
