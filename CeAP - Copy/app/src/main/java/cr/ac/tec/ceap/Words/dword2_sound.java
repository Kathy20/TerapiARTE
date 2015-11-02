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


public class dword2_sound extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dword2_sound);

        ImageButton btnTeethSound = (ImageButton)findViewById(R.id.btnTeethSound);
        btnTeethSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.teeth_sound, false, dword2_sound.this);
            }
        });

        ImageButton btnbackd2 = (ImageButton)findViewById(R.id.backD2);
        btnbackd2.setImageResource(R.drawable.left);
        btnbackd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(dword2_sound.this, DWordSound.class);
                startActivity(i);
            }
        });

        ImageButton btnHomeD2 = (ImageButton)findViewById(R.id.homeD2);
        btnHomeD2.setImageResource(R.drawable.home);
        btnHomeD2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(dword2_sound.this, MainWords.class);
                startActivity(i);
            }
        });

        ImageButton btnDonutSound = (ImageButton)findViewById(R.id.btnDonutSound);
        btnDonutSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.donut_sound, false, dword2_sound.this);
            }
        });

        ImageButton btnShowerSound = (ImageButton)findViewById(R.id.btnToySound);
        btnShowerSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.shower_sound, false, dword2_sound.this);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dword2_sound, menu);
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
