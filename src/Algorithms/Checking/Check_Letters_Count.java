package Algorithms.Checking;

import java.util.Locale;

public class Check_Letters_Count {
    public static void main(String[] args) {

        line("Приветт");

    }

    public static void line (String line){
        line = line.toLowerCase(Locale.ROOT);
        int [] arr = new int['я' - 'а' + 1];
        for (int i = 0; i < line.length(); i++) {
            char n = line.charAt(i);
            if(n >= 'а' && n <= 'я'){
                arr[n-'а'] += 1;
            }
        }

        for (int i = 0; i < 32; i++) {
            System.out.println( ( char ) (i + 'а')  + " = " + arr[i] + " - index "+ i);
        }
    }
}
