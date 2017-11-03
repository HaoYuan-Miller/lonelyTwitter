package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

// interface has been made package-private since declaration access can be weaker
interface Tweetable {
    String getMessage();  //removed unnecessary interface modifier "public"

    Date getDate();    //removed unnecessary interface modifier "public"

}
