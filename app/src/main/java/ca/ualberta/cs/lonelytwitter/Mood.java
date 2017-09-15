package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Miller on 2017/9/14.
 */

public class Mood {
    private Date date;
    protected String mood;

    public Mood(Date date){
        this.date = date;
    }

    public Mood(Date date, String currentMood){
        this.date =  date;
        this.mood = currentMood;
    }

    public void setDate(Date date){
        this.date = date;
    }
    public Date getDate(){
        return date;
    }
    public String getMood(){
        return mood;
    }
}
