package lecture02;

public class GasStation {
    public void refuel(Car car){
        car.fuel += 20;
        System.out.println("燃料を20給油");
    }
}
