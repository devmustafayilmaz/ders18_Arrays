package ders18_Arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        String[] arr = {"ali","ulus","nesrin"};

        //bu arrayin tüm elementlerini aralarında bir bışluk bırakarak yazdıralım
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " " );
        }
        System.out.println("");
        // bu arrayi array olarak yazdıralım

        System.out.println(arr);
        // array bir onje / non primitive data olduğundan java refransını yazdirir.
        //array i array olarak yazdirmak istersek Arrays class dan yardım alabilirsiniz
        System.out.println(Arrays.toString(arr));
    }
}
