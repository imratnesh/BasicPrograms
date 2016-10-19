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
public class Fibonacci {
    public static void main (String args[])
    {
        Scanner in  = new Scanner(System.in);
        int num;
        num = in.nextInt();
        int a1,a2,sum;
        a1=0;
        a2=1;
        System.out.println(a1);
        System.out.println(a2);
        
        for (int i=0;i<num;i++)
        {
            sum = a1+ a2;
           System.out.println(sum);
           a1=a2;
           a2=sum;
                      
        }
         
        
        
    }
    
}
