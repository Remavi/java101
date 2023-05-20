package Hafta2.DeseneGoreMetot;

import java.util.Scanner;

public class DeseneGoreMetot {
    static void recursiveOne(int number, int n){
        if (number > 0){ //Desenin ilk kısmı
            System.out.print(number+ " ");
            recursiveOne(number - 5, n);
        } else if (number <= 0) {
            recursiveTwo(number, n);
        }
    }

    static void recursiveTwo(int number, int n){
        if (n>=number){ //Desenin ikinci kısmı
            System.out.print(number+ " ");
            recursiveTwo(number+5, n);
        }
    }

    public static void main(String[] args) {
        //Kullanıcıdan veri alma
        int number, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        n = number;
        recursiveOne(number, n);
    }
}
