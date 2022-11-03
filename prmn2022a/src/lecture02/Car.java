package lecture02;

public class Car {
    int fuel;
    Tire[] tires = new Tire[4];
    Engine engine;

    Car(Tire[] tires,Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    public void run(){
        if(this.fuel==0){
            System.out.println("走行不可");
        }else{
            this.fuel -= 1;
            System.out.println("燃料を1消費して走行");
        }
    }

    public void startEngine(){
        this.engine.start();
    }
}
