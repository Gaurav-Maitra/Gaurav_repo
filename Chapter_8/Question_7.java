package Chapter_8;

public class Question_7 {
    public static void main(String[] args) {
        /*Write a recursive function to obtain the running sum of first 25 
        natural numbers.*/

        int number = 25;

        System.out.println(rec_sum(number));
    }
    static int rec_sum(int number) {
        if(number == 0)
        {
            return 0;
        }
        else if(number < 0)
        {
            return 0;
        }
        else 
        {
            return number + rec_sum(number - 1);
        }
    }
}
