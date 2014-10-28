
import java.util.Scanner;
public class FindFirstMatch
{
    /**
     * computes the index of the first space in the string, if any
     */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String str= input.nextLine();
        int index=0;
        char ch=str.charAt(index);
        while (index<str.length())
        {
            ch = str.charAt(index);
            if (ch==' ')
            {
                break;
            }
            index++;
        }
        if (ch==' ')
        {
            System.out.println("index of first space: "+index);
        }

    }

}
