/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package brokengps;

import java.util.Random;

/**
 *
 * @author nl2027
 */
public class BrokenGPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int initialX = 0;
        int initialY = 0;
        int x = 0;
        int y = 0;

        final int North = 1;
        final int East = 2;
        final int South = 3;
        final int West = 4;
        final int turns = 12;
        int direction;
        int time = 60;
        
   
   
  for (int i = 0; i < turns; i++) 
  {
      direction = rand.nextInt(4) + 1;
   if (direction == North)
   {
       y = y + 5;
       System.out.println("North");
   }
   if (direction == East)
   {
       x = x + 5;
       System.out.println("East");  
   }
   if (direction == South)
   {
       y = y - 5;
       System.out.println("North");
   }
   if (direction == West)
   {
       x = x - 5;
       System.out.println("West");
   }
        
  }
  double distance = Math.sqrt((x - initialX)*(x - initialX) + (y - initialY)*(y - initialY));

  System.out.println("Distance   " + distance);
    
    
  
    }
}
    
      
  
