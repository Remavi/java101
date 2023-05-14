package Hafta1;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        //Değişken tanımlama
        int n1, n2, secim;

        //Kullanıcıdan sayı alma
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        //Seçim yaptırma
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        System.out.print("Seçiminiz: ");
        secim = input.nextInt();

        //Switch ile gösterim
        switch (secim) {
            case 1:
                System.out.println("Toplama: "+ (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: "+ (n1 - n2));
                break;
            case 3 :
                System.out.println("Çarpma: "+ (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme: "+ (n2 != 0 ? (n1 / n2) : "Bir sayı sıfıra bölünemez. Tekrar deneyin."));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
