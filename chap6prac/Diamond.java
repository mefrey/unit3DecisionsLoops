import java.util.Scanner;

public class Diamond
{
   
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Diamond side length: ");
        int sidelength=input.nextInt();
        int count= 0;
        int numOfSpaces=1;
        int numOfAsterisks=1;
        while (count<sidelength+(sidelength-1))
        {
            int spaces=sidelength-numOfSpaces;
            int aster=numOfAsterisks;
            for (int repeat=0; repeat<spaces; repeat++)
            {
                System.out.print(" ");
            }
            for (int repeat1=0; repeat1<aster; repeat1++)
            {
                System.out.print("*");
            }
            System.out.println("");
            if (count<sidelength-1)
            {
                numOfSpaces++;
                numOfAsterisks+=2;
            }
            else
            {
                numOfSpaces--;
                numOfAsterisks-=2;
            }
            count++;
        }
    }

}