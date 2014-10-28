import java.util.Scanner;
public class CompareAdjacent
{

    /**
     * finds dup in series of numbers
     */
    public static void main(String[] args)
    {
        final double EPSILON=1e-7;
        Scanner input=new Scanner(System.in);
        System.out.println("enter a series of numbers('s' to stop)");
        double prevalue=input.nextDouble();
        while (input.hasNextDouble())
        {
            double value=input.nextDouble();
            if (Math.abs(value-prevalue)<EPSILON)
            {
                System.out.println("duplicate number");
            }
            prevalue=value;
        }
    }

}
