package Clasess.player;

import AbstractClasses.MartialArt;
import Clasess.loggers.MemoryLogger;
import Factories.MartialArtFactory;
import Interfaces.Logger;

import java.util.ArrayList;

public class Player {
    // array of 3 martial arts
    String name;
    ArrayList<MartialArt> martialStrategies;
    int health;

    Logger loggerService;

    public Player(String name, ArrayList<MartialArt> martialStrategies, int health,Logger loggerService) {
        this.name = name;
        this.martialStrategies = martialStrategies;
        this.health = health;
        this.loggerService = loggerService;
    }

    public void printStrategies(){
        for (MartialArt martialArt : martialStrategies) {
            System.out.println(martialArt.getClass().getSimpleName());
        }
    }

    public void attack(Player player, int martialArtIndex){

        martialStrategies.get(martialArtIndex).attack().forEach((key, value) -> {

            int totalDamage = 0;
            int totalHeal = 0;

            for(String number : value){
                if(number.contains("-")){
                    totalDamage += Integer.parseInt(number);
                }else if(number.contains("+")){
                    totalHeal += Integer.parseInt(number);
                }
            }

            player.receiveDamage(totalDamage);
            this.health += totalHeal;

            String log = this.name + " used " + key + " on " + player.getName() + " and dealt" + totalDamage + " damage and healed " + totalHeal + " health";
            this.loggerService.addLog(log);


        });
    }

    public void randomAttack(Player player){
        int randomIndex = (int) (Math.random() * (2 + 1));
        martialStrategies.get(randomIndex).attack().forEach((key, value) -> {

            int totalDamage = 0;
            int totalHeal = 0;

            for(String number : value){
                if(number.contains("-")){
                    totalDamage += Integer.parseInt(number);
                }else if(number.contains("+")){
                    totalHeal += Integer.parseInt(number);
                }
            }

            player.receiveDamage(totalDamage);
            this.health += totalHeal;

            String log = this.name + " used " + key + " on " + player.getName() + " and dealt " + totalDamage + " damage and healed " + totalHeal + " health";
            this.loggerService.addLog(log);


        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MartialArt> getMartialStrategies() {
        return martialStrategies;
    }

    public void setMartialStrategies(ArrayList<MartialArt> martialStrategies) {
        if(martialStrategies.size() > 3){
            System.out.println("You can only have 3 martial arts");
        } else {
            this.martialStrategies = martialStrategies;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void receiveDamage(int damage){
        this.health -= Math.abs(damage);
    }

    public static class PlayerBuilder{
        String name;
        ArrayList<MartialArt> martialStrategies;
        int health;
        Logger loggerService;

        public PlayerBuilder() {
            this.name = "default";
            this.martialStrategies = new ArrayList<>();
            this.health = 200;
            this.loggerService = new MemoryLogger();
        }

        public PlayerBuilder setName(String name){
            this.name = name;
            return this;
        }
        public PlayerBuilder setMartialArts(ArrayList<MartialArt> martialStrategies){
            if (this.martialStrategies.size() > 3){
                System.out.println("You can only have 3 martial arts");
            } else {
                this.martialStrategies = MartialArtFactory.getMartialArts();
            }
            return this;
        }

        public PlayerBuilder setHealth(int health){
            this.health = health;
            return this;
        }

        public PlayerBuilder setLoggerService(Logger loggerService){
            this.loggerService = loggerService;
            return this;
        }
        public Player build(){
            return new Player(this.name, this.martialStrategies, this.health, this.loggerService);
        }
    }

}

