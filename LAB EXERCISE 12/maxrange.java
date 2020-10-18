/*
 * TEAM 1
 * LAB EX 12
 */
package lbex12;

import java.util.Scanner;


public class maxrange {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num[]={500,54,96,3,1236};
        m<Integer>obj1=new m<>(num);
        obj1.display();
        
       
    }
    
}
class m<T >
{
    T[] value;
    
    public m(T[] value)
    {
        this.value=value;
        
    }

    public void display()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the range");
        System.out.println("Beginning limit:");
        int b=obj.nextInt();
        System.out.println("Ending limit:");
        int e=obj.nextInt();
        int ma=0;
        
        for(b=0;b<e;b++)
            {
                int w =Integer.parseInt(""+ value[b]);
                if(w>ma)
                {
                    ma=w;
                }
            }
             
        
        System.out.println("Maximum number in the range"+ma);
    }

}
