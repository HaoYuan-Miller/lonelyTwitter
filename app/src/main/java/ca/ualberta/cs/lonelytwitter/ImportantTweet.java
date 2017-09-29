package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by hyuan2 on 9/13/17.
 */

/*8
 *represents a ImportantTweet
 */
public class ImportantTweet extends Tweet {
    /**
     * construct an ImportantTweet object with auto generated date.
     * @param message ImportantTweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * construct an ImportantTweet object.
     * @param message ImportantTweet message
     * @param date ImportantTweet date
     */
    public ImportantTweet(String message, Date date){
        super(message,date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
