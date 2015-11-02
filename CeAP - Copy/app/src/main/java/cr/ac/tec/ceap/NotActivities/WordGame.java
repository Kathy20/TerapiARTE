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
    List<Integer> imgSmallArray = new ArrayList<>();

    Random random;
    public WordGame() {
        random = new Random();

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
