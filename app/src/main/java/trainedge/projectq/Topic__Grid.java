package trainedge.projectq;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Topic__Grid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic___grid);
        RecyclerView rv=(RecyclerView)findViewById(R.id.rv);
        GridLayoutManager manager= new GridLayoutManager(this, 3);
        rv.setLayoutManager(manager);
        ArrayList<TopicModel> list= new ArrayList<>();




    }
}
