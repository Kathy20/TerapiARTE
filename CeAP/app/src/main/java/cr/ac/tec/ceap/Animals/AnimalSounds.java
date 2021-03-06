package cr.ac.tec.ceap.Animals;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;

public class AnimalSounds extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_sounds);

        //Buttons on Click
        //Bee
        ImageButton btnBeeSound = (ImageButton)findViewById(R.id.btnBeeSound);
        btnBeeSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.bee_sound, false, AnimalSounds.this);
            }
        });
        //Cat
        ImageButton btnCatSound = (ImageButton)findViewById(R.id.btnCatSound);
        btnCatSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.cat_sound, false, AnimalSounds.this);
            }
        });
        //Dog
        ImageButton btnDogSound = (ImageButton)findViewById(R.id.btnDogSound);
        btnDogSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.dog_sound, false, AnimalSounds.this);
            }
        });
        //Bird
        ImageButton btnBirdSound = (ImageButton)findViewById(R.id.btnBirdSound);
        btnBirdSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.bird_sound, false, AnimalSounds.this);
            }
        });
        //Cow
        ImageButton btnCowSound = (ImageButton)findViewById(R.id.btnCowSound);
        btnCowSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.cow_sound, false, AnimalSounds.this);
            }
        });
        //Donkey
        ImageButton btnDonkeySound = (ImageButton)findViewById(R.id.btnDonkeySound);
        btnDonkeySound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.donkey_sound, false, AnimalSounds.this);
            }
        });
        //Duck
        ImageButton btnDuckSound = (ImageButton)findViewById(R.id.btnDuckSound);
        btnDuckSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.duck_sound, false, AnimalSounds.this);
            }
        });
        //Frog
        ImageButton btnFrogSound = (ImageButton)findViewById(R.id.btnFrogSound);
        btnFrogSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.frog_sound, false, AnimalSounds.this);
            }
        });
        //Horse
        ImageButton btnHorseSound = (ImageButton)findViewById(R.id.btnHorseSound);
        btnHorseSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.horse_sound, false, AnimalSounds.this);
            }
        });
        //Lion
        ImageButton btnLionSound = (ImageButton)findViewById(R.id.btnLionSound);
        btnLionSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.lion_sound, false, AnimalSounds.this);
            }
        });
        //Monkey
        ImageButton btnMonkeySound = (ImageButton)findViewById(R.id.btnMonkeySound);
        btnMonkeySound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.monkey_sound, false, AnimalSounds.this);
            }
        });
        //Mosquito
        ImageButton btnMosquitoSound = (ImageButton)findViewById(R.id.btnMosquitoSound);
        btnMosquitoSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.mosquito_sound, false, AnimalSounds.this);
            }
        });
        //Pig
        ImageButton btnPigSound = (ImageButton)findViewById(R.id.btnPigSound);
        btnPigSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.pig_sound, false, AnimalSounds.this);
            }
        });
        //Rooster
        ImageButton btnRoosterSound = (ImageButton)findViewById(R.id.btnRoosterSound);
        btnRoosterSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.rooster_sound_1, false, AnimalSounds.this);
            }
        });
        //Sheep
        ImageButton btnSheepSound = (ImageButton)findViewById(R.id.btnSheepSound);
        btnSheepSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.sheep_sound, false, AnimalSounds.this);
            }
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        Player.stop();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Player.stop();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_animal_sounds, menu);
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
