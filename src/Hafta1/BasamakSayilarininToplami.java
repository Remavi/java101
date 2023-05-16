package Hafta1;
import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {
        //Değişken tanımlama
        int sayi, basamakSayisi = 0, basamakDegeri, basamakToplami = 0;

        //Kullanıcıdan sayı alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();
        int geciciSayi = sayi; //Sayımızı kaybetmemek için geçici değere atıyoruz

        //Basamaklar toplamını bulmamızı sağlayan while döngüsü
        while (geciciSayi != 0){
            basamakDegeri = geciciSayi % 10;
            basamakToplami += basamakDegeri;
            geciciSayi /= 10;
            basamakSayisi++;
        }
        System.out.println(basamakSayisi+" basamaklı "+sayi+" sayısının basamaklar toplamı: "+basamakToplami);
    }
}
