package Hafta2.DizidekiElemanlariSiralama;
import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizide kaç eleman olsun: "); //Kullanıcıdan eleman sayısını alma
        int n = input.nextInt();
        int[] list = new int[n]; //Kullanıcıdan alınan sayı kadar elemanı olan dizi oluşturma

        for (int i = 0; i < list.length; i++) { //Eleman sayısı kadar kullanıcıdan sayı alma
            System.out.print((i + 1) + ". sayı: ");
            list[i] = input.nextInt(); //Alınan sayıları diziye ekleme
        }
        Arrays.sort(list); //Diziyi sıralama
        System.out.println(Arrays.toString(list)); //Diziyi yazdırma
    }
}
