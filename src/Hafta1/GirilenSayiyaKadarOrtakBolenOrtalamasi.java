package Hafta1;
import java.util.Scanner;

public class GirilenSayiyaKadarOrtakBolenOrtalamasi {
    public static void main(String[] args) {
        //Kullanıcıdan değer alma ve değişken tanımlama
        int sayi, ortalama, toplam = 0, sayiAdet = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        //Kullanıcıdan alınan sayıya kadar hangi sayıların 3 ve 4'e bölündüğünü kontrol etme ve döngü.
        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayiAdet++;
                toplam+=i;
                //Girilen sayıya kadar hangi sayılar 3 ve 4'e bölünüyor görmek için
                System.out.println(i);
            }
        }
        if (sayiAdet != 0) {
            ortalama = toplam / sayiAdet;
            System.out.println(sayi + " sayısına kadar 3 ve 4'e bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("Sıfırdan girdiğiniz sayıya kadar 3 ve 4 ortak bölenine sahip bir sayı yok!");
        }
    }
}
