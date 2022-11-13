package Clasess.martial_arts;

import AbstractClasses.MartialArt;

import java.util.ArrayList;

public class Capoeira extends MartialArt {

    public Capoeira(ArrayList<String> moveNames){
        super(moveNames);
    }

    @Override
    public ArrayList<String> move1() {
        ArrayList<String> effects = new ArrayList<>();

        effects.add("-28");
        effects.add("+10");

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
        ArrayList<String> effects = new ArrayList<>();

        effects.add("-25");

        return effects;
    }


}
