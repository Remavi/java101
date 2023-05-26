package Hafta2.DizidekiElemanlarinFrekansi;

public class DizidekiElemanlarinFrekansi {
    static boolean isFind(int[] arr, int value) { //Tekrar eden sayıları çıktıda bir kez yazmamız için gerekli olan metot
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int index = 0;
        int count;

        System.out.println("Tekrar sayıları");
        for (int i = 0; i < list.length; i++) { //Diziyi gezerek tekrar eden sayıları bulma
            count = 0;
            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    count++; //Sayı tekrar ettikçe artıyor
                }
            }
            if (!isFind(duplicate, list[i])) { //Döngü süresince sayıları tekrar tekrar yazdırmak yerine bir kez yazdırmak için
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                duplicate[index++] = list[i];
            }
        }
    }
}
