package Hafta1;
import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımla
        double tutar, kdvTutar, kdvMiktar, kdvOran;

        //Scanner sınıfını tanımlama ve Kullanıcıdan tutar alma
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat giriniz: ");
        tutar = input.nextDouble();

        //KDV tutarını hesaplama
        kdvOran = (tutar >= 1000) ? 0.08 : 0.18;
        kdvMiktar = tutar * kdvOran;
        kdvTutar = tutar + kdvMiktar;

        // Sonuçlar
        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV oranı: "+kdvOran);
        System.out.println("KDV miktarı: "+kdvMiktar);
        System.out.println("KDV'li tutar: "+kdvTutar);
    }
}
