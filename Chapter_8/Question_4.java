package Chapter_8;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        /*A positive integer is entered through the keyboard, write a program 
        to obtain the prime factors of the number using a recursive 
        function.*/
        
        int number, i = 2;

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        number = scn.nextInt();
        
        int prime = prime_num(number, i);
    }
    public static int prime_num(int number, int i) {
        if(number <= 0)
        {
            System.out.println("Zero or negative number not allowed.");
        }
        if (number == 0)
        {
            return 0;
        }
        else if (number == 1)
        {
            return 1;
        }
        else if (number % i == 0)
        {
            System.out.println(i);
            return prime_num(number / i, i);
        }
        else
        {
            return prime_num(number, i + 1);
        }
    }
}
