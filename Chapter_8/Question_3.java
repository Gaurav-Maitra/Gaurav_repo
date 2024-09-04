package Chapter_8;

import java.util.Scanner;

public class Question_3 {

    public static void main(String[] args) {
        /*A 5-digit positive integer is entered through the keyboard, write a 
        recursive function to calculate sum of digits of the 5-digit number.  */

        int number;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a five digit number : ");
        number = scn.nextInt();
        
        int sum = digit_sum(number);

        System.out.println("Sum : " + sum);
    }
    static int digit_sum(int number) {
        int sum = 0;

        if(number > 99999) {
            System.out.println("Number more than 5 digits are not allowed.");
            return 0;
        }
        else if (number < 10000){
            System.out.println("Number less than 5 digits are not allowed.");
            return 0;
        }

        if (number < 10) {
            sum = number;
            return sum;
        }

        else {
            sum = number % 10 + digit_sum(number / 10);
            return sum;
        }
    }
}