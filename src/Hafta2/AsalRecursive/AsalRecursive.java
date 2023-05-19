package Hafta2.AsalRecursive;
import java.util.Scanner;

public class AsalRecursive {
    static boolean isPrime(int number, int divisor) {
        if (number < 2){ //En küçük asal sayı 2'dir.
            return false;
        } else if( number == 2){ //En küçük asal sayı 2'dir.
            return true;
        } else if (number % divisor == 0){ //Tam bölündüyse asal değildir.
            return false;
        } else if (divisor * divisor > number){ //Bir sayıyı bölebilen bütün asal asal sayılar kendisinin karekökünden küçüktür.
            return true;
        }
        return isPrime(number, divisor+1); //Böleni artırarak işlemi tekrar ettiriyoruz.
    }

    public static void main(String[] args) {
        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();


        if (isPrime(number,2)){
            System.out.println(number+" sayısı asal!");
        } else {
            System.out.println(number+ " sayısı asal değil!");
        }
    }
}
