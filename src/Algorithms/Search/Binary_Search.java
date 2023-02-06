package Algorithms.Search;

import java.util.Arrays;
import java.util.Random;

public class Binary_Search {
    public static void main(String[] args) {
        int array[] = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100000)+1;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("найден(если не -1) под индексом " + search(array,55777));
    }

    public static int search(int [] array, int number){
        int count = 0;
        int start = 0;
        int end = array.length-1;
        int middleIndex;
        while(start <= end){
            count++;
            middleIndex = start + (end - start)/2;
            if(array[middleIndex] > number){
                end = middleIndex - 1;
            } else if (array[middleIndex] < number){
                start = middleIndex + 1;
            } else{
                System.out.println(count + "кол во итераций");
                return middleIndex;
            }
        }
        System.out.println(count + "кол во итераций");
        return -1;
    }
}
