package Hafta1;

public class AsalSayilar {
    public static void main(String[] args) {
        //for döngüsü ile asal sayıları tespit etme
        for (int i = 2; i <= 100; i++){ //1'den 100'e kadar sayıları artırıyoruz
            int k;
            for (k = 2; k < i; k++){ //Artan sayılardan asal olanları tespit etmek için
                if (i % k ==0){
                    break;
                }
            }
            if (i == k){
                System.out.print(k+" ");
            }
        }
    }
}
