package Chapter_8;

public class Question_2 {
    public static void main(String[] args) {
        /*Define a function min( ) that can find out and return minimum out 
        of variable number of integers passed to it.  */

        int min_value = min(20, 10, 50, 5, 8);

        System.out.println("Minimum value : " + min_value);
    }
    static int min(int...numbers) {
        int min = numbers[0];
        for(int num : numbers) 
        {
            if(num < min)
            {
                min = num;
            }
        }
        return min;
    }
}
