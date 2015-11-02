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

public class GWordSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gword_sound);

        //next button
        ImageButton btnBackG = (ImageButton)findViewById(R.id.btnBackG);
        btnBackG.setImageResource(R.drawable.left);
        btnBackG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(GWordSound.this, MainWords.class);
                startActivity(i);
            }
        });

        ImageButton btnNextG = (ImageButton)findViewById(R.id.btnNextD);
        btnNextG.setImageResource(R.drawable.right);
        btnNextG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(GWordSound.this, gword2_sound.class);
                startActivity(i);
            }
        });

        ImageButton btnHomeG = (ImageButton)findViewById(R.id.btnHomeD);
        btnHomeG.setImageResource(R.drawable.home);
        btnHomeG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(GWordSound.this, MainWords.class);
                startActivity(i);
            }
        });
        //sounds
        ImageButton btnChickenSound = (ImageButton)findViewById(R.id.btnChickenSound);
        btnChickenSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.chicken_sound, false, GWordSound.this);
            }
        });

        ImageButton btnWormSound = (ImageButton)findViewById(R.id.btnWormSound);
        btnWormSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.worm_sound, false, GWordSound.this);
            }
        });

        ImageButton btnGuitarSound = (ImageButton)findViewById(R.id.btnToySound);
        btnGuitarSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.guitar_sound, false, GWordSound.this);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gword_sound, menu);
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
