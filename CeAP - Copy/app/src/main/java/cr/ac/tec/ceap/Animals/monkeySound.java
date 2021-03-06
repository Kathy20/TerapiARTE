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

public class monkeySound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monkey_sound);

        //Monkey
        ImageButton btnMonkeySound = (ImageButton)findViewById(R.id.btnMonkeySound);
        btnMonkeySound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.monkey_sound, false, monkeySound.this);
            }
        });

        //next
        Button btnNextMonkey= (Button)findViewById(R.id.btnNextMonkey);
        btnNextMonkey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(monkeySound.this, mosquitoSound.class);
                startActivity(i);
            }
        });

        //back
        Button btnBackMonkey= (Button)findViewById(R.id.btnBackMonkey);
        btnBackMonkey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(monkeySound.this, lionSound.class);
                startActivity(i);
            }
        });

        //menu
        Button btnMenuMonkey= (Button)findViewById(R.id.btnMenuMonkey);
        btnMenuMonkey.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(monkeySound.this, MainAnimals.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_monkey_sound, menu);
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
