package lecture07.monster;

import lecture07.skill.Skill;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Imonster{
    private String name;
    private HP hp;
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills = new ArrayList<>(3);

    Monster(String name,int hp,int power,int defense,int speed,List<Skill> skills){
        this.name = name;
        this.hp.setHP(hp);
        this.power = power;
        this.defense = defense;
        this.speed = speed;
        this.skills = skills;
    }
    Monster(Monster monster){
    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.hp.getHP();
    }

    public void setHP(int hp){
        this.hp.setHP(hp);
    }

    public int getPower(){
        return this.power;
    }

    public int getDefense() {
        return defense;
    }

    public boolean isAlive(){
        return this.hp.isAlive();
    }
}
