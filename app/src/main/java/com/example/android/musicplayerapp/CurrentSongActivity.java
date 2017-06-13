package com.example.android.musicplayerapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static android.R.attr.text;
import static com.example.android.musicplayerapp.R.string.activity_current_song_explanation;

public class CurrentSongActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    int length = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        // OnClickListener for "Play/Pause" button
        final ImageButton playButton = (ImageButton) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer == null) {
                    length = 0;
                    mediaPlayer = MediaPlayer.create(CurrentSongActivity.this, R.raw.piano);
                    setSongLength();
                    playButton.setImageResource(R.drawable.ic_pause_white_48dp);
                    mediaPlayer.start();
                } else if (mediaPlayer.isPlaying()) {
                    playButton.setImageResource(R.drawable.ic_play_arrow_white_48dp);
                    length = mediaPlayer.getCurrentPosition();
                    mediaPlayer.pause();
                } else {
                    playButton.setImageResource(R.drawable.ic_pause_white_48dp);
                    mediaPlayer.seekTo(length);
                    mediaPlayer.start();
                }
            }
        });

        // Toast message will be shown when activity is created
        showToastMessage(getString(R.string.activity_current_song_explanation));

        // OnClickListener for "Previous" button
        ImageButton previousButton = (ImageButton) findViewById(R.id.previous_button);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToastMessage(getString(R.string.activity_current_song_explanation));
            }
        });
    }

    /*
     *  Sets length of the current song as a text into related TextView
     */
    public void setSongLength(){
        if (mediaPlayer != null) {
            long duration = mediaPlayer.getDuration();

            int seconds = (int) (duration / 1000) % 60 ;
            int minutes = (int) ((duration / (1000*60)) % 60);
            int hours   = (int) ((duration / (1000*60*60)) % 24);

            TextView songTimeLeft = (TextView) findViewById(R.id.song_time_left);

            if (hours != 0) {
                songTimeLeft.setText(hours + ":" + minutes + ":" + seconds);
            } else {
                songTimeLeft.setText(minutes + ":" + seconds);
            }
        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    @Override
    protected void onPause(){
        super.onPause();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    // Method for showing a Toast message
    public void showToastMessage(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
