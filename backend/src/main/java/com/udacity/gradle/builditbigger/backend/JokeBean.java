package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private String mJoke;

    public String getJoke() {
        return mJoke;
    }

    public void setJoke(String joke) {
        mJoke = joke;
    }
}