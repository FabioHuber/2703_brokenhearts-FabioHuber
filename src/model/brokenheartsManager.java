package model;

import java.util.LinkedList;
import java.util.Random;

public class brokenheartsManager {
    Heart hearts[];

    public brokenheartsManager() {
        hearts = new Heart[10];
        for (int i = 0; i < hearts.length; i++) {
            hearts[i] = new Heart();
        }
    }

    public void toggle(int i){
        hearts[i].toggle();
    }

    public void randomToggle(){
        Random random = new Random();

        for (int i = 0; i < hearts.length; i++) {
            boolean rndm = random.nextBoolean();
            hearts[i].toggle(rndm);
        }
    }

    public boolean checkifAllHeartsAreHealed(){
        LinkedList<Boolean> list = new LinkedList<>();
        for (int i = 0; i < hearts.length; i++) {
            list.add(hearts[i].isBroken());
        }
        return !list.contains(true);
    }

    public boolean isBroken(int i){
        return hearts[i].isBroken();
    }

    public Heart[] getHearts() {
        return hearts;
    }
}
