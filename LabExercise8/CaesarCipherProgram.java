Package lab ex 8;
import java.util.*;
class CaesarCipherProgram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Prompting user for input
        System.out.print(" Enter the plaintext string : ");
        String plaintext = sc.nextLine().toUpperCase();
        int shift = 3;
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++) 
        {
             alphabet = plaintext.charAt(i);

             //Step 1: Adding shift to the character and reducing the ascii value to 0 based 
             //        indexing by subtracting 65
             //Step 2: Modulo 25 (0 based indexing) for recycling values which go beyond 26
             //Step 3: changing back to ascii values by adding 65 (for typecasting)
             alphabet=(char)((int)((alphabet+shift-65)% 25+65));
             ciphertext = ciphertext + alphabet;
            }
            
          
    System.out.print("The Ciphertext string is: " + ciphertext);
  }
}