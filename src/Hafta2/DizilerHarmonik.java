package Hafta2;

public class DizilerHarmonik {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;

        for (int i = 0; i < numbers.length; i++){ //For döngüsü ile harmonik seriyi bulma
            sum += (double) 1 /numbers[i];
        }

        System.out.println("Dizinin harmonik ortalaması: "+ (numbers.length / sum));
    }
}
