package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("小数値を入力してください");
        System.out.print(">");
        try{
            double number = scanner.nextDouble();

            System.out.println("入力した値:"+number);
        }catch (InputMismatchException e){
            System.out.println("エラー");
        }
    }
}
