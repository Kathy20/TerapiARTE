package cr.ac.tec.ceap.Words;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.NotActivities.WordGame;
import cr.ac.tec.ceap.R;

public class MainWordsLevel1 extends ActionBarActivity {
    final WordGame wordGame = new WordGame();
    public void beginGame() {
        Random random = new Random();
        ImageButton imgCorrect, imgIncorrect;
        final int correct = wordGame.chooseCorrect();
        final int incorrect = wordGame.chooseIncorrect(correct);
        int rand = random.nextInt(3);
        if (rand == 1) {
            imgCorrect = (ImageButton)findViewById(R.id.imgBtnWord1);
            imgIncorrect = (ImageButton)findViewById(R.id.imgBtnWord2);
        } else {
            imgCorrect = (ImageButton)findViewById(R.id.imgBtnWord2);
            imgIncorrect = (ImageButton)findViewById(R.id.imgBtnWord1);
        }

        ImageButton imgBtnSound1 = (ImageButton)findViewById(R.id.imgBtnSound1);

        imgCorrect.setImageResource(wordGame.getImgEntry(correct));
        imgIncorrect.setImageResource(wordGame.getImgEntry(incorrect));
        imgBtnSound1.setImageResource(R.drawable.sound);



        Player.stop();
        Player.playMusic(wordGame.getSoundEntry(correct), false, MainWordsLevel1.this);

        //correct
        imgCorrect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(R.raw.winning_sound, false, MainWordsLevel1.this);
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
                Player.playMusic(R.raw.losing_sound, false, MainWordsLevel1.this);
            }
        });
        imgBtnSound1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Player.stop();
                Player.playMusic(wordGame.getSoundEntry(correct), false, MainWordsLevel1.this);

            }
        });



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_words_level1);
        beginGame();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_words_level1, menu);
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
