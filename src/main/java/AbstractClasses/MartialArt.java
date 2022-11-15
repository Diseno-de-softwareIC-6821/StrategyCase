package AbstractClasses;

import Clasess.player.Player;
import Interfaces.Strategy;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class MartialArt implements Strategy {
    String name;

    HashMap<Integer, String> moves = new HashMap<>();

    public MartialArt(ArrayList<String> moveNames, String name_){
        for (int i = 0; i < moveNames.size(); i++) {
            moves.put(i+1, moveNames.get(i));
        this.name = name_;
        }
    }

    public String getName() {
        return name;
    }

    // Se le pasa el player para que pueda bajarle la vida
    @Override
    public HashMap<String, ArrayList<String>> attack(){
        // random int between 3 and 6

        HashMap<String, ArrayList<String>> effects = new HashMap<>();

        int move = (int) ( Math.random() * (6 - 3 + 1)) + 3;
        System.out.println(move);
        for(int i = 0; i < move; i++){
            int randomMove = (int) ( Math.random() * (3 - 1 + 1)) + 1;
            switch (randomMove) {
                case 1 -> {

                    if(effects.get(moves.get(1)) == null){
                        effects.put(moves.get(1), move1());
                    } else {
                        effects.get(moves.get(1)).addAll(move1());
                    }

                }
                case 2 -> {
                    if(effects.get(moves.get(2)) == null){
                        effects.put(moves.get(2), move2());
                    } else {
                        effects.get(moves.get(2)).addAll(move2());
                    }

                }
                case 3 -> {
                    if(effects.get(moves.get(3)) == null){
                        effects.put(moves.get(3), move3());
                    } else {
                        effects.get(moves.get(3)).addAll(move3());
                    }

                }
                default -> {
                    System.out.println("Something went wrong");
                }
            }


        }
        return effects;

    };

    public String getMoveName(int moveNumber){
        return moves.get(moveNumber);
    }


    public abstract ArrayList<String> move1();
    public abstract ArrayList<String> move2();
    public abstract ArrayList<String> move3();
}

