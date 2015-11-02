package cr.ac.tec.ceap.Words;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;


public class jword2_sound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jword2_sound);

        ImageButton btnScissorsSound = (ImageButton)findViewById(R.id.btnScissorsSound);
        btnScissorsSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.scissors_sound, false, jword2_sound.this);
            }
        });

        ImageButton btnGiraffeSound = (ImageButton)findViewById(R.id.btnToySound);
        btnGiraffeSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.giraffe_sound, false, jword2_sound.this);
            }
        });

        ImageButton btnBackJ2 = (ImageButton)findViewById(R.id.btnBackJ2);
        btnBackJ2.setImageResource(R.drawable.left);
        btnBackJ2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(jword2_sound.this, JWordSound.class);
                startActivity(i);
            }
        });

       ImageButton btnHomeJ2 = (ImageButton)findViewById(R.id.btnHomeJ2);
        btnHomeJ2.setImageResource(R.drawable.home);
        btnHomeJ2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(jword2_sound.this, MainWords.class);
                startActivity(i);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jword2_sound, menu);
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
