package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        for(int i=0;i< tires.length;i++){
            tires[i] = new Tire(64);
        }

        Engine engine = new Engine(400);
        Car car = new Car(tires,engine);
        GasStation gasStation = new GasStation();
        gasStation.refuel(car);
        car.startEngine();
        car.run();
    }
}
