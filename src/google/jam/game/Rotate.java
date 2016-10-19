/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.jam.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Rotate {
    
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
        File fin = new File("src/google/jam/game/small.in");
        File fout = new File("src/google/jam/game/small.out");
            
        PrintWriter out = null;
        Scanner in =null;
        try {
            out = new PrintWriter(fout);
            in= new Scanner(fin);
            int cases = in.nextInt();
            for(int c=1; c<=cases;c++)
            {
                ////////////////////////////////////////////
                int row = in.nextInt();
                int ri = in.nextInt();
                in.nextLine();
                StringBuilder[] sb[] = new StringBuilder[row][row];
                for(int i=0;i<row;i++)
                {
                    String s = in.nextLine();
                    for(int j=0;j<row;j++)
                    {
                        if(j!=row-1 && s.charAt(j)=='B' && s.charAt(j+1)=='.')
                        {
                            sb[i][j]= new StringBuilder(".");
                            sb[i][j+1]= new StringBuilder("B");
                        }
                        else if(j!=row-1 && s.charAt(j)=='R' && s.charAt(j+1)=='.' )
                        {
                            sb[i][j]= new StringBuilder(".");
                            sb[i][j+1]= new StringBuilder("R");
                        }
                        else
                        {
                            sb[i][j]= new StringBuilder(String.valueOf(s.charAt(j)));
                        }
                        out.print(sb[i][j]);    
                    }
                    out.println();
                    
                }
                out.println("*********");
            
                ////////////////////////////////////////////
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

