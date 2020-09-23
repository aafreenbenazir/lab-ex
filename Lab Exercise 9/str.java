//Author: Aafreen Benazir K
//Team1
//Lab Exercise 9-2
package labex9;

/**
 *
 * @author user
 */
public class str {
    public static void main(String[] args) {
        String s="h";
        try
        {
            System.out.println(s.substring(1, 3));    
        }
        catch(StringIndexOutOfBoundsException e)    
        {
            System.out.println(e);
        }
    }
}
