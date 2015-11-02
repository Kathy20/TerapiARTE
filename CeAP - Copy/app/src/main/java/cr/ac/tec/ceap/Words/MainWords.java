package cr.ac.tec.ceap.Words;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import cr.ac.tec.ceap.Animals.MainAnimals;
import cr.ac.tec.ceap.R;


public class MainWords extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_words);

        ImageButton btnWordSounds = (ImageButton)findViewById(R.id.btnWordSounds);
        btnWordSounds.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainWords.this, WordSounds.class);
                startActivity(i);
            }
        });

        ImageButton btnWordLevel1 = (ImageButton)findViewById(R.id.btnWordLevel1);
        btnWordSounds.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainWords.this, MainWordsLevel1.class);
                startActivity(i);
            }
        });

        ImageButton btnWordLevel2 = (ImageButton)findViewById(R.id.btnWordLevel2);
        btnWordSounds.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainWords.this, MainWordsLevel2.class);
                startActivity(i);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_words, menu);
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
