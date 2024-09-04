package Chapter_8;

public class Question_5 {
    public static void main(String[] args) {
        /*Write a recursive function to obtain the first 25 numbers of a 
        Fibonacci sequence. In a Fibonacci sequence the sum of two 
        successive terms gives the third term. Following are the first few 
        terms of the Fibonacci sequence: 
        1 1 2 3 5 8 13 21 34 55 89... */

        int number = 25;

        for(int i = 1; i <= number; i++)
        {
            System.out.println(fibonacci(i));
        }
    }
    static int fibonacci(int number) {
        if(number == 0)
        {
            return 1;
        }
        else if(number == 1)
        {
            return 1;
        }
        else 
        {
            return fibonacci(number-1) + fibonacci(number-2);
        }
    }
}