import java.util.Scanner;
public class Year
{
    
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Year: ");
       int year=input.nextInt();
       if ((year%400)==0&&(year%4)==0)
       {
           System.out.println("It's a leap year!");
        }
        else
        {
            System.out.println("It's not a leap year :(");
            
        }
    }

}
