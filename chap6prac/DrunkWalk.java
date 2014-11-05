import java.util.Random;
public class DrunkWalk
{
    public static void main(String[] args)
    {
        int xLocation = 0;
        int yLocation = 0;
        Random rand = new Random();
        for (int repeat = 0; repeat < 100; repeat++)
        {
            int direction = rand.nextInt(4)+1;
            if (direction == 1)//Up
            {
                yLocation-=1;
            }
            else if (direction == 2)//right
            {
                xLocation+=1;
            }
            else if (direction == 3)//down
            {
                yLocation+=1;
            }
            else//left
            {
                xLocation-=1;
            }
            
        }
        System.out.println("("+xLocation+","+yLocation+")");
    }

}
