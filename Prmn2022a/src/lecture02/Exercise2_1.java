package lecture02;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("名前を入力してください");
        String name = input.next();
        System.out.println("歳を入力してください");
        int age = input.nextInt();

        Human human = new Human(name, age);

        String posi = human.agechecker(age);

        System.out.print(posi + ":");
        human.print();

    }
}
