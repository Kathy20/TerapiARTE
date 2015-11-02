package cr.ac.tec.ceap.NotActivities;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import cr.ac.tec.ceap.R;

public class AnimalGame {
    List<Integer> soundArray = new ArrayList<>();
    List<Integer> usedArray = new ArrayList<>();
    List<Integer> imgArray = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    List<Integer> imgmediumArray = new ArrayList<>();

    Random random;
    public AnimalGame() {
        random = new Random();
        imgArray.add(R.drawable.bee); imgArray.add(R.drawable.bird); imgArray.add(R.drawable.cat); imgArray.add(R.drawable.cow); imgArray.add(R.drawable.dog); imgArray.add(R.drawable.donkey); imgArray.add(R.drawable.duck);
        imgArray.add(R.drawable.frog); imgArray.add(R.drawable.horse); imgArray.add(R.drawable.lion); imgArray.add(R.drawable.monkey); imgArray.add(R.drawable.mosquito); imgArray.add(R.drawable.pig); imgArray.add(R.drawable.rooster); imgArray.add(R.drawable.sheep);

        soundArray.add(R.raw.bee_sound); soundArray.add(R.raw.bird_sound); soundArray.add(R.raw.cat_sound); soundArray.add(R.raw.cow_sound); soundArray.add(R.raw.dog_sound);
        soundArray.add(R.raw.donkey_sound); soundArray.add(R.raw.duck_sound); soundArray.add(R.raw.frog_sound); soundArray.add(R.raw.horse_sound); soundArray.add(R.raw.lion_sound);
        soundArray.add(R.raw.monkey_sound); soundArray.add(R.raw.mosquito_sound); soundArray.add(R.raw.pig_sound); soundArray.add(R.raw.rooster_sound_1); soundArray.add(R.raw.sheep_sound);

        imgmediumArray.add(R.drawable.beemedium); imgmediumArray.add(R.drawable.birdmedium); imgmediumArray.add(R.drawable.catmedium); imgmediumArray.add(R.drawable.cowmedium); imgmediumArray.add(R.drawable.dogmedium); imgmediumArray.add(R.drawable.donkeymedium); imgmediumArray.add(R.drawable.duckmedium);
        imgmediumArray.add(R.drawable.frogmedium); imgmediumArray.add(R.drawable.horsemedium); imgmediumArray.add(R.drawable.lionmedium); imgmediumArray.add(R.drawable.monkeymedium); imgmediumArray.add(R.drawable.mosquitomedium); imgmediumArray.add(R.drawable.pigmedium); imgmediumArray.add(R.drawable.roostermedium); imgmediumArray.add(R.drawable.sheepmedium);

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
        return imgmediumArray.get(entry);
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
