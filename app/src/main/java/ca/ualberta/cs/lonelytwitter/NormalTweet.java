package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hyuan2 on 9/13/17.
 */

/**
 * Represents a NormalTweet.
 */
public class NormalTweet extends Tweet{
    /**
     * construct a NormalTweet object with auto generated date.
     * @param message NormalTweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Construct a NormalTweet object.
     * @param message NormalTweet message
     * @param date NormalTweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
