/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.jam.desired;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class T9Spelling {
    
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ratnesh Kushwaha
 */
   public static void main(String args[])
    {
        File fin = new File("src/google/jam/desired/small.in");
        File fout = new File("src/google/jam/desired/small.out");
            
        PrintWriter out = null;
        Scanner in =null;
        try {
            out = new PrintWriter(fout);
            out.print("technology"+(char)13 + (char)10);
            in= new Scanner(fin);
            if(true)
            {
                
            }
//            int cases = in.nextInt();
//            in.nextLine();
//            for(int c=1; c<=cases;c++)
//            {
//            ////////////////////////////////////////////////////////////////////////////////////
//          String s = in.nextLine();
//          int len = s.length();
//          StringBuilder sb =new StringBuilder();
//          for (int i=0;i<len;i++)
//          {
//              char c1 = s.charAt(i);
//              
//              int val=(int)c1-97;
//              if(c1==' ')
//              {
//                  sb.append(0);
//              }
//              else if(c1=='s')
//              {
//                  sb.append("7777");
//              }
//              else if(c1=='t')
//              {
//                  sb.append("8");
//              }
//              else if(c1=='u')
//              {
//                  sb.append("88");
//              }
//              else if(c1=='v')
//              {
//                  sb.append("888");
//              }
//              else if(c1=='w')
//              {
//                  sb.append("9");
//              }
//              else if(c1=='x')
//              {
//                  sb.append("99");
//              }
//              else if(c1=='y')
//              {
//                  sb.append("999");
//              }
//              else if(c1=='z')
//              {
//                  sb.append("9999");
//              }
//              else
//                {
//                   int v =val%3;
//                   int v1=val/3+2;
//                   //System.out.println(sb);
//                   if(sb.toString().endsWith(String.valueOf(v1)))
//                       sb.append(" ");
//                       
//                   for(int k=0;k<=v;k++)
//                   {
//                       
//                           sb.append(v1);
//                   }
//                }
//              if(i<len-1 && c1==s.charAt(i+1))
//              {
//                  sb.append(' ');
//              }
//              
//              
//          }
//          out.println("CASE #"+c+": "+sb);     
                            
           ////////////////////////////////////////////////////////////////////////////////////// 
//            }
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
        finally {
            out.close();
            in.close();
        }
         
                
    }
    
}

