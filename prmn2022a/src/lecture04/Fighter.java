package lecture04;

public class Fighter {

    private int hitPoint;
    private int power;
    private final String name;

    //コンストラクタ
    Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.hitPoint -= this.power;
        System.out.println(this.name+" は "+enemy.name+" に "+this.power+" ダメージを与えた。");
    }

    public boolean isAlive(){
        return this.hitPoint > 0;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    //何に使うか不明
    public void setHitPoint(int hitPoint){

    }

    public String getName(){
        return this.name;
    }
}
