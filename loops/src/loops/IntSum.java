package loops;

public class IntSum
{
    public static void main(String[] args)
    {
//        while loop that prints sum of first 100 positive ints
        int sum = 0;
        int num = 0;

        while(num < 100)
        {
            num++;
            sum+=num;
            System.out.println(sum);
        }


    }
}
