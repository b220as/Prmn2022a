package lecture02;

public class Engine {
    int rpm;

    Engine(int rpm){
        this.rpm = rpm;
    }

    public void start(){
        System.out.println("rpm = "+this.rpm+" でエンジンを始動させました");
    }
}
