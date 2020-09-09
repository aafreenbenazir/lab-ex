//author:K.AAFREEN BENAZIR
package lab.ex.pkg7;

//importing package
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;



//main class

public class cgpasort1 {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        ArrayList<student>list=new ArrayList<>();
        student s1 = new student("aa","19cse01", (float) 8.7);
        student s2 = new student("bb","19cse02", (float) 8.9);
        list.add(s1);
        list.add(s2);
        for( int i=2;i<20;i++)
        {
            System.out.println( "enter the name , roll number and cgpa of student"+(i+1));
            String na=obj.next();
            String ro=obj.next();
            int cg=obj.nextInt();
            list.add(i,new student(na,ro,cg));
            
            
        }
        Collections.sort(list,new cgpasort());
        System.out.println(list);
        
        
    }
    
}

class student {
    String name;
    String roll;
    float cgpa;
    
    student(String n,String r,float c)
    {
        name=n;
        roll=r;
        cgpa=c;
        
    }
    public String toString()
    {
        return "\n name : " +name+ "\n roll : " +roll+ "\n cgpa : " +cgpa ;
        
    }
    
}

class cgpasort implements Comparator <student> {
    public int compare(student s1,student s2)
    {
        System.out.println("Comparator class : "+s1.cgpa+"....."+s2.cgpa);
        return (int)s1.cgpa-(int)s2.cgpa;

    }
}