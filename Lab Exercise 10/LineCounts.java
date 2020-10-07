// TEAM1
// LAB EX 10

/*
To count the number of lines in each files that are specified on the command line
*/
package lab.ex.pkg10;

//importing packages

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



//main class
public class LineCounts {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        
        //C:\Users\hp.pc\Desktop\file1.txt--->args[0]
        //C:\Users\hp.pc\Desktop\file2.txt--->args[1]
        //C:\Users\hp.pc\Desktop\file3.txt--->args[2]
        
        for(int z=0;z<3;z++)
        {
        BufferedReader f= new BufferedReader(new FileReader(args[z]));
        String read;
        int i=1,count=0;
        String str[];
        while((read=f.readLine())!=null)
        {
            count++;
        }
        System.out.print("number of lines in "+(z+1));
        System.out.print("file: "+(count));
        System.out.println("");
        }
        
        /*
        OUTPUT:
        number of lines in 1file: 1
        number of lines in 2file: 1
        number of lines in 3file: 2
        */
    
    
}
}