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
public class SwapString {
    static String s2="" ;
    public static void main(String args[])
    {
        int j=0;
//        Scanner in =new Scanner(System.in);
        String s1 = "abcd";
        
        int len=s1.length();
        
        for(int i=len-1;i>=0;i--)
        {
            s2.concat(String.valueOf(s1.charAt(i)));
            j++;
        }
         
        System.out.println(s2);
        
        
    }
}
