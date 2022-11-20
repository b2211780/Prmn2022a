package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(210, 100, "fighter1");
        Fighter fighter2 = new Fighter(180, 150, "fighter2");

        while (true) {
            fighter1.attack(fighter2);
            fighter2.setHitPoint(fighter2.getHitPoint());

            if (fighter2.isAlive()) {
                System.out.println(fighter2.getName() + "は倒れた");
                break;
            }


            fighter2.attack(fighter1);
            fighter1.setHitPoint(fighter1.getHitPoint());

            if (fighter1.isAlive()) {
                System.out.println(fighter2.getName() + "は倒れた");
                break;
            }
        }
    }
}
