/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaBasic;
import  java.io.*;
import java.net.*;
/**
 *
 * @author Ratnesh Kushwaha
 */
public class Internet_Read {
    private static int i;
    public static void main (String args[]) throws MalformedURLException, IOException
    {
        URL isr = new URL ("http://m.wikipedia.com");
        URLConnection uc = isr.openConnection();
        InputStream is = uc.getInputStream();
        //int i=0;
        while((i=is.read())!=-1)
            System.out.print((char)is.read());
        
        
    }
    
}
