package Hafta1;
import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        //Değişken tanımlama
        int r, alfa;
        double alan, pi = 3.14;

        //Kullanıcıdan daire yarıçapı ve merkez açısının bilgisini alma
        Scanner input = new Scanner(System.in);
        System.out.print("Daire yarıçapı: ");
        r = input.nextInt();
        System.out.print("Daire merkez açısı: ");
        alfa = input.nextInt();

        //Dairenin alanını hesaplama
        alan = (pi * (r*r) * alfa) / 360;
        System.out.println("Daire diliminin alanı: "+alan);
    }
}
