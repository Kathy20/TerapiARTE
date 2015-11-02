package cr.ac.tec.ceap.Words;

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
import cr.ac.tec.ceap.NotActivities.WordGame;
import cr.ac.tec.ceap.R;

public class MainWordsLevel2 extends ActionBarActivity {
    final WordGame wordGame = new WordGame();
    public void beginGame() {
        Random random = new Random();
        ImageButton imgCorrect, imgIncorrect1, imgIncorrect2, imgIncorrect3;
        final int correct = wordGame.chooseCorrect();
        final int incorrect1 = wordGame.chooseIncorrect(correct);
        final int incorrect2 = wordGame.chooseIncorrect(correct);
        final int incorrect3 = wordGame.chooseIncorrect(correct);
        int rand = random.nextInt(5);
        switch (rand) {
            case 1:
                imgCorrect = (ImageButton) findViewById(R.id.imgBtnWord1);
                imgIncorrect1 = (ImageButton) findViewById(R.id.imgBtnWord2);
                imgIncorrect2 = (ImageButton) findViewById(R.id.imgBtnWord3);
                imgIncorrect3 = (ImageButton) findViewById(R.id.imgBtnWord4);
                break;
            case 2:
                imgCorrect = (ImageButton) findViewById(R.id.imgBtnWord2);
                imgIncorrect1 = (ImageButton) findViewById(R.id.imgBtnWord1);
                imgIncorrect2 = (ImageButton) findViewById(R.id.imgBtnWord3);
                imgIncorrect3 = (ImageButton) findViewById(R.id.imgBtnWord4);
                break;
            case 3:
                imgCorrect = (ImageButton) findViewById(R.id.imgBtnWord3);
                imgIncorrect1 = (ImageButton) findViewById(R.id.imgBtnWord1);
                imgIncorrect2 = (ImageButton) findViewById(R.id.imgBtnWord2);
                imgIncorrect3 = (ImageButton) findViewById(R.id.imgBtnWord4);
                break;
            default:
                imgCorrect = (ImageButton) findViewById(R.id.imgBtnWord4);
                imgIncorrect1 = (ImageButton) findViewById(R.id.imgBtnWord1);
                imgIncorrect2 = (ImageButton) findViewById(R.id.imgBtnWord2);
                imgIncorrect3 = (ImageButton) findViewById(R.id.imgBtnWord3);
                break;
        }


        ImageButton imgBtnSound = (ImageButton) findViewById(R.id.imgBtnSound);

        imgCorrect.setImageResource(wordGame.getMediumEntry(correct));
        imgIncorrect1.setImageResource(wordGame.getMediumEntry(incorrect1));
        imgIncorrect2.setImageResource(wordGame.getMediumEntry(incorrect2));
        imgIncorrect3.setImageResource(wordGame.getMediumEntry(incorrect3));
        imgBtnSound.setImageResource(R.drawable.sound);


        Player.stop();
        Player.playMusic(wordGame.getSoundEntry(correct), false, MainWordsLevel2.this);

        //correct
        imgCorrect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.winning_sound, false, MainWordsLevel2.this);
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
                Player.playMusic(R.raw.losing_sound, false, MainWordsLevel2.this);
            }
        });
        imgIncorrect2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.losing_sound, false, MainWordsLevel2.this);
            }
        });
        imgIncorrect3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.losing_sound, false, MainWordsLevel2.this);
            }
        });
        imgBtnSound.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(wordGame.getSoundEntry(correct), false, MainWordsLevel2.this);

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_words_level2);
        beginGame();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_words_level2, menu);
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
