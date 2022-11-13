package lecture3;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1つ目の整数を入力してください:");
        System.out.print(">");
        String a = scanner.next();
        System.out.println("2つ目の整数を入力してください:");
        System.out.print(">");
        String b = scanner.next();

        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int e = c+d;
        System.out.print(a+"+"+b+"="+e);



    }
}
