package org.example;

import AbstractClasses.MartialArt;
import Clasess.martial_arts.Karate;
import Clasess.player.Player;
import Factories.MartialArtFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Player 1", MartialArtFactory.getMartialArts());
        Player player2 = new Player("Player 2", MartialArtFactory.getMartialArts());

        player1.randomAttack(player2);
    }
}