package lecture04;

public class Fighter {

    int hitPoint;
    int power;
    String name;

    //コンストラクタ
    Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter opponent){
        opponent.hitPoint -= this.power;
        System.out.println(this.name+" は "+opponent.name+" に "+this.power+" ダメージを与えた。");
    }

    public boolean isAlive(){
        if(this.hitPoint <= 0){
            return false;
        }
        return true;
    }
}
