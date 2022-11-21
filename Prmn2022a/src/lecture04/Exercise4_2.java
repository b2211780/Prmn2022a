package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();


        atm.registerAccount("中村涼雅","2211780");
        atm.existAccount("中村涼雅","2211780");
        atm.deposit("2211780",1000);
        atm.deposit("2211780",1000);
        atm.withdraw("2211780",2000);
        atm.withdraw("2211780",500);
    }
}
