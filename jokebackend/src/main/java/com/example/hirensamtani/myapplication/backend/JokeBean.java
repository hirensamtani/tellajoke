package com.example.hirensamtani.myapplication.backend;

import com.example.Jokelib;

/**
 * Created by hirensamtani on 26/5/16.
 */
public class JokeBean {
    private Jokelib jokelib;
    private String randomJoke;

    public JokeBean(){
        jokelib = new Jokelib();
    }


    public String getJoke() {
        this.randomJoke = jokelib.getRandomJoke();
        return randomJoke;
    }
}
