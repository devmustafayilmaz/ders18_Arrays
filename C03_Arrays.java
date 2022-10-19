package ders18_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        /*
        array elementlerini 2 artirip bize döndğren bir method oluşturun
        eski array i yeni haliyle kaydedin.
         */
        int []  arr = {2,4,6,8};

        for (int i = 0; i < arr.length; i++) {

            arr[i] =arr[i]+2;
        }
        System.out.println(Arrays.toString(arr));
        arr=elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));



    }
    public static int[] elementleri2Artir(int [] arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i]+2;


        }return arr;

    }
}
