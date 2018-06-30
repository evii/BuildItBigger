package com.example.android.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private static final String JOKE_INTENT = "JOKE_INTENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView jokeTextView = findViewById(R.id.joke_text_view);

        Intent intent = getIntent();
        if(intent.hasExtra(JOKE_INTENT)) {
            String joke = intent.getStringExtra(JOKE_INTENT);
            jokeTextView.setText(joke);
        }
        else{
            Log.v("JokeActivity","There is no Extra attached to the intent.");
        }
    }
}
