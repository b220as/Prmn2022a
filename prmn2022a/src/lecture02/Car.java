package lecture02;

public class Car {
    int fuel;

    Car(){
        this.fuel = 0;
    }

    public void run(){
        if(this.fuel==0){
            System.out.println("走行不可");
        }else{
            this.fuel -= 1;
            System.out.println("燃料を1消費して走行");
        }
    }
}
