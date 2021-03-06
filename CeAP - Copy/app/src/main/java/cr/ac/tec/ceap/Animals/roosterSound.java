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

public class roosterSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooster_sound);

        //Rooster
        ImageButton btnRoosterSound = (ImageButton)findViewById(R.id.btnRoosterSound);
        btnRoosterSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.rooster_sound_1, false, roosterSound.this);
            }
        });

        //next
        Button btnNextRooster = (Button)findViewById(R.id.btnNextRooster);
        btnNextRooster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(roosterSound.this, sheepSound.class);
                startActivity(i);
            }
        });

        //back
        Button btnBackRooster = (Button)findViewById(R.id.btnBackRooster);
        btnBackRooster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(roosterSound.this, pigSound.class);
                startActivity(i);
            }
        });

        //Menu
        Button btnMenuRooster= (Button)findViewById(R.id.btnMenuRooster);
        btnMenuRooster.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(roosterSound.this, MainAnimals.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rooster_sound, menu);
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
