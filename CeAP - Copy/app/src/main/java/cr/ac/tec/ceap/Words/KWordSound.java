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

public class KWordSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kword_sound);

        //next button
       ImageButton btnNextK = (ImageButton)findViewById(R.id.btnNextK);
        btnNextK.setImageResource(R.drawable.right);
        btnNextK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(KWordSound.this, kword2_sound.class);
                startActivity(i);
            }
        });

        ImageButton btnHomeK = (ImageButton)findViewById(R.id.btnHomeK);
        btnHomeK.setImageResource(R.drawable.home);
        btnHomeK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(KWordSound.this, MainWords.class);
                startActivity(i);
            }
        });

        //sounds

        ImageButton btnKarateSound = (ImageButton)findViewById(R.id.btnKarateSound);
        btnKarateSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.karate_sound, false, KWordSound.this);
            }
        });

        ImageButton btnKimonoSound = (ImageButton)findViewById(R.id.btnKimonoSound);
        btnKimonoSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.kimono_sound, false, KWordSound.this);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_kword_sound, menu);
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
