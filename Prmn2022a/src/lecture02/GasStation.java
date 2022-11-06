package lecture02;

public class GasStation {

    Car car = new Car();
    void refuel (Car car){
        car.fuel = 20+car.fuel;
        System.out.println("燃料が20給油されました");
    }
}
