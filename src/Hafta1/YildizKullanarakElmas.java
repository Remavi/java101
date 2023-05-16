package Hafta1;
import java.util.Scanner;

public class YildizKullanarakElmas {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        //For döngüsü kullanarak yıldızlarla elmas yapma
        for (int satir = 1; satir <= sayi; satir++){
            for (int bosluk = 1; bosluk <= sayi-satir; bosluk++){
                System.out.print(" ");
            }
            for (int sutun = 1; sutun <= (satir*2)-1; sutun++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int satir = sayi-1; satir >= 0; satir--) {
            for (int bosluk = sayi-satir; bosluk >= 1; bosluk--) {
                System.out.print(" ");
            }
            for (int sutun = (satir*2)-1; sutun >= 1; sutun--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
