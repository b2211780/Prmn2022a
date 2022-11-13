package lecture3;

import java.util.Scanner;

public class Exercise3_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("任意の文字列を入力してください:");
            System.out.print(">");
            String moji = scanner.nextLine();
            System.out.println("”"+moji+"”"+"と入力されました");
        }
}
