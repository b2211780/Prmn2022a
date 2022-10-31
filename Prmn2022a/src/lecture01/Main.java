package lecture01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("B2211780 Ryouga nakamura");

        int a = 2211780;
        System.out.println("B" + a + " Ryouga nakamura");

        Scanner input = new Scanner(System.in);
        System.out.println("年齢を入力");
        int age = input.nextInt();
        if (age < 20) {
            System.out.println("I am " + age + " years old so I cannot drink liquor");
        } else {
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }
        int[] array = new int[100];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if ((i + 1) % 2 == 0) {
                sum = sum + (i + 1);
            }
        }
        System.out.println(sum);

        int[] score = {41, 85, 72, 38, 80};

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 90) {
                System.out.println(i + "番 " + score[i] + "点 " + " 秀");
            } else if (score[i] >= 80) {
                System.out.println(i + "番 " + score[i] + "点 " + " 優");
            } else if (score[i] >= 70) {
                System.out.println(i + "番 " + score[i] + "点 " + " 良");
            } else if (score[i] >= 60) {
                System.out.println(i + "番 " + score[i] + "点 " + " 可");
            } else {
                System.out.println(i + "番 " + score[i] + "点 " + " 不可");
            }
        }
        System.out.println("・・・・・・");

        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最低点:" + min(score) + "点");
        System.out.println("平均点:" + average(score) + "点");

    }

    static int max(int[] score) {
        int max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }

    static int min(int[] score) {
        int min = score[0];
        for (int i = 1; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    static double average(int[] score) {
        double c;
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        c = sum/ score.length;
        return c;
    }
}

