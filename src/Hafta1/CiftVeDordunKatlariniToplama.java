package Hafta1;
import java.util.Scanner;

public class CiftVeDordunKatlariniToplama {
    public static void main(String[] args) {
        //Değişken tanımlama
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);

        do{
            //Kullanıcıdan sayı alma
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();

            //Sayıların çift ve dördün katı olup olmadığını kontrol etme
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                System.out.println(sayi+" çift ve 4'ün katı");
                toplam+=sayi;
            }
        } while (sayi % 2 == 0);
        System.out.println("Toplam: "+ toplam);
    }
}
