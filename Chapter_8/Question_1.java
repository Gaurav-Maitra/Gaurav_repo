package Chapter_8;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        /*Define an overloaded max( ) function which returns maximum out 
        of two integers, floats, doubles */
        int a, b;
        float c, d;
        double x, y;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two integer values : ");
        a = scn.nextInt();
        b = scn.nextInt();

        System.out.println("Enter two float values : ");
        c = scn.nextFloat();
        d = scn.nextFloat();

        System.out.println("Enter two double values : ");
        x = scn.nextDouble();
        y = scn.nextDouble();

        int integer = max(a, b);
        float float_value = max(c, d);
        double double_value = max(x, y);

        System.out.printf("Maximum in integer values : %d\n", integer);
        System.out.printf("Maximum in float values : %.2f\n", float_value);
        System.out.printf("Maximum in double values : %.2f\n", double_value);
    }
    static int max(int a, int b) {
        if(a > b)
        {
            return a;
        }
        else if(b > a)
        {
            return b;
        }
        else 
        {
            return a;
        }
    }
    static float max(float c, float d) {
        if (c > d)
        {
            return c;
        }
        else if(d > c) 
        {
            return d;
        }
        else
        {
            return c;
        }
    }
    static double max(double x, double y) {
        if(x > y)
        {
            return x;
        }
        else if(y > x)
        {
            return y;
        }
        else
        {
            return x;
        }
    }
}
