package com.example.audioprogram;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    Button play, pause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = (Button) findViewById(R.id.playId);
        pause = (Button) findViewById(R.id.pauseId);
        mp = MediaPlayer.create(MainActivity.this, R.raw.song);
        play.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) {
            mp.start();
            Toast.makeText(MainActivity.this,"Playing Audio", Toast.LENGTH_SHORT).show();
        }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
                pause.setEnabled(false);
// play.setEnabled(true);
                mp.release();
                Toast.makeText(getApplicationContext(),"Pausing Audio", Toast.LENGTH_SHORT).show();

            }
        });
    }
}