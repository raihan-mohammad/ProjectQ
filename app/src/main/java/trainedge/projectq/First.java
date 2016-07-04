package trainedge.projectq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class First extends AppCompatActivity {

    private TextView tV1;
    private TextView tV2;
    private TextView tV3;
    private Button B1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        tV1 = (TextView) findViewById(R.id.tv1);
        tV2 = (TextView) findViewById(R.id.tv2);
        tV3 = (TextView) findViewById(R.id.tv3);
        B1 = (Button) findViewById(R.id.B1);

    }

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");


}
