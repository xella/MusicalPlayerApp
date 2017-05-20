package com.example.android.musicplayerapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import static android.R.attr.duration;

public class CurrentSongActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    int length = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);

        final ImageButton playButton = (ImageButton) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer == null) {
                    length = 0;
                    mediaPlayer = MediaPlayer.create(CurrentSongActivity.this, R.raw.piano);
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

//        if (mediaPlayer != null) {
//            long duration = mediaPlayer.getDuration();
//
//            int seconds = (int) (duration / 1000) % 60 ;
//            int minutes = (int) ((duration / (1000*60)) % 60);
//            int hours   = (int) ((duration / (1000*60*60)) % 24);
//
//            TextView songTimeLeft = (TextView) findViewById(R.id.song_time_left);
//
//            if (hours != 0) {
//                songTimeLeft.setText(hours + ":" + minutes + ":" + seconds);
//            } else {
//                songTimeLeft.setText(minutes + ":" + seconds);
//            }
//        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mediaPlayer.stop();
    }

    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.stop();
    }

}
