package Clasess.player;

import AbstractClasses.MartialArt;

import java.util.ArrayList;

public class Player {
    // array of 3 martial arts
    String name;
    ArrayList<MartialArt> martialStrategies;
    int health;

    public Player(String name, ArrayList<MartialArt> martialStrategies) {
        this.name = name;
        this.martialStrategies = martialStrategies;
        this.health = 200;
    }

    public void printStrategies(){
        for (MartialArt martialArt : martialStrategies) {
            System.out.println(martialArt.getClass().getSimpleName());
        }
    }

    public void attack(Player player, int martialArtIndex){
        martialStrategies.get(martialArtIndex).attack(player);
    }

    public void randomAttack(Player player){
        int randomIndex = (int) (Math.random() * (2 + 1));
        martialStrategies.get(randomIndex).attack(player);
    }

}

