package cr.ac.tec.ceap.Animals;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

import cr.ac.tec.ceap.NotActivities.AnimalGame;
import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;

public class MainAnimalsLevel2 extends ActionBarActivity {

    final AnimalGame animalGame = new AnimalGame();
    public void beginGame() {
        Random random = new Random();
        ImageButton imgCorrect, imgIncorrect1, imgIncorrect2, imgIncorrect3;
        final int correct = animalGame.chooseCorrect();
        final int incorrect1 = animalGame.chooseIncorrect(correct);
        final int incorrect2 = animalGame.chooseIncorrect(correct);
        final int incorrect3 = animalGame.chooseIncorrect(correct);
        int rand = random.nextInt(5);
        switch (rand) {
            case 1:
                imgCorrect = (ImageButton)findViewById(R.id.imgBtnAnimal1);
                imgIncorrect1 = (ImageButton)findViewById(R.id.imgBtnAnimal2);
                imgIncorrect2 = (ImageButton)findViewById(R.id.imgBtnAnimal3);
                imgIncorrect3 = (ImageButton)findViewById(R.id.imgBtnAnimal4);
                break;
            case 2:
                imgCorrect = (ImageButton)findViewById(R.id.imgBtnAnimal2);
                imgIncorrect1 = (ImageButton)findViewById(R.id.imgBtnAnimal1);
                imgIncorrect2 = (ImageButton)findViewById(R.id.imgBtnAnimal3);
                imgIncorrect3 = (ImageButton)findViewById(R.id.imgBtnAnimal4);
                break;
            case 3:
                imgCorrect = (ImageButton)findViewById(R.id.imgBtnAnimal3);
                imgIncorrect1 = (ImageButton)findViewById(R.id.imgBtnAnimal1);
                imgIncorrect2 = (ImageButton)findViewById(R.id.imgBtnAnimal2);
                imgIncorrect3 = (ImageButton)findViewById(R.id.imgBtnAnimal4);
                break;
            default:
                imgCorrect = (ImageButton)findViewById(R.id.imgBtnAnimal4);
                imgIncorrect1 = (ImageButton)findViewById(R.id.imgBtnAnimal1);
                imgIncorrect2 = (ImageButton)findViewById(R.id.imgBtnAnimal2);
                imgIncorrect3 = (ImageButton)findViewById(R.id.imgBtnAnimal3);
                break;
        }


        ImageButton imgBtnSound = (ImageButton)findViewById(R.id.imgBtnSound);

        imgCorrect.setImageResource(animalGame.getSmallEntry(correct));
        imgIncorrect1.setImageResource(animalGame.getSmallEntry(incorrect1));
        imgIncorrect2.setImageResource(animalGame.getSmallEntry(incorrect2));
        imgIncorrect3.setImageResource(animalGame.getSmallEntry(incorrect3));
        imgBtnSound.setImageResource(R.drawable.sound);



        Player.stop();
        Player.playMusic(animalGame.getSoundEntry(correct), false, MainAnimalsLevel2.this);

        //correct
        imgCorrect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.winning_sound, false, MainAnimalsLevel2.this);
                Player.getPlayer().setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer player) {
                        beginGame();
                    }
                });
            }
        });
        imgIncorrect1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.losing_sound, false, MainAnimalsLevel2.this);
            }
        });
        imgIncorrect2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.losing_sound, false, MainAnimalsLevel2.this);
            }
        });
        imgIncorrect3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.losing_sound, false, MainAnimalsLevel2.this);
            }
        });
        imgBtnSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(animalGame.getSoundEntry(correct), false, MainAnimalsLevel2.this);

            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_animals_level2);
        beginGame();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_animals_level2, menu);
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
