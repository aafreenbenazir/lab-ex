//Author: Aafreen Benazir K
//Team1
//Lab Exercise 9-1-b
package labex9;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class user3 {
    public static void main(String[] args) {
        
        
        user3 obj1 = new user3();
        try
        {
            obj1.check();
        }
        catch(markException e)
        {
            System.out.println("Exception"+e);
        }
        }
    void check() throws markException
    {
        boolean flag=true;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter string of length 2:");
        String s = obj.next();
        char c[]=new char[2];
        c=s.toCharArray();
        int a[]=new int[2];
        int j=0;
        int sum=0;
        
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>=48&&c[i]<=57)
                    {
                        char b=c[i];
                        String z= Character.toString(b);
                        a[j]=Integer.parseInt(z);
                        
                        sum = sum+a[j];
                        
                        j++; 
                        
                        if (flag==false)
                        { 
                            break;   
                        }
 
                    }
            
            else
                    {
                        flag=false;
                        throw new markException("The input has characters"); 
                        
                    }
            
        }
        if(flag==true)
        {
            System.out.println("The input has no characters So the Sum is "+sum);
        }
           
            
        }
    }
    class markException extends Exception
    {
      markException(String msg)
      {
          super(msg);
          
      }
    }  

