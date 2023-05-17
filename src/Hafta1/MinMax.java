package Hafta1;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        int enBuyuk = Integer.MIN_VALUE, enKucuk = Integer.MAX_VALUE, sayi;

        //for döngüsü kullanarak kullanıcıdan n tane sayı alma
        if (n >= 2) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ". sayıyı giriniz: ");
                sayi = input.nextInt();

                //Sayıları karşılaştırma
                if (sayi > enBuyuk){
                    enBuyuk = sayi;
                }
                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }
            System.out.println("En büyük sayı: "+enBuyuk +"\n" +
                    "En küçük sayı: "+enKucuk);
        } else if (n >= 1){ //Kullanıcı bir sayı girerse uyarı
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();
            System.out.println(sayi+ " sayısını girdiniz. Bir sayı girdiğiniz için karşılaştırma yapılamıyor.");
        } else { //Kullanıcı geçersiz sayı girerse uyarı
            System.out.println("Geçersiz sayı girdiniz.");
        }
    }
}
