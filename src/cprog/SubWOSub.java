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
public class SubWOSub {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sub;
        sub = num1 + ~num2 +1;
        System.out.println(sub);
         
    }
    
}
