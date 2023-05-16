package Hafta1;
import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        double sonuc = 0;

        //Harmonik sayı bulma formülünü for döngüsü ile uygulama
        for(double i = 1; i<=sayi; i++){
            sonuc += (1/i);
        }
        System.out.println("Sonuç: "+sonuc);
    }
}
