package Hafta1;
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        //Değişken tnaımlama ve kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        //for döngüsü ile * kullanarak ters üçgen yapımı
        for (int i = sayi; i>=1; i--){
            for (int j = sayi-i; j > 0; j--){
                System.out.print(" ");
            }
            for (int k = (i * 2) - 1; k >= 1; k--){
                System.out.print("*");
            }
            System.out.println(); //yıldızları alt satıra aktarmak için
        }
    }
}
