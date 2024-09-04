package Chapter_8;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        /*(f) A positive integer is entered through the keyboard, write a function 
        to find the binary equivalent of this number using recursion.*/

        int number;
        int i;

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a positive integer only : ");
        number = scn.nextInt();

        if(number < 0)
        {
            System.out.println("Enter positive integer only.");
        }
        else 
        {
            binary(number);
            System.out.println();
        }
    }
    static void binary(int number) {
        if(number > 1)
        {
            binary(number / 2);
        }
        System.out.println(number % 2);
    }
}
