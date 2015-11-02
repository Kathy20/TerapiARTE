package cr.ac.tec.ceap.Animals;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import cr.ac.tec.ceap.NotActivities.Animal;
import cr.ac.tec.ceap.NotActivities.Player;
import cr.ac.tec.ceap.R;

public class MainAnimalsLevel1 extends ActionBarActivity {

    public void beginGame() {
        Animal animal = new Animal();
        int correct = animal.chooseCorrect();
        int incorrect = animal.chooseIncorrect(correct);

        ImageButton imgBtnAnimal1 = (ImageButton)findViewById(R.id.imgBtnAnimal1);
        ImageButton imgBtnAnimal2 = (ImageButton)findViewById(R.id.imgBtnAnimal2);
        ImageButton imgBtnSound1 = (ImageButton)findViewById(R.id.imgBtnSound1);
        ImageButton imgBtnSound2 = (ImageButton)findViewById(R.id.imgBtnSound2);

        imgBtnAnimal1.setImageResource(animal.getImgEntry(correct));
        imgBtnAnimal2.setImageResource(animal.getImgEntry(incorrect));
        imgBtnSound1.setImageResource(R.drawable.sound);
        imgBtnSound2.setImageResource(R.drawable.sound);


        imgBtnAnimal1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainAnimalsLevel1.this, beeSound.class);
                startActivity(i);
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