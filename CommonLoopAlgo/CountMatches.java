import java.util.Scanner;

public class CountMatches
{
    /**
     * computes the number of spaces '' in the specified string
     */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=input.nextLine();//entire line not word
        int numSpaces=0;
        for (int index=0; index<str.length(); index++)
        {
            char ch=str.charAt(index);
            if(ch==' ')
            {
                numSpaces++;
            }
        }
        System.out.println("number of spaces: "+numSpaces);
    }

}
