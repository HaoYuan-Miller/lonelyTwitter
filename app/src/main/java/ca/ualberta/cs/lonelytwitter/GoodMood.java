package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Miller on 2017/9/14.
 */

public class GoodMood extends Mood{
    public GoodMood(Date date, String currentMood){
        super(date, currentMood);
    }
    public Boolean isMoodGood() {
        return Boolean.TRUE;
    }

}
