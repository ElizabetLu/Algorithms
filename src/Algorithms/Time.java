package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class Time {
    public static void main(String[] args) {
        int [] arr = new int[100_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10_000_000);
        }
        Arrays.sort(arr);
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 11_999_998){
                System.out.println(i);
                break;
            }
        }
        System.out.println(((double) System.nanoTime() - startTime) / 1_000_000_000 );

    }
}
