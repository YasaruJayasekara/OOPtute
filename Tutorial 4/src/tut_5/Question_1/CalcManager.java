package tut_5.Question_1;

public class CalcManager {
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static int cube(int n){
        return n ^ 3;
    }

    public static double add(double ...x){
        double sum = 0;
        for(double num : x){
            sum = sum + num;
        }
        return sum;
    }
}
