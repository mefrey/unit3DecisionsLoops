import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life contains a grid that is filled with actors that are created and destroyed
 * based on the rules in conway's game of life
 * 
 * @author @mefrey
 * @version 20 November 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 10 rows and 10 columns
    private final int ROWS = 10;
    private final int COLS = 10;
    
    // constants for the location of the 9 cells initially alive
    private final int X1 = 0, Y1 = 0;
    private final int X2 = 0, Y2 = 2;
    private final int X3 = 0, Y3 = 8;
    private final int X4 = 1, Y4 = 1;
    private final int X5 = 1, Y5 = 2;
    private final int X6 = 1, Y6 = 8;
    private final int X7 = 2, Y7 = 1;
    private final int X8 = 2, Y8 = 8;
    private final int X9 = 6, Y9 = 4;
    private final int X10 = 7, Y10 = 3;
    private final int X11 = 7, Y11 = 5;
    private final int X12 = 8, Y12 = 3;
    private final int X13 = 8, Y13 = 5;
    private final int X14 = 9, Y14 = 4;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);

        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // display the newly constructed and populated world
        world.show();
        
        // populate the game
        populateGame();

    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(X9, Y9);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(X10, Y10);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(X11, Y11);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(X12, Y12);
        grid.put(loc12, rock12);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(X13, Y13);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(X14, Y14);
        grid.put(loc14, rock14);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();

        // new grid
        BoundedGrid<Actor> gridnew = new BoundedGrid<Actor>(ROWS, COLS);
        //reads from old grid but makes changes to the new grid
        for (int row = 0; row<ROWS; row++)
        {
            for (int column = 0; column<COLS; column++)
            {
                Location loc = new Location(row, column);
                ArrayList array = grid.getOccupiedAdjacentLocations(loc);
                int numNeighbors = array.size();
                if (numNeighbors==3 && grid.get(loc)==null)
                {
                    Rock rock = new Rock();
                    gridnew.put(loc, rock);
                }
                else if ((numNeighbors<2 || numNeighbors>3) && grid.get(loc)!=null)
                {
                    gridnew.remove(loc);
                }
                else if (grid.get(loc)!=null)
                {
                    Rock rock = new Rock();
                    gridnew.put(loc, rock);
                }
            } 
        }
        //replaces old grid with new grid
        world.setGrid(gridnew);

    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        // new generations
        for (int i = 0; i < 3; i++)
        {
            Thread.sleep(500); // sleep 1000 milliseconds (1 second)
            game.createNextGeneration();
        }
    }

}
