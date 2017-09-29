package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * interface Tweetable.
 *
 */
public interface Tweetable {
    /**
     * get tweet message
     * @return String message
     */
    public String getMessage();

    /**
     * get tweet date
     * @return Date date
     */
    public Date getDate();
}
