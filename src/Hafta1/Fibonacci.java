package Hafta1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcıdna veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını girin: ");
        int sayi = input.nextInt();
        int suan= 1, onceki = 0, sonraki = suan + onceki;
        System.out.print(onceki+ " "+ suan);

        for (int i = 1; i < sayi; i++){
            sonraki = suan + onceki;
            onceki = suan;
            suan = sonraki;
            System.out.print(" "+sonraki);
        }
    }
}
