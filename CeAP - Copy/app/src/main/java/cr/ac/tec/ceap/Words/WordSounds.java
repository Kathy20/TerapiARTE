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

public class WordSounds extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_sounds);

        Button button_D = (Button)findViewById(R.id.button_D);
        button_D.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(WordSounds.this, DWordSound.class);
                startActivity(i);
            }
        });

        Button button_G = (Button)findViewById(R.id.button_G);
        button_G.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(WordSounds.this, GWordSound.class);
                startActivity(i);
            }
        });

        Button button_J = (Button)findViewById(R.id.button_J);
        button_J.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(WordSounds.this, JWordSound.class);
                startActivity(i);
            }
        });

        Button button_K = (Button)findViewById(R.id.button_K);
        button_K.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(WordSounds.this, KWordSound.class);
                startActivity(i);
            }
        });

        Button button_L = (Button)findViewById(R.id.button_L);
        button_L.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(WordSounds.this, LWordSound.class);
                startActivity(i);
            }
        });

        Button button_R = (Button)findViewById(R.id.button_R);
        button_R.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(WordSounds.this, RWordSound.class);
                startActivity(i);
            }
        });

        Button button_S = (Button)findViewById(R.id.button_S);
        button_S.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(WordSounds.this, SWordSound.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_word_sounds, menu);
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
