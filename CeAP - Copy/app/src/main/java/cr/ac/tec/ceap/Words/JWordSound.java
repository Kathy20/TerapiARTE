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

public class JWordSound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jword_sound);

        //next button
        ImageButton btnBackJ = (ImageButton)findViewById(R.id.btnBackJ);
        btnBackJ.setImageResource(R.drawable.left);
        btnBackJ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(JWordSound.this, MainWords.class);
                startActivity(i);
            }
        });

        ImageButton btnNextJ = (ImageButton)findViewById(R.id.btnNextJ);
        btnNextJ.setImageResource(R.drawable.right);
        btnNextJ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(JWordSound.this, jword2_sound.class);
                startActivity(i);
            }
        });

        ImageButton btnHomeJ = (ImageButton)findViewById(R.id.btnHomeJ);
        btnHomeJ.setImageResource(R.drawable.home);
        btnHomeJ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(JWordSound.this, MainWords.class);
                startActivity(i);
            }
        });

        //sounds

        ImageButton btnGardenSound = (ImageButton)findViewById(R.id.btnGardenSound);
        btnGardenSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.garden_sound, false, JWordSound.this);
            }
        });

        ImageButton btnRabbitSound = (ImageButton)findViewById(R.id.btnRabbitSound);
        btnRabbitSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.rabbit_sound, false, JWordSound.this);
            }
        });

        ImageButton btnToySound = (ImageButton)findViewById(R.id.btnToySound);
        btnToySound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.toys_sound, false, JWordSound.this);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jword_sound, menu);
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
