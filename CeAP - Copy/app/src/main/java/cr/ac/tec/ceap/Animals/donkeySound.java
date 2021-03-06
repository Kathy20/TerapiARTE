package cr.ac.tec.ceap.Animals;

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

public class donkeySound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donkey_sound);

        //Donkey
        ImageButton btnDonkeySound = (ImageButton)findViewById(R.id.btnDonkeySound);
        btnDonkeySound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.donkey_sound, false, donkeySound.this);
            }
        });

        //next
        Button btnNextDonkey= (Button)findViewById(R.id.btnNextDonkey);
        btnNextDonkey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(donkeySound.this, duckSound.class);
                startActivity(i);
            }
        });

        //back
        Button btnBackDonkey = (Button)findViewById(R.id.btnBackDonkey);
        btnBackDonkey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(donkeySound.this, dogSound.class);
                startActivity(i);
            }
        });

        //Menu
        Button btnMenuDonkey = (Button)findViewById(R.id.btnMenuDonkey);
        btnMenuDonkey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(donkeySound.this, MainAnimals.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_donkey_sound, menu);
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
