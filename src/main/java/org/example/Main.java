package org.example;

import AbstractClasses.MartialArt;
import Clasess.loggers.MemoryLogger;
import Clasess.martial_arts.Karate;
import Clasess.player.Player;
import Factories.MartialArtFactory;
import Interfaces.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Logger logger = new MemoryLogger();

        Player player1 = new Player.PlayerBuilder()
                .setName("Player 1")
                .setMartialArts(MartialArtFactory.getMartialArts())
                .setLoggerService(logger)
                .build();

        Player player2 = new Player.PlayerBuilder()
                .setName("Player 2")
                .setMartialArts(MartialArtFactory.getMartialArts())
                .setLoggerService(logger)
                .build();

        while (player1.getHealth() > 0 && player2.getHealth() > 0){
            player1.randomAttack(player2);
            player2.randomAttack(player1);
        }

        if(player1.getHealth() > player2.getHealth()){
            System.out.println(player1.getName() + " won!");
        }else{
            System.out.println(player2.getName() + " won!");
        }

        logger.printLogs();


    }
}