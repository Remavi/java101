package Hafta1;

import java.util.Scanner;

public class VucutKitleIndeks {
    public static void main(String[] args) {
        //Depişken tanımlama
        double boy, kilo, indeks;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = input.nextDouble();

        //İndeks hesaplama
        indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: "+indeks);
    }
}
