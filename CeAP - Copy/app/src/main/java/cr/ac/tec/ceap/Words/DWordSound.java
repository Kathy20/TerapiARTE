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

public class DWordSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dword_sound);

        //next button
        Button btnNextD = (Button)findViewById(R.id.btnNextD);
        btnNextD.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(DWordSound.this, dword2_sound.class);
                startActivity(i);
            }
        });

        //sounds
        ImageButton btnDinosaurSound = (ImageButton)findViewById(R.id.btnDinosaurSound);
        btnDinosaurSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.dinosaur_sound, false, DWordSound.this);
            }
        });

        ImageButton btnDolphinSound = (ImageButton)findViewById(R.id.btnDolphinSound);
        btnDolphinSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.dolphin_sound, false, DWordSound.this);
            }
        });

        ImageButton btnFingerSound = (ImageButton)findViewById(R.id.btnFingerSound);
        btnFingerSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.finger_sound, false, DWordSound.this);
            }
        });

        ImageButton btnDiceSound = (ImageButton)findViewById(R.id.btnToySound);
        btnDiceSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.dice_sound, false, DWordSound.this);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dword_sound, menu);
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
