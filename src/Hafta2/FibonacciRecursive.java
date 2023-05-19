package Hafta2;

import java.util.Scanner;

public class FibonacciRecursive {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını girin: ");
        int n = input.nextInt();
        System.out.println(fib(n));
    }
}
