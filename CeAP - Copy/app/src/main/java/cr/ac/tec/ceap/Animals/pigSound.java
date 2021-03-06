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

public class pigSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pig_sound);

        //Pig
        ImageButton btnPigSound = (ImageButton)findViewById(R.id.btnPigSound);
        btnPigSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.pig_sound, false, pigSound.this);
            }
        });

        //next
        Button btnNextPig = (Button)findViewById(R.id.btnNextPig);
        btnNextPig.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(pigSound.this, roosterSound.class);
                startActivity(i);
            }
        });

        //back
        Button btnBackPig = (Button)findViewById(R.id.btnBackPig);
        btnBackPig.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(pigSound.this, mosquitoSound.class);
                startActivity(i);
            }
        });

        //menu
        Button btnMenuPig = (Button)findViewById(R.id.btnMenuPig);
        btnMenuPig.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(pigSound.this, MainAnimals.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pig_sound, menu);
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
