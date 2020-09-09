//author:K.AAFREEN BENAZIR
//initializing 20 elements randomly in an array and calculating sum and avrg 
//of that 20 elements and storing elements which are of above avrg in list1 
//and below avrg in list2 and printing both lists

package lab.ex.pkg7;

//importing packages
import java.util.Scanner;
import java.util.ArrayList;

//main class
public class LabEx7 {

    
    public static void main(String[] args) {
        int a[]=new int[20];
        int i,sum=0;
        for(i=0;i<20;i++)
        {
            // initializing elements randomly using Math.random
            a[i]=((int)(Math.random()*80))+10;
            //calculating sum
            sum=sum+a[i];
      
        }
        //calculating average
        float avrg=sum/20;
       ArrayList <Integer> list1=new ArrayList <Integer>();
       ArrayList <Integer> list2= new ArrayList <Integer>();
        
       for(i=0;i<20;i++)
       {
           if(a[i]>avrg)
           {
               list1.add(a[i]);
      
           }
           else if(a[i]<avrg)
           {
               list2.add(a[i]);
               
           }
       }
       //printing the elements below average and above average
       
       //elements above average are stored in list1
       System.out.println("below average"+list1);
       
       //elements below average are stored in list2
       System.out.println("above average"+list2);
       
    }
    
}
