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

public class beeSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bee_sound);

        //sound
        ImageButton btnBeeSound = (ImageButton)findViewById(R.id.btnBeeSound);
        btnBeeSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.bee_sound, false, beeSound.this);
            }
        });

        //Button next
        Button btnNextBee = (Button)findViewById(R.id.btnNextBee);
        btnNextBee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(beeSound.this, birdSound.class);
                startActivity(i);
            }
        });

        //Button menu
        Button btnMenuBee = (Button)findViewById(R.id.btnMenuBee);
        btnMenuBee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(beeSound.this, MainAnimals.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bee_sound, menu);
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
