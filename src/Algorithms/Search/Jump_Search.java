package Algorithms.Search;

import java.util.Arrays;
import java.util.Random;

public class Jump_Search {
    public static void main(String[] args) {
        Random random = new Random();
        int box[]  = new int[500];
        for (int i = 0; i < box.length; i++) {
            box[i]= random.nextInt(500)+1;
        }


        int index =  jumpSearch(box,499);
        System.out.println(index);
        System.out.println("-----------");

    }


    public static int jumpSearch(int[] arr, int number) {
        int count = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int arrlinght = arr.length;
        int jump = (int) Math.sqrt(arr.length);
        int previousStep = 0;

        while (arr[Math.min(arrlinght, jump) - 1] < number) {
            count++;
            previousStep = jump;
            jump += (int) Math.sqrt(arrlinght);
            if (previousStep >= arrlinght) {
                System.out.println("count " + count);
                return -1;
            }
        }

        while (arr[previousStep] < number){
            count++;
            previousStep++;
            if (previousStep ==  Math.min(jump,arrlinght)){
                return  -1;
            }

        }

        if (arr[previousStep] == number) {
            System.out.println("count " + count);
            return previousStep;
        }

        System.out.println("count " + count);
        return -1;
    }
}
