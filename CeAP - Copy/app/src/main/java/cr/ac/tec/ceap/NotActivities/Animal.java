package cr.ac.tec.ceap.NotActivities;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cr.ac.tec.ceap.R;
/* README
 * La idea que tengo es que los arreglos (imgArray va a ser de imagenes, pero lo hice de strings por mientras, porque no sabia lo de los tamaños).
 * Las funciones son para que se cuando se elige una no pueda repetirse. Lo que estaba pensando es que se hagan los botones e interfaz en general para esto con
 * Java manualmente en lugar de con XML para que se pueda hacer dinamico. Ya estan todos los sonidos de los animales ligados con botones, en AnimalSounds, y suena cuando se clickean.
 * El arreglo usedArray es para ir poniendo los que ya se usaron. La idea de que retornen el numero es que se pueda mantener consistencia, y a partir de ese indice se pueda
 * mostrar la imagen/ sonido.
 * La clase Player es para la musica, ahi hice 2 funciones generales que sirven para cualquier sonido/background music. No termine de hacer todas las actividades, solo las de Animales me parece.
 *
*/
public class Animal {
    List<Integer> soundArray = new ArrayList<>();
    List<Integer> usedArray = new ArrayList<>();
    List<String> imgArray = new ArrayList<>();

    Random random;
    int score;
    public Animal() {
        random = new Random();
        imgArray.add("bee"); imgArray.add("bird"); imgArray.add("cat"); imgArray.add("cow"); imgArray.add("dog"); imgArray.add("donkey"); imgArray.add("duck");
        imgArray.add("frog"); imgArray.add("horse"); imgArray.add("lion"); imgArray.add("monkey"); imgArray.add("mosquito"); imgArray.add("pig"); imgArray.add("rooster"); imgArray.add("sheep");
        soundArray.add(R.raw.bee_sound); soundArray.add(R.raw.bird_sound); soundArray.add(R.raw.cat_sound); soundArray.add(R.raw.cow_sound); soundArray.add(R.raw.dog_sound);
        soundArray.add(R.raw.donkey_sound); soundArray.add(R.raw.duck_sound); soundArray.add(R.raw.frog_sound); soundArray.add(R.raw.horse_sound); soundArray.add(R.raw.lion_sound);
        soundArray.add(R.raw.monkey_sound); soundArray.add(R.raw.mosquito_sound); soundArray.add(R.raw.pig_sound); soundArray.add(R.raw.rooster_sound_1); soundArray.add(R.raw.sheep_sound);
        score = 0;
    }

    int chooseCorrect() {
        int rand = random.nextInt(imgArray.size() + 1); //(max - min + 1) + min (here min = 0);
        while(usedArray.contains(rand))
            rand = random.nextInt(imgArray.size() + 1); //(max - min + 1) + min (here min = 0);
        usedArray.add(rand);
        return rand;
    }

    int chooseIncorrect(int correct) {
        boolean out = false;
        int incorrect = 0;
        while(!out) {
            incorrect = random.nextInt(imgArray.size() + 1);
            if(incorrect != correct) out = true;
        }
        return incorrect;
    }


    public List<Integer> getSoundArray() {
        return soundArray;
    }

    public void setSoundArray(List<Integer> soundArray) {
        this.soundArray = soundArray;
    }

    public List<String> getImgArray() {
        return imgArray;
    }

    public void setImgArray(List<String> imgArray) {
        this.imgArray = imgArray;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
