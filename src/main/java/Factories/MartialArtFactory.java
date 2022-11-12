package Factories;

import AbstractClasses.MartialArt;
import Clasess.martial_arts.*;

import java.util.ArrayList;
import java.util.List;

public class MartialArtFactory {

    static ArrayList<MartialArt> martialArts = new ArrayList<>(
            List.of(
                    new Adimurai(new ArrayList<>(List.of("PirivuSuvadu", "VaalVeechu", "Varmam"))),
                    new Bajutsu(new ArrayList<>(List.of("Yoseikan", "Takeda Ryu", "Ogasawara Ryu"))),
                    new Boxing(new ArrayList<>(List.of("Uppercut", "Jab", "Lead Hook"))),
                    new Capoeira(new ArrayList<>(List.of("Aú Aberto", "Negacia", "Ginga"))),
                    new Gatka(new ArrayList<>(List.of("Katar", "Soti", "Khanda"))),
                    new Jujutsu(new ArrayList<>(List.of("Joint Lock", "Grappling", "Throwing"))),
                    new Karate(new ArrayList<>(List.of("Choku Zuki", "Age Uke", "Mawashi Geri"))),
                    new KravMaga(new ArrayList<>(List.of("Side Kick", "Headbutt", "Elbow Strike"))),
                    new TaeKwonDo(new ArrayList<>(List.of("Dollyeo Chagi", "Dwi Chagi", "Bandae Yeop Chagi"))),
                    new TaiChi(new ArrayList<>(List.of("Chen", "Yang", "Wu")))
                    )
    );

    public static ArrayList<MartialArt> getMartialArts(){
        // get 3 random numbers between 0 and 9 without repetition
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < 3){
            int randomNumber = (int) (Math.random() * 10);
            if (!randomNumbers.contains(randomNumber)){
                randomNumbers.add(randomNumber);
            }
        }
        // get 3 random martial arts
        ArrayList<MartialArt> randomMartialArts = new ArrayList<>();
        for(int i: randomNumbers){
            randomMartialArts.add(martialArts.get(i));
        }

        return randomMartialArts;
    }





}
