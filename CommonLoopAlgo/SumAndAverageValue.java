import java.util.Scanner;

public class SumAndAverageValue
{
    /**
     * computes the sum and average of series of numbers.
     */
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter multiple numbers or 's' to stop");
       double total=0;
       int count=0;
       while(input.hasNextDouble())
       {
           double value=input.nextDouble();
           total+=value;
           count++;
        }
        double average=0;
        if (count>0)
        {
            average=total/count;
        }
        System.out.println("Total: "+total+" Average: "+average);
    }

}
