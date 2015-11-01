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

public class LWordSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lword_sound);

        //next button
        Button btnNextL = (Button)findViewById(R.id.btnNextL);
        btnNextL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(LWordSound.this, lword2_sound.class);
                startActivity(i);
            }
        });

        //sounds

        ImageButton btnHillSound = (ImageButton)findViewById(R.id.btnHillSound);
        btnHillSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.hill_sound, false, LWordSound.this);
            }
        });

        ImageButton btnParrotSound = (ImageButton)findViewById(R.id.btnParrotSound);
        btnParrotSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.parrot_sound, false, LWordSound.this);
            }
        });

        ImageButton btnMagnifierSound= (ImageButton)findViewById(R.id.btnMagnifierSound);
        btnMagnifierSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.magnifier_sound, false, LWordSound.this);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lword_sound, menu);
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
