package lecture02;

public class Car {
    int fuel;
    int rpm;
    Tire[] tires = new Tire[4];
    Engine engine ;

    Car(Tire[] tires,Engine engine) {
        this.tires = tires;
        this.engine = engine;
        this.fuel = 0;
    }
    void run (){
        if(fuel<=0){
            System.out.println("燃料がないので走れません");
        }else if(0<fuel){
            fuel--;
            System.out.println("燃料を1消費して走りました");
        }
    }

     void startEngine(){
        Engine engine = new Engine(400);
        engine.start();
     }
}
