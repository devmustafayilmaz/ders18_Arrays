package ders18_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10};
        System.out.println(arr1[2]);
        arr1[3]=20;
        System.out.println(arr1[3]);
        System.out.println(arr1.length);
        System.out.println(arr1[arr1.length-1]);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
            //array in uzunluğu sonradan değiştirilemez.
            //arr1[5]=35;


        }System.out.print(arr1[4]);

    }
}

