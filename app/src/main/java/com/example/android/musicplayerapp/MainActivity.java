package com.example.android.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Xella on 10-May-17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the current song activity
        TextView currentSong = (TextView) findViewById(R.id.current_song);

        currentSong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent currentSongIntent = new Intent(MainActivity.this, CurrentSongActivity.class);
                startActivity(currentSongIntent);
            }
        });

        // Find the View that shows the list of songs
        TextView songsList = (TextView) findViewById(R.id.songs);

        songsList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent songsListIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsListIntent);
            }
        });

        // Find the View that shows the list of artists
        TextView artistsList = (TextView) findViewById(R.id.artists);

        artistsList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent artistsListIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsListIntent);
            }
        });

        // Find the View that shows the list of albums
        TextView albumsList = (TextView) findViewById(R.id.albums);

        albumsList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent albumsListIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsListIntent);
            }
        });
    }

}
