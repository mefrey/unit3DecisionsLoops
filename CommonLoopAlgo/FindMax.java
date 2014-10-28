import java.util.Scanner;
public class FindMax
{
    /**
     * finds highest value in series of numbers
     */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a series of numbers ('s' to stop)");
        double maxValue=input.nextDouble();
        while (input.hasNextDouble())
        {
            double value=input.nextDouble();
            if (value>maxValue)
            {
                maxValue=value;
            }
        }
        System.out.println("Maximum value: "+maxValue);
    }

}
