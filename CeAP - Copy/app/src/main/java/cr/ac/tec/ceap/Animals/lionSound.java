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

public class lionSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lion_sound);

        //Lion
        ImageButton btnLionSound = (ImageButton)findViewById(R.id.btnLionSound);
        btnLionSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.horse_sound, false, lionSound.this);
            }
        });
        //next
        Button btnNextLion= (Button)findViewById(R.id.btnNextLion);
        btnNextLion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(lionSound.this, monkeySound.class);
                startActivity(i);
            }
        });

        //back
        Button btnBackLion= (Button)findViewById(R.id.btnBackLion);
        btnBackLion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(lionSound.this, horseSound.class);
                startActivity(i);
            }
        });

        //menu
        Button btnMenuLion= (Button)findViewById(R.id.btnMenuLion);
        btnMenuLion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(lionSound.this, MainAnimals.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lion_sound, menu);
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
