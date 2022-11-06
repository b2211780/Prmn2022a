package lecture02;

public class GasStation {
    int rpm = 4000;
    Tire[] tires = new Tire[4];

    Engine engine = new Engine(rpm);
    Car car = new Car(tires,engine);
    void refuel (Car car){
        car.fuel = 20+car.fuel;
        System.out.println("燃料が20給油されました");
    }
}
