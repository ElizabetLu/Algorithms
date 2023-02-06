package Algorithms.Sort;

import java.util.Arrays;

public class Bubble_Sort{
    public static void main(String[] args) {
        int [] array = {5,7,9,1,3,4,5,7,2,2,1,2,7,32,12};
        sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static  void sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[i]){
                    int n = array[i];
                    array[i] = array[j];
                    array[j] = n;
                }
            }
        }
    }
}
