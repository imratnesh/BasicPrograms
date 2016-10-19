/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.jam.store;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class StoreCredit {
    
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
        File fin = new File("src/google/jam/store/small.in");
        File fout = new File("src/google/jam/store/small.out");
            
        PrintWriter out = null;
        Scanner in =null;
        try {
            out = new PrintWriter(fout);
            in= new Scanner(fin);
            ////////////////////////////////////////////////////////////////////////////////////
          
            int cases = in.nextInt();
            for(int c=1; c<=cases;c++)
            {
                ////////////////////////////////////////////
                
            int credit = in.nextInt();
            int items = in.nextInt();
            in.nextLine();
            //in.nextLine();
            
            String[] list = in.nextLine().split(" ");
            //System.out.print(list.length);
            
            for(int i=0;i<items-1;i++)
            {
                for(int j=i;j<items;j++)
                {
                    if(credit == (Integer.parseInt(list[i])+Integer.parseInt(list[j])) && i!=j)
                    {
                        out.print("CASE #"+c+": ");
                        out.print(i+1+" ");
                        out.println(j+1);        
                    }
                }
            }
                ////////////////////////////////////////////
            }
            
           ////////////////////////////////////////////////////////////////////////////////////// 
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

