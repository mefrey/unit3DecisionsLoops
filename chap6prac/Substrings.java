import java.util.Scanner;

public class Substrings
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Word: ");
        String word = scan.nextLine();
        
        int times = 1;
        for (int key = 0; key < word.length() - 1; key++)
        {
            int count = 0;
            while (count <= word.length()-times)
            {
                String letter = word.substring(count, count + times);
                System.out.println(letter);
                count++;
            }
            times++;
        }
        System.out.print(word);
    }
}