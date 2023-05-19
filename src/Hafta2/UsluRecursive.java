package Hafta2;

import java.util.Scanner;

public class UsluRecursive {
    public static int power(int base, int exponent){
        Scanner input = new Scanner(System.in);
        int result = 1;

        //Üs hesaplama döngüsü
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        //Kullanıcıdan değerleri alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Taban: ");
        int base = input.nextInt();
        System.out.print("Üs: ");
        int exponent = input.nextInt();
        System.out.println("Sonuç: "+power(base, exponent));
    }
}
