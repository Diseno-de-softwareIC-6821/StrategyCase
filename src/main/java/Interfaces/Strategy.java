package Interfaces;

import Clasess.player.Player;

import java.util.ArrayList;
import java.util.HashMap;

public interface Strategy {
    HashMap<String, ArrayList<String>> attack();
}
