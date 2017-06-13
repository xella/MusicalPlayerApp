package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import static com.example.android.musicplayerapp.R.string.album2;
import static com.example.android.musicplayerapp.R.string.album3;
import static com.example.android.musicplayerapp.R.string.album4;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // Finding CardViews for the first 4 artists in the list
        CardView artist1 = (CardView) findViewById(R.id.artist_one);
        CardView artist2 = (CardView) findViewById(R.id.artist_two);
        CardView artist3 = (CardView) findViewById(R.id.artist_three);
        CardView artist4 = (CardView) findViewById(R.id.artist_four);

        //Set an OnClickListeners for that CardViews
        artist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSongListIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(openSongListIntent);
            }
        });

        artist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSongListIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(openSongListIntent);
            }
        });

        artist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSongListIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(openSongListIntent);
            }
        });

        artist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSongListIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(openSongListIntent);
            }
        });
    }
}
