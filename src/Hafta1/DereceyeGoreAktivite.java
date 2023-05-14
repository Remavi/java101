package Hafta1;
import java.util.Scanner;

public class DereceyeGoreAktivite {
    public static void main(String[] args) {
        //Değişken tanımlama
        int derece;

        //Kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık derecesini giriniz: ");
        derece = input.nextInt();

        //if else ile dereceye göre etkinlik
        if (derece < 5){
            System.out.println("Kayak yapmaya gidebilirsin.");
        } else if (derece <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (derece <= 25) {
            System.out.println("Piknik yapmaya gidebilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
