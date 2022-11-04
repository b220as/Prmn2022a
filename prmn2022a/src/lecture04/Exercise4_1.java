package lecture04;

import java.util.ArrayList;
import java.util.List;

public class Exercise4_1 {
    public static void main(String[] args) {
        List<Fighter> fighters = new ArrayList<Fighter>();
        fighters.add(new Fighter(300,65,"一郎"));
        fighters.add(new Fighter(200,80,"二郎"));

        while(fighters.get(0).isAlive() && fighters.get(1).isAlive()){

            fighters.get(0).attack(fighters.get(1));
            System.out.println(fighters.get(1).getName()+" の残り hitPoint : "+fighters.get(1).getHitPoint());
            if(! fighters.get(1).isAlive()){
                System.out.println(fighters.get(1).getName()+" は倒れた。");
                break;
            }

            fighters.get(1).attack(fighters.get(0));
            System.out.println(fighters.get(0).getName()+" の残り hitPoint : "+fighters.get(0).getHitPoint());
            if(! fighters.get(0).isAlive()){
                System.out.println(fighters.get(1).getName()+" は倒れた。");
                break;
            }

        }
    }


}
