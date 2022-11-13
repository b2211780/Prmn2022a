package lecture3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("何行分入力しますか?");
        System.out.print(">");
        int gyou = scanner.nextInt();

        ArrayList<String> moji = new ArrayList<>();
        for(int i=0;i<gyou;i++){
            System.out.println((i+1)+"行目:");
            System.out.print(">");
            String a = scanner.next();
            moji.add(a);
        }
        System.out.println("入力した文字列:");
        for(int i=0;i<gyou;i++) {
            System.out.println("["+i+"]" + moji.get(i));
        }
    }


}
