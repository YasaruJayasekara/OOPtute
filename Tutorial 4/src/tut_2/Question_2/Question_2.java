package tut_2.Question_2;

import java.awt.*;

public class Question_2{
    public static void main(String args){
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
//        Rectangle r2 = new Rectangle(r1);
        System.out.println(r1);
        /*r2.grow(10,20);
        System.out.println(r1);
        System.out.println(r2);*/
        Rectangle r2 = r1;
        r2.grow(10,20);
        System.out.println(r1);
        System.out.println(r2);
    }
}
