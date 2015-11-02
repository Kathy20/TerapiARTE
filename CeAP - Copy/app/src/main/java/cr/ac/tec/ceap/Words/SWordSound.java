package cr.ac.tec.ceap.Words;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;

public class SWordSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sword_sound);

        //next button
        ImageButton btnNextS = (ImageButton)findViewById(R.id.btnNextS);
        btnNextS.setImageResource(R.drawable.right);
        btnNextS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(SWordSound.this, sword2_sound.class);
                startActivity(i);
            }
        });

        ImageButton btnHomeS = (ImageButton)findViewById(R.id.btnHomeS);
        btnHomeS.setImageResource(R.drawable.home);
        btnHomeS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(SWordSound.this, WordSounds.class);
                startActivity(i);
            }
        });


        //sounds

        ImageButton btnSnakeSound = (ImageButton)findViewById(R.id.btnSnakeSound);
        btnSnakeSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.snake_sound, false, SWordSound.this);
            }
        });

        ImageButton btnDirtySound = (ImageButton)findViewById(R.id.btnDirtySound);
        btnDirtySound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.dirty_sound, false, SWordSound.this);
            }
        });

        ImageButton btnSofaSound = (ImageButton)findViewById(R.id.btnSofaSound);
        btnSofaSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.sofa_sound, false, SWordSound.this);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sword_sound, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
