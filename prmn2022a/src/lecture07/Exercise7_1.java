package lecture07;

import lecture07.monster.Penguin;

public class Exercise7_1 {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        System.out.println("Penguinをインスタンス化");
        System.out.println("name:"+penguin.getName());
        System.out.println("HP:"+penguin.getHP());
        System.out.println("power:"+penguin.getPower());
        System.out.println("defense"+penguin.getDefense());
    }
}
