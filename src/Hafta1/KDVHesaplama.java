package Hafta1;
import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        //Değişkenleri tanımla
        double tutar, kdvtutar, kdvmiktar, kdvoran;

        //Scanner sınıfını tanımlama ve Kullanıcıdan tutar alma
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat giriniz: ");
        tutar = input.nextDouble();

        //KDV tutarını hesaplama
        kdvoran = (tutar >= 1000) ? 0.08 : 0.18;
        kdvmiktar = tutar * kdvoran;
        kdvtutar = tutar + kdvmiktar;

        // Sonuçlar
        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV oranı: "+kdvoran);
        System.out.println("KDV miktarı: "+kdvmiktar);
        System.out.println("KDV'li tutar: "+kdvtutar);
    }
}
