package lecture04;

import java.util.ArrayList;
import java.util.List;

public class Exercise4_1 {
    public static void main(String[] args) {
        List<Fighter> fighters = new ArrayList<>();
        fighters.add(new Fighter(300,65,"一郎"));
        fighters.add(new Fighter(200,80,"二郎"));

        while(fighters.get(0).isAlive() && fighters.get(1).isAlive()){

            fighters.get(0).attack(fighters.get(1));
            fighters.get(1).setHitPoint();

            fighters.get(1).attack(fighters.get(0));
            fighters.get(0).setHitPoint();

        }
    }


}
