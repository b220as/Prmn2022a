package lecture07.monster;

import lecture07.skill.Skill;

import java.util.ArrayList;
import java.util.List;

public class Monster implements IMonster {
    private String name;
    private HP hp = new HP();
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills = new ArrayList<>(3);

    protected Monster(String name,int hp,int power,int defense,int speed,List<Skill> skills){
        this.name = name;
        this.hp.setHP(hp);
        this.power = power;
        this.defense = defense;
        this.speed = speed;
        this.skills = skills;
    }
    protected Monster(Monster monster){
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int getHP(){
        return this.hp.getHP();
    }
    @Override
    public void setHP(int hp){
        this.hp.setHP(hp);
    }
    @Override
    public int getPower(){
        return this.power;
    }
    @Override
    public int getDefense() {
        return defense;
    }
    @Override
    public boolean isAlive(){
        return this.hp.isAlive();
    }
}
