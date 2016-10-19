/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cprog;

import java.util.Scanner;

/**
 *
 * @author ratnesh
 */
public class Vowel {
    public static void main(String args[])
    {
       Scanner in =new Scanner(System.in);
       String s = in.next();
       
       char [] v = {'a','i','e','o','u'};
       int i;
       for(i=0; i<5;i++)
          
       {
           if( v[i] == s.charAt(0))
           {
               System.out.println("char is vowel");
               System.exit(0);
           }
           
       }
       
      if(i==5)
      {
          
               System.out.print("char is not vowel");
      }
        
        
    }
    
}
