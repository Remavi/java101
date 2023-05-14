package Hafta1;
import java.util.Scanner;

public class UcakBiletiFiyati {
    public static void main(String[] args) {
        //Değişken tanımlama
        int yolculukTipi, yas;
        double mesafe, ucret;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi girin: ");
        mesafe = input.nextDouble();
        System.out.print("Yaşınızı girin: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipi: \n1- Tek yön\n2-Gidiş-dönüş");
        yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            ucret = mesafe * 0.10;
            if (yas < 12) {
                ucret /= 2;
            } else if ( yas < 24) {
                ucret *= 0.9;
            } else if (yas > 65) {
                ucret *= 0.7;
            }
            if (yolculukTipi == 2) {
                ucret *= 0.8;
                ucret *= 2;
            }
            System.out.println("Ücret: "+ucret+" TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
