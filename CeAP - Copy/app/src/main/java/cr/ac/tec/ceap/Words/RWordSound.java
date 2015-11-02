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

public class RWordSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rword_sound);

        //next button
        ImageButton btnHomeR = (ImageButton)findViewById(R.id.btnHomeR);
        btnHomeR.setImageResource(R.drawable.home);
        btnHomeR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(RWordSound.this,WordSounds.class);
                startActivity(i);
            }
        });

        ImageButton btnNextR = (ImageButton)findViewById(R.id.btnNextR);
        btnNextR.setImageResource(R.drawable.right);
        btnNextR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(RWordSound.this, rword2_sound.class);
                startActivity(i);
            }
        });
        //sounds

        ImageButton btnKingSound = (ImageButton)findViewById(R.id.btnKingSound);
        btnKingSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.king_sound, false, RWordSound.this);
            }
        });

        ImageButton btnLaughterSound = (ImageButton)findViewById(R.id.btnLaughterSound);
        btnLaughterSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.laughter_sound, false, RWordSound.this);
            }
        });

        ImageButton btnMiceSound = (ImageButton)findViewById(R.id.btnMiceSound);
        btnMiceSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.mice_sound, false, RWordSound.this);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rword_sound, menu);
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
