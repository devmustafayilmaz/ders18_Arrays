package ders18_Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        /* verilen bir arrayde istenen bir elemanın var olup
        olmadığını ve varsa kaç kere kullanıldığını
        yazdiran bir method oluşturun.

         */

        int [] arr={1,2,4,5,3,6,7,4,2,3,5,1,3,2};
        int arananEleman=2;
        elemanAra(arr,arananEleman);

    }

    public static void elemanAra(int[]arr,int arananEleman){

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananEleman){
                count++;
            }
        }if(count==0){
            System.out.println("aranan elemam bu array de yoktur...");
        }else{
            System.out.println("aranan eleman : "+arananEleman+" sayisi arrayde "+count+" kez kullanılmıştır..");
        }

    }




}
