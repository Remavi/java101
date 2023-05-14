package Hafta1;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        //Değişken tanımlama
        int mat, fizik, turkce, kimya, muzik;
        double ortalama;

        //Kullanıcıdan değer alma
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("Geçersiz not");
            mat = 0;
        }
        System.out.print("Fizik notu: ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            System.out.println("Geçersiz not");
            fizik = 0;
        }
        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            System.out.println("Geçersiz not");
            turkce = 0;
        }
        System.out.print("Kimya notu: ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            System.out.println("Geçersiz not");
            kimya = 0;
        }
        System.out.print("Müzik notu: ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println("Geçersiz not");
            muzik = 0;
        }
        ortalama = (double) (mat + fizik + turkce + kimya + muzik) / 5;
        if (ortalama > 55) {
            System.out.println("Tebrikler geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız!");
        }
        System.out.println("Ortalama: "+ ortalama);
    }
}
