package Hafta1;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıdan veri alma
        String userName, password;
        int bakiye = 1500, deneme = 3, secim;
        Scanner input = new Scanner(System.in);

        while(deneme > 0){
            System.out.print("Kullanıcı adı: ");
            userName = input.nextLine();
            System.out.print("Şifre: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("X bankasına hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış yap");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin: ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Yatırılacak para miktarı: ");
                            int miktar = input.nextInt();
                            bakiye += miktar;
                            break;
                        case 2:
                            System.out.print("Çekilecek para miktarı: ");
                            miktar = input.nextInt();
                            if (miktar > bakiye){
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                bakiye -= miktar;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+bakiye);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Hatalı seçim!");
                    }
                } while (secim != 4); {
                    break;
                }
            } else {
                deneme--;
                System.out.println("Hatalı kullanıcı adı veya şifre!");
                if (deneme == 0){
                    System.out.println("Hesabının bloke olmuştur lütfen banka ile iletişime geçiniz");
                } else {
                    System.out.println("Kalan hakkınız: "+deneme);
                }
            }
        }
    }
}
