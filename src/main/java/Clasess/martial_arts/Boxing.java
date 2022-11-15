package Clasess.martial_arts;

import AbstractClasses.MartialArt;

import java.util.ArrayList;

public class Boxing extends MartialArt {
    public Boxing(ArrayList<String> moveNames){
        super(moveNames,"Boxing");
    }

    @Override
    public ArrayList<String> move1() {
        ArrayList<String> effects = new ArrayList<>();
        effects.add("-15");
        return effects;
    }

    @Override
    public ArrayList<String> move2() {
        ArrayList<String> effects = new ArrayList<>();
        effects.add("-30");
        return effects;
    }

    @Override
    public ArrayList<String> move3() {
        ArrayList<String> effects = new ArrayList<>();
        int random = (int) (Math.random() * 100);
        effects.add("-25");
        if (random <= 25) {
            effects.add("+10");
        }

        return effects;
    }


}
