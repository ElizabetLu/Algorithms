package Algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        factorialBigNumbers(n);
        int l = 1;
        for (int i = 1; i <=n; i++) {
            l = l*i;
        }
        System.out.println(l);
    }



    public static void factorialBigNumbers(int n){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));

        }
        System.out.println(result.toString());
    }
}
