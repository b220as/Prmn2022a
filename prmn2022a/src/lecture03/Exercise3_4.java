package lecture03;

import java.util.ArrayList;
import java.util.List;

public class Exercise3_4 {
    public static void main(String[] args) {
        List<Vegetable> vegetables = new ArrayList<Vegetable>();

        Vegetable carrot = new Vegetable("にんじん",117);
        vegetables.add(carrot);

        Vegetable onion = new Vegetable("たまねぎ",120);
        vegetables.add(onion);

        Vegetable potato = new Vegetable("じゃがいも",154);
        vegetables.add(potato);

        for(Vegetable vegetable:vegetables){
            vegetable.print();
        }
    }

}
