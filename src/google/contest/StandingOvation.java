/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.contest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class StandingOvation {
    
    
/**
 *
 * @author Ratnesh Kushwaha
 */
   public static void main(String args[])
    {
        File fin = new File("src/google/contest/small.in");
        File fout = new File("src/google/contest/small.out");
            
        PrintWriter out = null;
        Scanner in =null;
        try {
            out = new PrintWriter(fout);
            in= new Scanner(fin);
            int cases = in.nextInt();
            for(int c=1; c<=cases;c++)
            {
                ////////////////////////////////////////////
                String s = in.nextLine();
                int smax = in.nextInt();
                String str = in.next();
                int stand =0;
                int cnt=0;
                for(int i=0;i<smax+1;i++)
                {
                    int shy =  Integer.parseInt(String.valueOf(str.charAt(i)));
                    if(stand==i)
                    {
                        stand+= shy;
                    }
                    else if( shy!=0)
                    {
                        cnt++;
                    }
                }
                out.print("Case #"+c+": "+cnt);
                    
                out.println();
                ////////////////////////////////////////////////////////////////////////////
            }
            
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
