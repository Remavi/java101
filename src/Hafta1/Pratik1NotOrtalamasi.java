package Hafta1;
import java.util.Scanner;

public class Pratik1NotOrtalamasi {
    public static void main(String[] args) {
        //Değişkenleri oluşturuyoruz
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımladık
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan not değerlerini al
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        //Ortalamayı hesaplayalım
        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamanız: "+ sonuc);

        //Sınıfı geçme durumunu kontrol edelim
        System.out.println(sonuc >= 60 ? "Sınıfı geçti" : "Sınıfta kaldı");
    }
}
