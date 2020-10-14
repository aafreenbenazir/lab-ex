/*
 LAB EX 11
 TEAM 1
 */
package lab.ex.pkg11;
//importing package

import java.util.Scanner;
import java.util.*;


//main class
public class ticketbooking {
    public static void main(String []args) throws InterruptedException{
        Scanner sc=new Scanner(System.in);
        //number of persons waiting in queue
        System.out.println("Enter number of persons standing in the ticket counter : ");
        int m=sc.nextInt();
        ticket t[]=new ticket[m];
        for(int h =0;h<m;h++)
        {
            //creating thread object
            t[h]=new ticket();
            
        }
        for(int h=0;h<m;h++)
        {
            //calling method run()
            t[h].start();
            t[h].join();
        }
        
        }
}
//thread class
class ticket extends Thread
{
    //ticket booking system 
    Scanner obj=new Scanner(System.in);
   static double seats=500;
    double amt=300;
    static int f=0;
    synchronized public void run()
    {
     //try block
    try
    {   
        f++;
        System.out.println("enter the number of seats you want for the person " +(f)+" in the queue");
        
        int n=obj.nextInt();
        if(n>seats)
        {
            System.out.println("seats are not available");
        }
        //As seats are available we are going to else part
        else
        {
         String na[]=new String[100];  
         int g[]=new int[100];
        System.out.println("enter your contact number");
        double c=obj.nextDouble();
        //getting name and age of persons
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the name of person " +(i+1)+" : ");
            na[i]=obj.next();
            System.out.println("enter the age of that person "+ (i+1) +" : ");
            g[i]=obj.nextInt();
        }
        int l =0;
        l++;
        seats=seats-n;
        //printing the details in the ticket
        System.out.println("========================================");
        System.out.println("BILLING DETAILS OF PERSON" +(l)+ "IN THE QUEUE");
        System.out.println("========================================");
        System.out.println("number of seats required :: "+(n));
        System.out.println("name and age of the persons accomodating the seats");
        System.out.println("CONTACT NUMBER :: " +(c));
        for(int i=0;i<n;i++)
        {
            System.out.println("NAME :: " +(na[i])+ " AGE :: " +(g[i]));
        }
        System.out.println("THE total amount for"+(n)+ "seats :: ");
        System.out.println(+(n*amt));
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        }
        
    }
    //catch block
      catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        
        
        
    }  
// OUTPUT
    /*
Enter number of persons standing in the ticket counter : 
1
enter the number of seats you want for the person 1 in the queue
2
enter your contact number
9999999999
enter the name of person 1 : 
the
enter the age of that person 1 : 
98
enter the name of person 2 : 
kji
enter the age of that person 2 : 
25
========================================
BILLING DETAILS OF PERSON1IN THE QUEUE
========================================
number of seats required :: 2
name and age of the persons accomodating the seats
CONTACT NUMBER :: 9.9999999999E9
NAME :: the AGE :: 98
NAME :: kji AGE :: 25
THE total amount for2seats :: 
600.0
-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
*/
    

    
