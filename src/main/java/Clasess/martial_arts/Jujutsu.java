package Clasess.martial_arts;

import AbstractClasses.MartialArt;

import java.util.ArrayList;

public class Jujutsu extends MartialArt {

    public Jujutsu(ArrayList<String> moveNames){
        super(moveNames);
    }

    @Override
    public ArrayList<String> move1() {
        ArrayList<String> effects = new ArrayList<>();
        effects.add("-20");
        effects.add("+5");
        return effects;
    }

    @Override
    public ArrayList<String> move2() {
        ArrayList<String> effects = new ArrayList<>();
        effects.add("-25");
        return effects;
    }

    @Override
    public ArrayList<String> move3() {
        ArrayList<String> effects = new ArrayList<>();
        effects.add("-40");
        return effects;
    }


}
