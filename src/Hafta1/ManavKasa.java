package Hafta1;
import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        //Değişken tanımlama
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5,
                armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, toplam;

        //Kullanıcıdan kg bilgisi alma
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kg armut: ");
        armutKilo = input.nextDouble();
        System.out.print("Kaç kg elma: ");
        elmaKilo = input.nextDouble();
        System.out.print("Kaç kg domates: ");
        domatesKilo = input.nextDouble();
        System.out.print("Kaç kg muz: ");
        muzKilo = input.nextDouble();
        System.out.print("Kaç kg patlıcan: ");
        patlicanKilo = input.nextDouble();

        //Sonuç
        toplam = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat) + (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);
        System.out.println("Toplam tutar: "+toplam+" TL");
    }
}
