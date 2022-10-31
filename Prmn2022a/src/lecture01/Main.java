package lecture01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("B2211780 Ryoga nakamura");

        int a = 2211780;
        System.out.println("B"+ a +" Ryoga nakamura");

        Scanner  input = new Scanner(System.in);
        int age = input.nextInt();
        if(age < 20){
            System.out.println("I am "+age+ " years old so I cannot drink liquor");
        }else {
            System.out.println("I am "+age+" years old so I can drink liquor.");
        }

    }
}
