package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by evi on 25. 6. 2018.
 */

@RunWith(AndroidJUnit4.class)

public class AsyncTaskTest {

    String resultString = null;

    @Test
    public void checkasync() throws InterruptedException, ExecutionException, TimeoutException {
        JokeAsyncTask jokeAsyncTask= new JokeAsyncTask();
        jokeAsyncTask.execute();
        resultString = jokeAsyncTask.get(20, TimeUnit.SECONDS);
        assertNotNull(resultString);
    }

}
