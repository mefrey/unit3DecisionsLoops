import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a number to find its fibonacci number:");
        int fibnum= input.nextInt();
        int fold1=1;
        int fold2=1;
        int fnew=fold1+fold2;
        for (int count=0; count<fibnum-3; count++)
        {
            fold2=fold1;
            fold1=fnew;
            fnew=fold1+fold2;
        }
        System.out.println(fnew);

    }

}
