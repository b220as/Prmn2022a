package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(300,65,"Fighter1");
        Fighter fighter2 = new Fighter(200,80,"Fighter2");

        while(fighter1.isAlive() && fighter2.isAlive()){

            fighter1.attack(fighter2);
            System.out.println(fighter2.name+" の残り hitPoint : "+fighter2.hitPoint);
            if(! fighter2.isAlive()){
                System.out.println(fighter2.name+" は倒れた。");
                break;
            }

            fighter2.attack(fighter1);
            System.out.println(fighter1.name+" の残り hitPoint : "+fighter1.hitPoint);
            if(! fighter1.isAlive()){
                System.out.println(fighter1.name+" は倒れた。");
                break;
            }

        }
    }


}
