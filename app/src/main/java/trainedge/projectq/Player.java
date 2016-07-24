package trainedge.projectq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Player extends AppCompatActivity implements View.OnClickListener {

    private ImageView imagev1;
    private ImageView imagev2;
    private ImageView imagev3;
    private ImageView imagev4;
    private TextView textv1;
    private TextView textv2;
    private TextView textv3;
    private TextView textv4;
    private RelativeLayout R1;
    private RelativeLayout R2;
    private RelativeLayout R3;
    private RelativeLayout R4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        R1 = (RelativeLayout) findViewById(R.id.R1);
        R2 = (RelativeLayout) findViewById(R.id.R2);
        R3 = (RelativeLayout) findViewById(R.id.R3);
        R4 = (RelativeLayout) findViewById(R.id.R4);
        imagev1 = (ImageView) findViewById(R.id.imagev1);
        imagev2 = (ImageView) findViewById(R.id.imagev2);
        imagev3 = (ImageView) findViewById(R.id.imagev3);
        imagev4 = (ImageView) findViewById(R.id.imagev4);
        textv1 = (TextView) findViewById(R.id.textv1);
        textv2 = (TextView) findViewById(R.id.textv2);
        textv3 = (TextView) findViewById(R.id.textv3);
        textv4 = (TextView) findViewById(R.id.textv4);
        R4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Player.this, Add_quiz.class);
        startActivity(intent);
    }
}
