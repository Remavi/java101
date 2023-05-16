package Hafta1;
import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        //Değişken tanımlama
        int n, r, nr, nFaktoriyel = 1, rFaktoriyel = 1, nrFaktoriyel = 1;

        //Kullanıcıdan n ve r değerlerini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        nr = n - r; //Formüldeki (n-r)! kısmı için

        //Faktöriyel hesaplamak için for döngüsü kullanıyoruz
        for (int i = 1; i <= n; i++){
            nFaktoriyel*=i;
        }
        for (int i = 1; i <= r; i++){
            rFaktoriyel*=i;
        }
        for (int i = 1; i <= nr; i++){
            nrFaktoriyel*=i;
        }

        //Kombinasyon formülünü uyguluyoruz
        double kombinasyon = nFaktoriyel / (rFaktoriyel * nrFaktoriyel);
        System.out.println("Girilen n ve r sayılarının kombinasyonu: "+kombinasyon);
    }
}
