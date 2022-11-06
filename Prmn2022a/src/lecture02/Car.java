package lecture02;

public class Car {
    int fuel;

    Car(){
        this.fuel =0;
    }
    void run (){
        if(fuel<=0){
            System.out.println("燃料がないので走れません");
        }else if(0<fuel){
            fuel--;
            System.out.println("燃料を1消費して走りました");
        }
    }
}
