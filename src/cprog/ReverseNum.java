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
public class ReverseNum {
    
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp =num;
        int i, rev = 0;
        
        for (i=0;temp!=0;i++)
        {
          temp /=10;
        }
        System.out.println(i);
        for (int j = i; num!=0; j--) {
            //num = num %10;
            rev += (int) (num%10 * Math.pow(10, j-1));
            num /= 10;
        }
        System.out.println(rev);
    }
    
}
