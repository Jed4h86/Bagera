package pl.testeroprogramownia.Forexercises;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean czyPierwsza = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    czyPierwsza = false;
                    break;
                }
            }

            if (czyPierwsza) {
                System.out.println(i);
            }
        }
    }
}