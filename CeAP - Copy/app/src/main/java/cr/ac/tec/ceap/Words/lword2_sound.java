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


public class lword2_sound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lword2_sound);

        ImageButton btnLemonadeSoun = (ImageButton)findViewById(R.id.btnLemonadeSoun);
        btnLemonadeSoun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.lemonade_sound, false, lword2_sound.this);
            }
        });

        ImageButton btnWingSound = (ImageButton)findViewById(R.id.btnWingSound);
        btnWingSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.wing_sound, false, lword2_sound.this);
            }
        });

        ImageButton btnBackL2 = (ImageButton)findViewById(R.id.btnBackL2);
        btnBackL2.setImageResource(R.drawable.left);
        btnBackL2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(lword2_sound.this, LWordSound.class);
                startActivity(i);
            }
        });

       ImageButton btnHomeL2 = (ImageButton)findViewById(R.id.btnHomeL2);
        btnHomeL2.setImageResource(R.drawable.home);
        btnHomeL2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(lword2_sound.this, WordSounds.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lword2_sound, menu);
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
