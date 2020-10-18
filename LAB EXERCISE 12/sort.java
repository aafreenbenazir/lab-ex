/*
 * TEAM 1
 * LAB EX 12
 */
package lbex12;


/**
 *
 * @author user
 */
public class sort {
    public static void main(String[] args) {
        Integer num[]={5,4,3,2,1};
        so<Integer,Integer>obj1=new so<>(num,0);
        obj1.sortg();
    }
    
    
}
class so<T ,D>
{
  
    
    T[] value;
    D v;
    
    public so(T[] value,D v)
    {
        this.value=value;
        this.v=v;
        
        
    }

    public void sortg()
    {
        
      
        
        System.out.println("Integer list before sorting");
        for(int i=0;i<value.length;i++)
        {
        System.out.println(value[i]);
        }
        
       
        
        for(int i=0;i<value.length-1;i++)
            {
                int a= Integer.parseInt(""+value[i]);
                
                
                for(int j=i+1;j<value.length;j++)
                {
                   
                    int b= Integer.parseInt(""+value[j]); 
                 
                    if(a>b)
                    {
                        v=(D) value[i];
                        value[i]=value[j];
                        value[j]=(T) v;
                    } 
               
                }
                
            }
    

        System.out.println("Integer list after sorting");
        for(int j=0;j<value.length;j++)
        {
        System.out.println(value[j]);
        }
    }

}