package Hafta1;
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        //Değişken tanımlama
        double a, b, c, cevre, alan;

        //Kullanıcıdan üçgenin dik kenar uzunluklarını alma
        Scanner input = new Scanner(System.in);
        System.out.print("1. dik kenarı giriniz: ");
        a = input.nextDouble();
        System.out.print("2. dik kenarı giriniz: ");
        b = input.nextDouble();

        //Hipotenüs, çevre ve alanın hesaplanması
        c = Math.sqrt(a*a + b*b);
        cevre = a+b+c;
        alan = a*b/2;

        //Sonuçlar
        System.out.println("Hipotenüs: "+c);
        System.out.println("Çevre: "+cevre);
        System.out.println("Alan: "+alan);
    }
}
