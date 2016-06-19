package com.example;

import java.util.Random;

public class Jokelib {
    private String[] joke;
    private Random randomNmbr;

    public Jokelib() {
        joke = new String[5];
        joke[0] = "A clean house is the sign of a broken computer.";
        joke[1] = "Any room is a panic room if you've lost your phone in it.";
        joke[2] = "Entered what I ate today into my new fitness app and it just sent an ambulance to my house.";
        joke[3] = "A computer once beat me at chess, but it was no match for me at kick boxing.";
        joke[4] = "How do I disable the autocorrect function on my wife?";
        randomNmbr = new Random();
    }

    public String[] getJokes() {
        return joke;
    }

    public String getRandomJoke() {
        return joke[randomNmbr.nextInt(joke.length)];
    }

}
