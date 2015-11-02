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

public class duckSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duck_sound);

        //Duck
        ImageButton btnDuckSound = (ImageButton)findViewById(R.id.btnDuckSound);
        btnDuckSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.duck_sound, false, duckSound.this);
            }
        });

        //next
        Button btnNextDuck= (Button)findViewById(R.id.btnNextDuck);
        btnNextDuck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(duckSound.this, frogSound.class);
                startActivity(i);
            }
        });

        //back
        Button btnBackDuck= (Button)findViewById(R.id.btnBackDuck);
        btnBackDuck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(duckSound.this, donkeySound.class);
                startActivity(i);
            }
        });

        //menu
        Button btnMenuDuck= (Button)findViewById(R.id.btnMenuDuck);
        btnMenuDuck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(duckSound.this, MainAnimals.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_duck_sound, menu);
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
