package ca.ualberta.cs.lonelytwitter;

/**
 * Created by joshua2 on 9/16/15.
 */
public class TweetTooLongException extends Exception {
    public TweetTooLongException(){
    }
    public TweetTooLongException(String detailMessage){
        super(detailMessage);
    }
}
