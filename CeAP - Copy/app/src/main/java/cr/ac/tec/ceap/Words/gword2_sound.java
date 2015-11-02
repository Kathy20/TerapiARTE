package cr.ac.tec.ceap.Words;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;


public class gword2_sound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gword2_sound);

        ImageButton btnCapSound = (ImageButton)findViewById(R.id.btnCapSound);
        btnCapSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.cap_sound, false, gword2_sound.this);
            }
        });

        ImageButton btnHoseSound = (ImageButton)findViewById(R.id.btnToySound);
        btnHoseSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.hose_sound, false, gword2_sound.this);
            }
        });

        ImageButton btnBackG2 = (ImageButton)findViewById(R.id.btnBackG2);
        btnBackG2.setImageResource(R.drawable.left);
        btnBackG2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(gword2_sound.this, GWordSound.class);
                startActivity(i);
            }
        });

       ImageButton btnHomeG2 = (ImageButton)findViewById(R.id.btnHomeG2);
        btnHomeG2.setImageResource(R.drawable.home);
        btnHomeG2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(gword2_sound.this, MainWords.class);
                startActivity(i);
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gword2_sound, menu);
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
