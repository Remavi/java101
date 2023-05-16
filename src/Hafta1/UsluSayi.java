package Hafta1;
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        //Değişken tanımlama
        int n, a, toplam = 1;

        //Kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        a = input.nextInt();

        //For döngüsü ile üs alma
        for (int i = 1; i <= a; i++){
            toplam *= n;
        }
        System.out.println("Cevap: "+toplam);
    }
}
