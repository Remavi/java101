package Hafta1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcıdna veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını girin: ");
        int n = input.nextInt();
        int current= 1, previous = 0, next = current + previous;
        System.out.print(previous+ " "+ current);

        for (int i = 1; i < n; i++){
            next = current + previous;
            previous = current;
            current = next;
            System.out.print(" "+next);
        }
    }
}
