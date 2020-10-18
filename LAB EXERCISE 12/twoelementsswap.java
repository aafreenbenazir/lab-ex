/*
 * TEAM 1
 * LAB EX 12
 */
package lab.ex.pkg12;

// importing packges
import java.util.Scanner;
public class twoelementsswap {

    
    public static void main(String[] args) {
        
        Integer num[]={1,2,3,4,5,6};
        s<Integer,Integer>obj1=new s<>(num,0);
        obj1.display();
     
        
        
    }
    
}
class s<T,D>
{
    Scanner obj= new Scanner(System.in);
    T[] value;
    D v;
    public s(T[] value,D v)
            
    {
        this.value=value;
        this.v=v;
    }
    public void display()
    {
        int q=0,q1=0;
        System.out.println("position starts from 0 ");
        System.out.println("enter two positions to be swapped : ");
        int f = obj.nextInt();
        int l=obj.nextInt();
        System.out.println("BEFORE SWAPPING");
        for(int i=0;i<value.length;i++)
        {
        System.out.println(value[i]);
        }
        for(int i=0;i<value.length;i++)
        {
            if(i==f)
            {
                 q = f;
            }
            else if(i==l)
            {
                q1=l;
                
            }
        }
        
            v = (D) value[q];
            value[q]=value[q1];
            value[q1]=(T) v;
            
            
        
        System.out.println("-----------------------------------");
        System.out.println("AFTER SWAPPING");
        System.out.println("elements of positions " + f + " and " + l + " are swapped ");
        for(int i=0;i<value.length;i++)
        {
            System.out.println(value[i]);
        }
    }
    
}