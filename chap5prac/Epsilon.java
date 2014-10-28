import java.util.Scanner;

public class Epsilon
{

    public static void main(String[] args)
    {
        final double EPSILON=1e-14;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a float number: ");
        double num=input.nextDouble();
        String mag="";
        if(Math.abs(num)<1.0)
        {
            mag="small";
        }
        if(Math.abs(num)>1000000.0)
        {
            mag="large";
        }
        if(Math.abs(num-0)<EPSILON)//num==0
        {
            System.out.println("it's zero");
        }
        else if(num>0)
        {
            System.out.println("it's a positive number");
            System.out.println("it's a "+mag+" number");
        }
        else
        {
            System.out.println("it's a negative number");
            System.out.println("it's a "+mag+" number");
        }
    }

}
