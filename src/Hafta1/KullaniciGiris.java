package Hafta1;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        //Değişken tanımlama
        String userName, password, reset;

        //Kullanıcı bilgilerini kullanıcıdan alma
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adı: ");
        userName = input.nextLine();
        System.out.print("Şifre: ");
        password = input.nextLine();

        //if else ile giriş yapma ve şifre sıfırlama işlemleri
        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else if (userName.equals("patika") && !password.equals("java101")) {
            //Şifre eşitlenmemesi durumunda kullanıcıya şifresini sıfırlamak isteyip istemediğini sorma
            System.out.println("Yanlış şifre girdiniz.\nŞifrenizi sıfırlamak ister misiniz?\n EVET veya HAYIR yazarak cevaplayın.");
            reset = input.nextLine();
            if (reset.equals("EVET")) {
                //Kullanıcı şifre sıfırlamak istediği takdirde şifrenin eski şifreyle aynı olup olmadığını kontrol etme
                System.out.print("Yeni şifre: ");
                String newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else if (reset.equals("HAYIR")) {
                System.out.println("Şifrenizi sıfırlamak istemediniz.");
            } else {
                System.out.println("Yanlış girdi!");
            }
        } else {
            System.out.println("Kullanıcı adı bulunamadı!");
        }
    }
}
