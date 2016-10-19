/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.jam.desired;

import static google.jam.desired.VisitCity.visitCity;
import java.math.BigInteger;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class vC {
  
    public static int visitCity(int[] input1,String[] input2)
    {
        //Write code here
        StringBuilder sb =new StringBuilder();
        int sum =0;
        sb.append(input1[0]);
        int length =input1.length;
        int[][] n = new int[length][length];
        int r=0;
       
        
        for(String s: input2)
        {
        for(int j =0;j<length;j++)
        {
            
            n[r][j]=Integer.valueOf(s.toString().split("#")[j]);
            System.out.print(n[r][j]);
            
        }
        System.out.println();
        r++;
        }
        
        
        for(int i=0;i<length;i++)
        {
        for(int j=0;j<length;j++)
        {
            if(n[i][j]==1)
            sb.append(input1[j]);
            else
            continue; 
                
            System.out.println(sb+"--"+i+"--"+j);
            int s1=checkSum(sb);
            
            if(checkMult(sb))
            {
                sum = s1;
                System.out.println("---"+sum);
            
            }
            else
            {
//                sb.deleteCharAt(sb.length()-1);
                continue;
            }
                
        }
        }
        return  BigInteger.valueOf(Long.valueOf(sb.toString())).intValue();
        
    } 
    
    
    public static void main(String args[])
    {
        int[] r ={1,2,4,1};
        String [] c ={"0#1#1#1","1#0#0#1","1#0#0#1","1#1#1#0"};
        System.out.println(visitCity(r,c));
    }

    private static boolean checkMult(StringBuilder sb) {
    
        System.out.print(sb);
        BigInteger num = BigInteger.valueOf(Long.valueOf(sb.toString()));
        for(int i=0;i<sb.length();i++ )
        {
            BigInteger val =BigInteger.valueOf(1L);
            boolean b =   num.remainder((BigInteger.valueOf(Long.valueOf(sb.charAt(i)))))!= BigInteger.ZERO;

            System.out.println("==c :"+sb.charAt(i)+"..."+num+"[]:"+val+":[]"+num.remainder((BigInteger.valueOf(Long.valueOf(sb.charAt(i))))));
            
          if(b)
          {
              System.out.println("false");
              return false;
          }
        }
        return true;
        
    }

    private static int checkSum(StringBuilder sb) {
    int sum =0;
        for(char c: sb.toString().toCharArray())
        {
          sum += (int)c;
        }
        return sum;
    }

}
