package cr.ac.tec.ceap.NotActivities;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cr.ac.tec.ceap.Animals.beeSound;
import cr.ac.tec.ceap.R;
/* README
 * La idea que tengo es que los arreglos (imgArray va a ser de imagenes, pero lo hice de strings por mientras, porque no sabia lo de los tamaños).
 * Las funciones son para que se cuando se elige una no pueda repetirse. Lo que staba pensando es que se hagan los botones e interfaz en general para esto con
 * Java manualmente en lugar de con XML para que se pueda hacer dinamico. Ya estan todos los sonidos de los animales ligados con botones, en AnimalSounds, y suena cuando se clickean.
 * El arreglo usedArray es para ir poniendo los que ya se usaron. La idea de que retornen el numero es que se pueda mantener consistencia, y a partir de ese indice se pueda
 * mostrar la imagen/ sonido.
 * La clase Player es para la musica, ahi hice 2 funciones generales que sirven para cualquier sonido/background music. No termine de hacer todas las actividades, solo las de Animales me parece.
 *
*/
public class Animal {
    List<Integer> soundArray = new ArrayList<>();
    List<Integer> usedArray = new ArrayList<>();
    List<Integer> imgArray = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    List<Integer> imgSmallArray = new ArrayList<>();

    Random random;
    public Animal() {
        random = new Random();
        imgArray.add(R.drawable.bee); imgArray.add(R.drawable.bird); imgArray.add(R.drawable.cat); imgArray.add(R.drawable.cow); imgArray.add(R.drawable.dog); imgArray.add(R.drawable.donkey); imgArray.add(R.drawable.duck);
        imgArray.add(R.drawable.frog); imgArray.add(R.drawable.horse); imgArray.add(R.drawable.lion); imgArray.add(R.drawable.monkey); imgArray.add(R.drawable.mosquito); imgArray.add(R.drawable.pig); imgArray.add(R.drawable.rooster); imgArray.add(R.drawable.sheep);

        soundArray.add(R.raw.bee_sound); soundArray.add(R.raw.bird_sound); soundArray.add(R.raw.cat_sound); soundArray.add(R.raw.cow_sound); soundArray.add(R.raw.dog_sound);
        soundArray.add(R.raw.donkey_sound); soundArray.add(R.raw.duck_sound); soundArray.add(R.raw.frog_sound); soundArray.add(R.raw.horse_sound); soundArray.add(R.raw.lion_sound);
        soundArray.add(R.raw.monkey_sound); soundArray.add(R.raw.mosquito_sound); soundArray.add(R.raw.pig_sound); soundArray.add(R.raw.rooster_sound_1); soundArray.add(R.raw.sheep_sound);

        imgSmallArray.add(R.drawable.beesmall); imgSmallArray.add(R.drawable.birdsmall); imgSmallArray.add(R.drawable.catsmall); imgSmallArray.add(R.drawable.cowsmall); imgSmallArray.add(R.drawable.dogsmall); imgSmallArray.add(R.drawable.donkeysmall); imgSmallArray.add(R.drawable.ducksmall);
        imgSmallArray.add(R.drawable.frogsmall); imgSmallArray.add(R.drawable.horsesmall); imgSmallArray.add(R.drawable.lionsmall); imgSmallArray.add(R.drawable.monkeysmall); imgSmallArray.add(R.drawable.mosquitosmall); imgSmallArray.add(R.drawable.pigsmall); imgSmallArray.add(R.drawable.roostersmall); imgSmallArray.add(R.drawable.sheepsmall);

    }



    public int chooseCorrect() {
        temp.clear();
        if(usedArray.size() == imgArray.size()) {
            usedArray.clear();
        }
        int rand = random.nextInt(imgArray.size()-1 + 1); //(max - min + 1) + min (here min = 0);
        while(usedArray.contains(rand))
            rand = random.nextInt(imgArray.size()-1 + 1); //(max - min + 1) + min (here min = 0);
        usedArray.add(rand);
        return rand;
    }


    public int chooseIncorrect(int correct) {

        boolean out = false;
        int incorrect = 0;
        while(!out) {
            incorrect = random.nextInt(imgArray.size()-1 + 1);
            if(incorrect != correct && !temp.contains(incorrect)) out = true;

        }
        temp.add(incorrect);
        return incorrect;
    }

    public int getImgEntry(int entry) {
        return imgArray.get(entry);
    }

    public int getSoundEntry(int entry) {
        return soundArray.get(entry);
    }

    public int getSmallEntry(int entry) {
        return imgSmallArray.get(entry);
    }

    public List<Integer> getSoundArray() {
        return soundArray;
    }

    public void setSoundArray(List<Integer> soundArray) {
        this.soundArray = soundArray;
    }

    public List<Integer> getImgArray() {
        return imgArray;
    }

    public void setImgArray(List<Integer> imgArray) {
        this.imgArray = imgArray;
    }



}
