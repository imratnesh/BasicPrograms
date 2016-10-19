/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.jam.desired;

import java.util.ArrayList;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Middlelevel {
   static int[][] num = new int[1000][1000];
        
    static int maxno_city(String[] input1)
    {
        double len = 0;
        int sum=1;
        for(String s :input1)
        {
            len= Math.max(len,Double.valueOf(s.split("#")[1]));
            num[Integer.valueOf(s.split("#")[0])][Integer.valueOf(s.split("#")[1])] =1;
            
        }
        
        for(int i=0;i<len;i++)
        {
           sum += check(i,(int)len);
        }
       
        return sum;
    }
    
    static int check(int i, int len)
    {
            for(int j=i+1;j<len;j++)
            {
                if(num[i][j]==1)
                    return 1;
            }
        return 0;
    }
    public static void main(String args[])
    {
        String[] s={"1#2","2#3","3#11","4#11","4#5","5#6","5#7","6#7","4#12","8#12","9#12","8#10","9#10","8#9"};
        System.out.println(maxno_city(s));
        
    }
}
