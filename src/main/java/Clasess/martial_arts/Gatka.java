package Clasess.martial_arts;

import AbstractClasses.MartialArt;

import java.util.ArrayList;

public class Gatka extends MartialArt {
    public Gatka(ArrayList<String> moveNames) {
        super(moveNames,"Gatka");
    }

    @Override
    public ArrayList<String> move1() {
        ArrayList<String> effects = new ArrayList<>();
        //random between 0 and 100
        int random = (int) (Math.random() * 100);
        if (random <= 50) {
            effects.add("-10");
        }
        effects.add("-20");
        return effects;
    }

    @Override
    public ArrayList<String> move2() {
        ArrayList<String> effects = new ArrayList<>();
        effects.add("-20");
        return effects;
    }

    @Override
    public ArrayList<String> move3() {
        ArrayList<String> effects = new ArrayList<>();
        int random = (int) (Math.random() * 100);
        if(random <= 10){
            effects.add("-40");
        }
        effects.add("-10");
        return effects;
    }
}
