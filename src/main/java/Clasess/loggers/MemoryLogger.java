package Clasess.loggers;

import Clasess.player.Player;
import Factories.MartialArtFactory;
import Interfaces.Logger;

import java.util.ArrayList;

public class MemoryLogger implements Logger {

    ArrayList<String> log;


    public MemoryLogger(){
        log = new ArrayList<>();
    }

    public void addLog(String logMessage){
        this.log.add(logMessage);
    }

    public String getLastLog(){
        return this.log.get(this.log.size() - 1);
    }

    @Override
    public void printLogs() {
        for (String log : log) {
            System.out.println(log);
        }
    }


}
