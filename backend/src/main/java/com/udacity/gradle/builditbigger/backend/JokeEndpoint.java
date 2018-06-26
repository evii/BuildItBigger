package com.udacity.gradle.builditbigger.backend;

import com.example.android.javajokelibrary.JokeTeller;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class JokeEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "retreiveJoke")
    public JokeBean retreiveJoke() {
        JokeBean response = new JokeBean();
        JokeTeller jokeTeller = new JokeTeller();
        String myJoke = jokeTeller.getJoke();

        response.setJoke(myJoke);

        return response;
    }

}
