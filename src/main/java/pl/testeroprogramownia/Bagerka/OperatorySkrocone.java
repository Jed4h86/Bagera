package pl.testeroprogramownia.Bagerka;
//przy zapisie sum+=1 -> sum = sum + i; Działanie: Dodaje i do zmiennej sum.
//przy zapisie sum-=1 -> sum = sum - i; Działanie: Odejmuje i od zmiennej sum.
//przy zapisie sum*=1 -> sum = sum * i; Działanie: mnoży i do zmiennej sum.
//przy zapisie sum/=1 -> sum = sum / i; Działanie: Dzieli i od zmiennej sum.

public class OperatorySkrocone {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum += i;
            System.out.println(sum);
        }
        int sum2 = 12;
        for (int i = 1; i < 12; i++) {
            sum2 *= i;
            System.out.println(sum2);
        }
        double sum3 = 2;
        for (int i = 12; i >= 1; i--) {
            sum3 /= i;
            System.out.println("i = " + i + ", sum3 = " + sum3);
        }
        int sum4 = 12;
        for (int i = 1; i <= 12; i++) {
            sum4 -= i;
            System.out.println(sum4);

        }
    }
}


