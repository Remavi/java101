package Hafta1;
import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcıdan veri alma
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        //Döngü ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdırma
        //Döngü başlangıcı minimum kuvvetten başladı
        for (int i = 4; i <= sayi; i*=4) {
            System.out.println("Dördün kuvvetleri "+ i);
        }
        for (int i = 5; i <= sayi; i*=5) {
            System.out.println("Beşin kuvvetleri "+ i);
        }
    }
}
