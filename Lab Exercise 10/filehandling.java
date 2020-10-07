// TEAM 1
// LAB EX 10
/*
 FILE HANDLING
To check file availability,readable or writable or both,file type,
file length in bytes
 */

package lab.ex.pkg10;

//importing packages
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;


//main class
public class filehandling {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the name of the file");
        String s=obj.next();
        File f = new File("C:\\Users\\hp.pc\\Desktop");
        
        // to check whether the file is available or not
        if(f.exists())
        {
            System.out.println("File is available");
            
            //checking readability and writability
            
            System.out.println("readability of File:"+(f.canRead()));
            System.out.println("writability of file:"+(f.canWrite()));
            if((f.canRead()==true) && (f.canWrite()==true))
            {
                System.out.println("File is readable and writable");
                
            }
            
            // checking file type
            
            
            if(s.endsWith(".txt"))
            {
                System.out.println(" The given File type is character file");
                
            }
            else if(s.endsWith(".jpeg"))
            {
                System.out.println(" The given File is binary file");
            }
            
            // length of the file in bytes
        
            System.out.println("length of file in bytes"+(f.length()));
        }
        else
        {
            System.out.println("File is not available");
        }
                  
        
    }
}
