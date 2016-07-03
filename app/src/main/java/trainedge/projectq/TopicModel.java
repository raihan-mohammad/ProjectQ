package trainedge.projectq;

import android.graphics.Bitmap;

/**
 * Created by Rashi Sachan on 7/3/2016.
 */
public class TopicModel {
    Bitmap ivTopicIcon;
    String tvTopicName;

    public TopicModel(String tvTopicName,Bitmap ivTopicIcon){
        this.ivTopicIcon=ivTopicIcon;
        this.tvTopicName=tvTopicName;
    }
}
