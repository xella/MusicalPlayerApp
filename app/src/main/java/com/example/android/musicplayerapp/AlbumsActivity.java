
package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Finding CardViews for the first 4 albums in the list
        CardView album1 = (CardView) findViewById(R.id.album_one);
        CardView album2 = (CardView) findViewById(R.id.album_two);
        CardView album3 = (CardView) findViewById(R.id.album_three);
        CardView album4 = (CardView) findViewById(R.id.album_four);

        //Set an OnClickListeners for that CardViews
        album1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSongListIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(openSongListIntent);
            }
        });

        album2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSongListIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(openSongListIntent);
            }
        });

        album3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSongListIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(openSongListIntent);
            }
        });

        album4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openSongListIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(openSongListIntent);
            }
        });
    }
}
