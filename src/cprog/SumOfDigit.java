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
public class SumOfDigit {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        int s=0,a1;
        for(int i=0;num!=0;)
        {
            a1 = num%10;
            num /= 10;
            s += a1* Math.pow(10,i);
        }
        
        System.out.println(s);
    }
}
