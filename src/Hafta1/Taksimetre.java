package Hafta1;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //Değişken tanımlama
        double km, kmBasi = 2.20, tutar, acilis = 10;

        //Scanner tanımlama ve kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("KM değerini giriniz: ");
        km = input.nextDouble();

        //Tutar hesaplama
        tutar = acilis + (km * kmBasi);
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Gidilen KM: "+km);
        System.out.println("Açılış ücreti: "+acilis);
        System.out.println("KM başı eklenen ücret: "+kmBasi);
        System.out.println("Toplam ödenecek tutar: "+tutar);
    }
}
