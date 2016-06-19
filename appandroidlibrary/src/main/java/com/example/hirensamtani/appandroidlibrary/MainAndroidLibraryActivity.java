package com.example.hirensamtani.appandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainAndroidLibraryActivity extends AppCompatActivity {

    public final static String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android_library);

        String joke = getIntent().getStringExtra(INTENT_JOKE);
        TextView textViewJoke = (TextView) findViewById(R.id.jokeTextView);
        textViewJoke.setText(joke);
    }


}
