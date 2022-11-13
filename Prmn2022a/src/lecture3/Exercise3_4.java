package lecture3;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> vegetables = new ArrayList<>();


        Vegetable vegetable1 = new Vegetable("にんじん",117);
        Vegetable vegetable2 = new Vegetable("たまねぎ",120);
        Vegetable vegetable3 = new Vegetable("じゃがいも",154);

        vegetables.add(vegetable1);
        vegetables.add(vegetable2);
        vegetables.add(vegetable3);

        for(int i=0;i< vegetables.size();i++){
            vegetables.get(i).print();
        }


        }
    }

