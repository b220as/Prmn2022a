package lecture04;

public class Fighter {

    private int hitPoint;
    private final int power;
    private final String name;

    //コンストラクタ
    Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    //攻撃
    public void attack(Fighter enemy){
        enemy.hitPoint -= this.power;
        System.out.println(this.name+" は "+enemy.name+" に "+this.power+" ダメージを与えた。");
    }

    //生存判定
    public boolean isAlive(){
        return this.hitPoint > 0;
    }

    //HP取得
    public int getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(/*int hitPoint*/){
        System.out.println(this.name+" の残り hitPoint : "+this.hitPoint);
        if(! this.isAlive()){
            System.out.println(this.name+" は倒れた。");
            System.exit(0);
        }
    }

    //name取得
    public String getName(){
        return this.name;
    }
}
