package Hafta2;

import java.util.Arrays;
import java.util.Scanner;

public class DizilerYakinBuyukKucuk {
    public static void main(String[] args) {
        //Kullanıcdan sayı alma
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list); //Girilen sayıya en yakın küçük ve büyük sayıları bulmak için önce diziyi küçükten büyüğe sıralıyoruz
        int kucukYakin;
        int buyukYakin;

        for (int i : list) { //dizideki verileri geziyoruz
            if (sayi < i) { // girilen sayıdan büyük ilk sayıyı tespit ediyoruz
                buyukYakin = i;
                System.out.println("Girilen sayıdan büyük en yakın sayı :" + buyukYakin);
                break; // ilk sayıyı tespit ettikten sonra döngüyü bitirmek için
            }
        }
        for (int i = list.length - 1; i > 0; i--) { //dizideki sayıları bu kez tersten geziyoruz
            if (sayi > list[i]) { //Girilen sayıdan küçük ilk sayıyı tespit ediyoruz
                kucukYakin = list[i];
                System.out.println("Girilen sayıdan küçük en yakın sayı :" + kucukYakin);
                break; //ilk sayıyı tespit ettikten sonra döngüyü bitirmek için
            }
        }
    }
}
