package main.java.PlayingWithDigits;
public class DigPow {

    public static long digPow(int n, int p) {

        double sum = 0;
        int count = 0;
        int tempDigitSize = n, originInput = n;
        while (tempDigitSize != 0){
            count++;
            tempDigitSize/=10;
        }
        p += count-1;
        while (n != 0){
            sum += Math.pow(n % 10, p) ;
            n /= 10;
            p--;
        }
        return (sum / originInput) % 1 == 0 ? (long)(sum / originInput) : -1;
    }
}
