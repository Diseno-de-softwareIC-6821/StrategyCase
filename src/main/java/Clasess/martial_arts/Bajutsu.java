package Clasess.martial_arts;

import AbstractClasses.MartialArt;

import java.util.ArrayList;

public class Bajutsu extends MartialArt {

    public Bajutsu(ArrayList<String> moveNames){
        super(moveNames,"Bajutsu");
    }

    @Override
    public ArrayList<String> move1() {
        ArrayList<String> effects = new ArrayList<>();
        effects.add("-20");
        return effects;
    }

    @Override
    public ArrayList<String> move2() {
        ArrayList<String> effects = new ArrayList<>();
        effects.add("-10");
        return effects;

    }

    @Override
    public ArrayList<String> move3() {
        //random number between 1 and 100
        ArrayList<String> effects = new ArrayList<>();
        int random = (int) (Math.random() * 100);
        if (random <= 25) {
            effects.add("-30");
            effects.add("+10");
        }
        effects.add("-10");

        return effects;

    }


}
