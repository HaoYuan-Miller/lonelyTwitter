package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        int position = this.getIntent().getIntExtra("position",0);
        Tweet tweet = LonelyTwitterActivity.tweetList.get(position);

        TextView TweetView = (TextView) findViewById(R.id.tweetView);
        TweetView.setText(tweet.toString());
    }
}
