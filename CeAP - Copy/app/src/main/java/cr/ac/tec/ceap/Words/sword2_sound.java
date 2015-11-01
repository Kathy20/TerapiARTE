package cr.ac.tec.ceap.Words;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;


public class sword2_sound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sword2_sound);

        ImageButton btnOsoSound = (ImageButton)findViewById(R.id.btnOsoSound);
        btnOsoSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.bear_sound, false, sword2_sound.this);
            }
        });

        ImageButton btnSackSound = (ImageButton)findViewById(R.id.btnSackSound);
        btnSackSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.sack_sound, false, sword2_sound.this);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sword2_sound, menu);
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
