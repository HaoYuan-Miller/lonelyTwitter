/*
 * Tweet
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright (c) 2017 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact hyuan2@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Represents a tweet.
 * @author Team X
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Construct a tweet object with auto generated date.
     * @param message tweet message
     */
    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Construct a tweet object.
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * Get tweet message
     * @return returns String message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Set tweet message
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Get tweet date
     * @return returns Date date
     */
    public Date getDate(){
        return date;
    }


    public abstract Boolean isImportant();

    /**
     * overrides toString for the app to display correct format of date and message
     * @return
     */
    @Override
    public String toString(){
        return date.toString()+"|"+message;
    }
}
