//Author: Aafreen Benazir K
//Team1
//Lab Exercise 9-2
package labex9;

/**
 *
 * @author user
 */
public class noformat {
    public static void main(String[] args) {
        String s="h";
        int k;
         try
        {
            k = Integer.parseInt(s);
            System.out.println(k);
        }
         catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    
}
}
