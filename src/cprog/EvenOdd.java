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
public class EvenOdd {
     public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        
        if (num!=0 && num%2==0)
        {
              System.out.println("Number is even");
          }
        else
        {
              System.out.println("Number is odd");
          }
    }
    
}
