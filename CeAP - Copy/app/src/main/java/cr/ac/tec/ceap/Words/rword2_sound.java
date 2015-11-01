package cr.ac.tec.ceap.Words;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;


public class rword2_sound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rword2_sound);

        ImageButton btnGoldSound = (ImageButton)findViewById(R.id.btnGoldSound);
        btnGoldSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.gold_sound, false, rword2_sound.this);
            }
        });

        ImageButton btnRouletteSound = (ImageButton)findViewById(R.id.btnRouletteSound);
        btnRouletteSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.roulette_sound, false, rword2_sound.this);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rword2_sound, menu);
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
