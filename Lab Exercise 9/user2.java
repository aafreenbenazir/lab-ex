//Author: Aafreen Benazir K
//Team1
//Lab Exercise 9-1-a
package labex9;
import java.util.Scanner;
/**
 *
 * @author user
 */
//main class
public class user2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s1="hello";
        //Prompting user for input
        System.out.println("Enter string:");
        String s=obj.next();
        //Converting the characters of the string to lowercase
        s=s.toLowerCase();
        user2 obj1= new user2();
        //try block
        try
        {
            obj1.check(s,s1);
        }
        //catch block
        catch(userException e)
        {
            System.out.println("Exception"+e);
        }
        }
    //method to check exception
    void check(String s,String s1) throws userException
    {
        if(s1.equals(s))
            throw new userException("User entered hello");
        System.out.println("User didnot enter hello");
    }
    
}    
//user defined Exception       
  class userException extends Exception
  {
      userException(String msg)
      {
          super(msg);
          
      }
  }  
    

