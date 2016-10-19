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
public class Leap {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        
        if (num!=0 && num%4==0 )
        {
            System.out.println("Leap Year");
            
        }
        else if(num%100 ==0)
        {
             System.out.println("Not Leap Year");
        }
        else
            System.out.println(" Not leap year ");
    }
    
}
