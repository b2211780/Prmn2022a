package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        int rpm = 4000;
        Engine engine = new Engine(rpm);
        Tire[] tires = new Tire[4];

        Car car = new Car(tires,engine);
        GasStation gas = new GasStation();

        car.run();
        gas.refuel(car);
        car.run();
    }
}
