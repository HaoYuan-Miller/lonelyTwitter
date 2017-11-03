package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

// class has been made package-private, since declaration access can be weaker
class TweetList {
    private final ArrayList<Tweet> tweets = new ArrayList<Tweet>();// made final

    public TweetList(){

    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
