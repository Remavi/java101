package Hafta1;
import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        //Değişken tanımlama
        int dogumYili;

        //Kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı girin: ");
        dogumYili = input.nextInt();

        //Zodyak hesaplama
        dogumYili %= 12;
        switch (dogumYili){
            case 0:
                System.out.println("Çin zodyağına göre burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin zodyağına göre burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin zodyağına göre burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin zodyağına göre burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin zodyağına göre burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin zodyağına göre burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin zodyağına göre burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin zodyağına göre burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin zodyağına göre burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin zodyağına göre burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin zodyağına göre burcunuz: At");
                break;
            case 11:
                System.out.println("Çin zodyağına göre burcunuz: Koyun");
                break;
            default:
                System.out.println("Burç hesaplanamadı");
        }
    }
}
