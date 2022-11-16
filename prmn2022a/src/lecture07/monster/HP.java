package lecture07.monster;

public class HP {
    private int hp;
    private int dead = 0;

    public boolean isAlive(){
        return hp > 0;
    }

    public int getHP(){
        return this.hp;
    }
}
