package Hafta2;

import java.util.Scanner;

public class PalindromikKelime {
    static boolean isPalindrome(String str) { //Girilen kelimenin polindromik olup olmadığını bulmak için baş ve son harfinden başlayıp ortaya doğru karşılaştırarak ilerleyen yöntem
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) { //Girilen kelimenin polindromik olup olmadığını kelimenin tersini alıp normal haliyle karşılaştırarak bulan yöntem
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String word = input.nextLine();
        System.out.println(isPalindrome(word) ? (word+ ", polindromik kelimedir.") : (word+ ", polindromik kelime değildir."));
    }
}
