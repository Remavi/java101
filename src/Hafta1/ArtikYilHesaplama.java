package Hafta1;
import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        //Değişken tanımlama
        int yil;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        //Artık yıl hesaplama
        if (yil % 4 == 0) {
            if (yil % 100 == 0){
                if (yil % 400 == 0){
                    System.out.println("Girilen yıl artık yıldır: "+yil);
                } else {
                    System.out.println("Girilen yıl artık yıl değildir: "+yil);
                }
            } else {
                System.out.println("Girilen yıl artık yıldır: "+yil);
            }
        } else {
            System.out.println("Girilen yıl artık yıl değildir: "+yil);
        }
    }
}
