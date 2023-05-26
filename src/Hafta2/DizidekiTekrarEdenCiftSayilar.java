package Hafta2;

public class DizidekiTekrarEdenCiftSayilar {
    static boolean isFind(int[] arr, int value) { //sayı birden fazla tekrar ediyorsa sayıyı sadece bir kez almamızı sağlayacak kontrol metodu
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 2, 10};
        int[] duplicatte = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) { //dizi içerisini gezerek tekrar eden sayıları bulma
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) { //sayının çift sayı olup olmadığını kontrol etme
                        if (!isFind(duplicatte, list[i])) { //tekrar eden sayı daha önce tespit edildiyse bir kez daha aynı değeri almamak için
                            duplicatte[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int value : duplicatte) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
