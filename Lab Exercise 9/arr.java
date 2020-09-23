//Author: Aafreen Benazir K
//Team1
//Lab Exercise 9-2
package labex9;

/**
 *
 * @author user
 */
public class arr {
    public static void main(String[] args) {
        int z[]=new int[5];
        try
        {
            z[5]=10;
            System.out.println(z[5]);        
        }
        catch(ArrayIndexOutOfBoundsException e) //catch block
        {
           System.out.println(e);
        }
    }
    
}
