//Author: Aafreen Benazir K
//Team1
//Lab Exercise 9-2
package labex9;

/**
 *
 * @author user
 */
public class ar {
    public static void main(String[] args) {
        int a,b=10,c=0;
        try
        {
            a=b/c;
            throw new ArithmeticException("/ by zero");
        }
        
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
}
}
