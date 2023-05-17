package Hafta1;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        //Değişken tanımlama ve kullanıcdan veri alma
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();
        int ebob = 1, ekok = 1;

        //if else kullanımı ile küçük sayıyı tespit edip, while döngüsü kullanarak ebob bulma
        if (n1 < n2){
            int i = n1;
            while(i >= 1){
                if ((n1 % i == 0) && (n2 % i == 0)){
                    ebob = i;
                    System.out.println("Ebob: "+ebob);
                    break;
                }
                i--;
            }
        } else {
            int k = n2;
            while (k >= 1){
                if (n1 % k ==0 && n2 % k ==0){
                    ebob = k;
                    System.out.println("Ebob: "+ebob);
                    break;
                }
                k--;
            }
        }

        //while döngüsü ile ekok bulma
        int i = 1;
        while (i <= (n1*n2)){
            if (i % n1 == 0 && i % n2 == 0){
                System.out.println("Ekok: "+i);
                break;
            }
            i++;
        }

        //Ebobu bilinen sayıların ekok unu bulma formülü
        /*
        ekok = (n1*n2)/ebob;
        System.out.println("Ekok: "+ekok);
         */
    }
}
