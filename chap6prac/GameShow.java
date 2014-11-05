import java.util.Random;

public class GameShow
{
    public static void main(String[] args)
    {
        int switchWins = 0;
        int stayWins = 0;
        
        for (int count = 0; count <= 1000; count++)
        {
            Random pick = new Random();
            int winPick = pick.nextInt(3)+1;
            int playerPick = pick.nextInt(3)+1;
            int hostPick = pick.nextInt(3)+1;
            int otherPick = pick.nextInt(3)+1;
            while ((hostPick != winPick) && (hostPick != playerPick))
            {
                hostPick = pick.nextInt(3)+1;
            }
            while ((otherPick != hostPick) && (otherPick != playerPick))
            {
                otherPick = pick.nextInt(3)+1;
            }
            playerPick = otherPick;
            if (playerPick == winPick)
            {
                switchWins++;
            }
        }
        
        for (int count = 0; count <= 1000; count++)
        {
            Random pick = new Random();
            int winPick = pick.nextInt(3)+1;
            int playerPick = pick.nextInt(3)+1;
            if (playerPick == winPick)
            {
                stayWins++;
            }
        }  
        
        System.out.println("Switch Wins: " + switchWins);
        System.out.println("Stay Wins: " + stayWins);
    }
}