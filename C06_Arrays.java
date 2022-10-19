package ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {
    public static void main(String[] args) {
        //kullanıcaıdan array alıp array in boyutunu ve elementlerini alıp bize döndüren bir method oluşturun.

        int[] kullaniciArrayi=arrayOlustur();

        System.out.println(Arrays.toString(kullaniciArrayi));

    }
    public static int[]arrayOlustur(){

        Scanner scan=new Scanner(System.in);
        System.out.println("oluşturulacak array in boyutunu giriniz:");

        int lenght=scan.nextInt();

        int[]kullaniciArrayi=new int[lenght];
        for (int i = 0; i < lenght ; i++) {
            System.out.println("Array eklenecek bir sayi giriniz:");
            kullaniciArrayi[i]=scan.nextInt();
        }
        return kullaniciArrayi;
    }
}
