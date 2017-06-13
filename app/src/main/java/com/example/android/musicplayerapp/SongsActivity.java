package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Finding CardViews for first 3 songs in the list
        CardView song1 = (CardView) findViewById(R.id.song_one);
        CardView song2 = (CardView) findViewById(R.id.song_two);
        CardView song3 = (CardView) findViewById(R.id.song_three);

        //Set an OnClickListeners for that CardViews
        song1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(SongsActivity.this, CurrentSongActivity.class);
                startActivity(playSongIntent);
            }
        });

        song2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(SongsActivity.this, CurrentSongActivity.class);
                startActivity(playSongIntent);
            }
        });

        song3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent playSongIntent = new Intent(SongsActivity.this, CurrentSongActivity.class);
                startActivity(playSongIntent);
            }
        });
    }
}
