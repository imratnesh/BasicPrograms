/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.jam.reverse;

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
public class ReverseWords {
    
    public static void main(String args[])
    {
//        FileReader fr = null;
        try {
            File in = new File("src/google/jam/reverse/small.in");
//            fr = new FileReader(in);
//            BufferedReader br = new BufferedReader(fr);
            File out = new File("src/google/jam/reverse/small.out");
            PrintWriter pw= new PrintWriter(out);
            Scanner sin = new Scanner(in);
            //////////////////////////////////////////////////////////////////////////////
            
//            int input = Integer.parseInt(br.readLine());
            int input = sin.nextInt();
            sin.nextLine();
            for(int i=1;i<=input;i++)
            {
              String[] s = sin.nextLine().split(" ");
              int length =s.length;
              StringBuilder sb = new StringBuilder();
              for(int j=length-1;j>=0;j--)
              {
                   sb.append(" "+s[j]);
              }
              pw.write("CASE #"+i+":"+sb+"\n");
            }
            //////////////////////////////////////////////////////////////////////////////////
            pw.close();
//            fr.close();
        } 
        catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } 
        catch (IOException ex) {
            System.out.println(ex.toString());
        } 
        
        
    }
    
}
