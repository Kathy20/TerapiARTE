package cr.ac.tec.ceap.Animals;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

import cr.ac.tec.ceap.NotActivities.Animal;
import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;

public class MainAnimalsLevel1 extends ActionBarActivity {
    final Animal animal = new Animal();
    public void beginGame() {
        Random random = new Random();
        ImageButton imgCorrect, imgIncorrect;
        final int correct = animal.chooseCorrect();
        final int incorrect = animal.chooseIncorrect(correct);
        int rand = random.nextInt(3);
        if (rand == 1) {
            imgCorrect = (ImageButton)findViewById(R.id.imgBtnAnimal1);
            imgIncorrect = (ImageButton)findViewById(R.id.imgBtnAnimal2);
        } else {
            imgCorrect = (ImageButton)findViewById(R.id.imgBtnAnimal2);
            imgIncorrect = (ImageButton)findViewById(R.id.imgBtnAnimal1);
        }

        ImageButton imgBtnSound1 = (ImageButton)findViewById(R.id.imgBtnSound1);

        imgCorrect.setImageResource(animal.getImgEntry(correct));
        imgIncorrect.setImageResource(animal.getImgEntry(incorrect));
        imgBtnSound1.setImageResource(R.drawable.sound);



        Player.stop();
        Player.playMusic(animal.getSoundEntry(correct), false, MainAnimalsLevel1.this);

        //correct
        imgCorrect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.winning_sound, false, MainAnimalsLevel1.this);
                Player.getPlayer().setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer player) {
                        beginGame();
                    }
                });
            }
        });
        imgIncorrect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.losing_sound, false, MainAnimalsLevel1.this);
            }
        });
        imgBtnSound1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(animal.getSoundEntry(correct), false, MainAnimalsLevel1.this);

            }
        });



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_animals_level1);

        beginGame();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_animals_level1, menu);
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
