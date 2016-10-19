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
public class Factorial {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        int fact=1;
        for(int i =1;i<=num;i++)
        {
            fact *= i;
            
        }
        System.out.println(fact);
    }
}
