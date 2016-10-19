/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.io.*;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Io {
    
    public static void main(String... args)
    {
        try
        {
          File  f1 = new File("ra1t.txt");
          System.out.println(f1.createNewFile());
          FileWriter fw = new FileWriter(f1);
          PrintWriter pw =new PrintWriter(fw);
          
          pw.write("My name is ");
          pw.write("\nRatnesh");
          pw.flush();
          pw.close();
          
          FileReader fr =new FileReader(f1);
          BufferedReader br = new BufferedReader(fr);
          String s = br.readLine();
                  
          System.out.println(s);
        }
        catch(IOException e)
                {
                    
                }
        
    }
    
}
