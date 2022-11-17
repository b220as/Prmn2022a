package lecture07.monster;

public class HP {
    private int hp;
    private static int dead = 0;

    public boolean isAlive(){
        return hp > 0;
    }

    public int getHP(){
        return this.hp;
    }

    //methodの追加
    public void setHP(int hp){
        this.hp = hp;
    }
}
