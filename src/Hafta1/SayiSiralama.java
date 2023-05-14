package Hafta1;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        //Değişken tanımlama
        int a, b, c;

        //Kullanıcıdan sayı alma
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        a = input.nextInt();
        System.out.print("İkinci sayı: ");
        b = input.nextInt();
        System.out.print("Üçüncü sayı: ");
        c = input.nextInt();

        //if else ike büyüklük küçüklük karşılaştırması yapma
        if ((a < b) && (a < c)) {
            if (b < c){
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            if (a < b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        }
    }
}
