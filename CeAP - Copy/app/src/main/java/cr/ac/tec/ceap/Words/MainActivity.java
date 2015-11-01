package cr.ac.tec.ceap.Words;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import cr.ac.tec.ceap.Animals.MainAnimals;
import cr.ac.tec.ceap.R;
import cr.ac.tec.ceap.NotActivities.Player;

public class MainActivity extends ActionBarActivity {

    private static final String TAG = "userMessage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Player.playMusic(R.raw.ukelele, true, this);

        //Buttons on Click
        ImageButton btnMainAnimals = (ImageButton)findViewById(R.id.btnMainAnimals);
        btnMainAnimals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainAnimals.class);
                startActivity(i);
            }
        });

        ImageButton btnMainWords = (ImageButton)findViewById(R.id.btnMainWords);
        btnMainWords.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainWords.class);
                startActivity(i);
            }
        });



        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");

    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
        Player.stop();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
        Player.stop();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
        Player.playMusic(R.raw.ukelele, true, this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
