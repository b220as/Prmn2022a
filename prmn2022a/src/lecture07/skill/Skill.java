package lecture07.skill;

public class Skill {
    private String name;
    private int power;

    protected Skill(String name,int power){
        this.name = name;
        this.power = power;
    }

    public String getName(){
        return this.name;
    }

    public int getPower(){
        return this.power;
    }
}
