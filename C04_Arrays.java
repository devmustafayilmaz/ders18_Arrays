package ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        /*
        Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
         */
        int[]arr={3,-3,5,-7,-6,1,-2};

        System.out.println(sayilarinToplami(arr));


    }
    public static int sayilarinToplami(int[]arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                 toplam +=arr[i];
            }
        }

      return toplam;


    }




}