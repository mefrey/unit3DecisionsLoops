import java.util.Random;
import java.util.Scanner;

public class SwapLetters
{
    public static void main(String[] args)
    {
        int count = 0;
        Random random = new Random();
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Word: ");
        String word = scan.nextLine();
        
        while (count < word.length())
        {
            int i = random.nextInt(word.length()-2);
            int j = random.nextInt(word.length()-1-i)+1;
            j += i;
            
            String first = word.substring(0, i);
            String middle = word.substring(i+1, j);
            String last = word.substring(j+1);
            
            System.out.println(first + word.charAt(j) + middle + word.charAt(i) + last);
            count++;
        }
    }
}