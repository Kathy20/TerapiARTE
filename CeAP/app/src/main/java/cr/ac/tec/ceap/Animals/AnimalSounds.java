package cr.ac.tec.ceap.Animals;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;

public class AnimalSounds extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_sounds);

        //Buttons on Click
        //Bee
        Button btnBeeSound = (Button)findViewById(R.id.btnBeeSound);
        btnBeeSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.bee_sound, false, AnimalSounds.this);
            }
        });
        //Cat
        Button btnCatSound = (Button)findViewById(R.id.btnCatSound);
        btnCatSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.cat_sound, false, AnimalSounds.this);
            }
        });
        //Dog
        Button btnDogSound = (Button)findViewById(R.id.btnDogSound);
        btnDogSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.dog_sound, false, AnimalSounds.this);
            }
        });
        //Bird
        Button btnBirdSound = (Button)findViewById(R.id.btnBirdSound);
        btnBirdSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.bird_sound, false, AnimalSounds.this);
            }
        });
        //Cow
        Button btnCowSound = (Button)findViewById(R.id.btnCowSound);
        btnCowSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.cow_sound, false, AnimalSounds.this);
            }
        });
        //Donkey
        Button btnDonkeySound = (Button)findViewById(R.id.btnDonkeySound);
        btnDonkeySound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.donkey_sound, false, AnimalSounds.this);
            }
        });
        //Duck
        Button btnDuckSound = (Button)findViewById(R.id.btnDuckSound);
        btnDuckSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.duck_sound, false, AnimalSounds.this);
            }
        });
        //Frog
        Button btnFrogSound = (Button)findViewById(R.id.btnFrogSound);
        btnFrogSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.frog_sound, false, AnimalSounds.this);
            }
        });
        //Horse
        Button btnHorseSound = (Button)findViewById(R.id.btnHorseSound);
        btnHorseSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.horse_sound, false, AnimalSounds.this);
            }
        });
        //Lion
        Button btnLionSound = (Button)findViewById(R.id.btnLionSound);
        btnLionSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.lion_sound, false, AnimalSounds.this);
            }
        });
        //Monkey
        Button btnMonkeySound = (Button)findViewById(R.id.btnMonkeySound);
        btnMonkeySound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.monkey_sound, false, AnimalSounds.this);
            }
        });
        //Mosquito
        Button btnMosquitoSound = (Button)findViewById(R.id.btnMosquitoSound);
        btnMosquitoSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.mosquito_sound, false, AnimalSounds.this);
            }
        });
        //Pig
        Button btnPigSound = (Button)findViewById(R.id.btnPigSound);
        btnPigSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.pig_sound, false, AnimalSounds.this);
            }
        });
        //Rooster
        Button btnRoosterSound = (Button)findViewById(R.id.btnRoosterSound);
        btnRoosterSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.rooster_sound_1, false, AnimalSounds.this);
            }
        });
        //Sheep
        Button btnSheepSound = (Button)findViewById(R.id.btnSheepSound);
        btnSheepSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.sheep_sound, false, AnimalSounds.this);
            }
        });


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
