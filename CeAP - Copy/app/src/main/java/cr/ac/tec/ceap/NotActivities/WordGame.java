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

public class WordGame {
    List<Integer> soundArray = new ArrayList<>();
    List<Integer> usedArray = new ArrayList<>();
    List<Integer> imgArray = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    List<Integer> imgMediumArray = new ArrayList<>();

    Random random;
    public WordGame() {
        random = new Random();
        soundArray.add(R.raw.dinosaur_sound); soundArray.add(R.raw.dolphin_sound); soundArray.add(R.raw.dice_sound); soundArray.add(R.raw.finger_sound);
        soundArray.add(R.raw.teeth_sound); soundArray.add(R.raw.shower_sound); soundArray.add(R.raw.donut_sound); soundArray.add(R.raw.garden_sound); soundArray.add(R.raw.toys_sound);
        soundArray.add(R.raw.rabbit_sound); soundArray.add(R.raw.scissors_sound); soundArray.add(R.raw.giraffe_sound); soundArray.add(R.raw.karate_sound); soundArray.add(R.raw.kimono_sound);
        soundArray.add(R.raw.koala_sound); soundArray.add(R.raw.kiwi_sound); soundArray.add(R.raw.hill_sound); soundArray.add(R.raw.parrot_sound); soundArray.add(R.raw.magnifier_sound); soundArray.add(R.raw.lemonade_sound); soundArray.add(R.raw.wing_sound);
        soundArray.add(R.raw.laughter_sound); soundArray.add(R.raw.king_sound); soundArray.add(R.raw.mice_sound); soundArray.add(R.raw.gold_sound); soundArray.add(R.raw.roulette_sound);
        soundArray.add(R.raw.dirty_sound); soundArray.add(R.raw.sofa_sound); soundArray.add(R.raw.snake_sound); soundArray.add(R.raw.bear_sound); soundArray.add(R.raw.sack_sound);

        imgArray.add(R.drawable.dinosaur); imgArray.add(R.drawable.dolphin); imgArray.add(R.drawable.dice); imgArray.add(R.drawable.finger); imgArray.add(R.drawable.teeth); imgArray.add(R.drawable.shower); imgArray.add(R.drawable.donut);
        imgArray.add(R.drawable.garden); imgArray.add(R.drawable.toys); imgArray.add(R.drawable.rabbit); imgArray.add(R.drawable.scissors); imgArray.add(R.drawable.giraffe); imgArray.add(R.drawable.karate); imgArray.add(R.drawable.kimono);
        imgArray.add(R.drawable.koala); imgArray.add(R.drawable.kiwi); imgArray.add(R.drawable.hill); imgArray.add(R.drawable.parrot); imgArray.add(R.drawable.magnifier); imgArray.add(R.drawable.lemonade); imgArray.add(R.drawable.wing);
        imgArray.add(R.drawable.laughter); imgArray.add(R.drawable.king); imgArray.add(R.drawable.mice); imgArray.add(R.drawable.gold); imgArray.add(R.drawable.roulette); imgArray.add(R.drawable.dirty); imgArray.add(R.drawable.sofa);
        imgArray.add(R.drawable.snake); imgArray.add(R.drawable.bear); imgArray.add(R.drawable.sack);

        imgMediumArray.add(R.drawable.dinosaurmedium); imgMediumArray.add(R.drawable.dolphinmedium); imgMediumArray.add(R.drawable.dicemedium); imgMediumArray.add(R.drawable.fingermedium); imgMediumArray.add(R.drawable.teethmedium); imgMediumArray.add(R.drawable.showermedium);
        imgMediumArray.add(R.drawable.donutmedium); imgMediumArray.add(R.drawable.gardenmedium); imgMediumArray.add(R.drawable.toysmedium); imgMediumArray.add(R.drawable.rabbitmedium); imgMediumArray.add(R.drawable.scissorsmedium); imgMediumArray.add(R.drawable.giraffemedium);
        imgMediumArray.add(R.drawable.karatemedium); imgMediumArray.add(R.drawable.kimonomedium); imgMediumArray.add(R.drawable.koalamedium); imgMediumArray.add(R.drawable.kiwimedium); imgMediumArray.add(R.drawable.hillmedium); imgMediumArray.add(R.drawable.parrotmedium);
        imgMediumArray.add(R.drawable.magnifiermedium); imgMediumArray.add(R.drawable.lemonademedium); imgMediumArray.add(R.drawable.wingmedium); imgMediumArray.add(R.drawable.laughtermedium); imgMediumArray.add(R.drawable.kingmedium); imgMediumArray.add(R.drawable.micemedium);
        imgMediumArray.add(R.drawable.goldmedium); imgMediumArray.add(R.drawable.roulettemedium); imgMediumArray.add(R.drawable.dirtymedium); imgMediumArray.add(R.drawable.sofamedium); imgMediumArray.add(R.drawable.snakemedium); imgMediumArray.add(R.drawable.bearmedium); imgMediumArray.add(R.drawable.sackmedium);

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

    public int getMediumEntry(int entry) {
        return imgMediumArray.get(entry);
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
