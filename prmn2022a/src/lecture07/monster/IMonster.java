package lecture07.monster;

public interface IMonster {
    String getName();
    int getHP();
    void setHP(int hp);
    int getPower();
    int getDefense();
    boolean isAlive();
}
