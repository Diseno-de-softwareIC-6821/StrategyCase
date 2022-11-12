package AbstractClasses;

import Clasess.player.Player;
import Interfaces.Strategy;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class MartialArt implements Strategy {

    HashMap<Integer, String> moves = new HashMap<>();

    public MartialArt(ArrayList<String> moveNames){
        for (int i = 0; i < moveNames.size(); i++) {
            moves.put(i+1, moveNames.get(i));
        }
    }

    // Se le pasa el player para que pueda bajarle la vida
    @Override
    public void attack(Player player){
        // random int between 3 and 6
        int move = (int) ( Math.random() * (6 - 3 + 1)) + 3;

        for(int i = 0; i < move; i++){
            int randomMove = (int) ( Math.random() * (3 - 1 + 1)) + 1;
            switch (randomMove) {
                case 1 -> {
                    this.move1();
                    System.out.println(moves.get(1));
                }
                case 2 -> {
                    this.move2();
                    System.out.println(moves.get(2));
                }
                case 3 -> {
                    this.move3();
                    System.out.println(moves.get(3));
                }
                default -> {
                    System.out.println("Something went wrong");
                }
            }


        }

    };


    public abstract void move1();
    public abstract void move2();
    public abstract void move3();
}

