package Algorithms.Checking;

public class Check_Numbers {
    public static void main(String[] args) {
        //v1
        String text = "123";
        boolean answer =  check(text.toCharArray());
        System.out.println(answer);

        //v2
        boolean answer2  = text.chars().allMatch(Character::isDigit);
        System.out.println(answer2);
    }

    public static boolean check(char [] chars){
        for (char c : chars) {
            if (!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}
