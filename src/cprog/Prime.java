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
public class Prime {
 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i;
        for( i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("Number is not prime");
                System.exit(0);
            }
            
        }
        if(i==num)
            {
                System.out.println("Number is  prime");
            }
    }
}
