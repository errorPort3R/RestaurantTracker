package com.theironyard.javawithclojure.jhporter;

/**
 * Created by jeffryporter on 6/7/16.
 */
public class Restaurant
{
    String name;
    String location;
    int rating;
    String comment;

    public Restaurant(String name, String location, int rating, String comment) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.comment = comment;
    }
}
