package Hafta1;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;

        for (int i = 1; i<sayi; i++){ //sayının kendisi hariç çarpanlarını bulup topluyoruz
            if (sayi % i == 0){
                toplam += i;
            }
        }

        if (toplam == sayi){ //Girilen sayının kendisi hariç çarpanları toplamı kendisine eşit mi kontrol ediyoruz
            System.out.println(sayi+ " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi+" bir mükemmel sayı değildir.");
        }
    }
}
