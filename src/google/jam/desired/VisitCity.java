/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.jam.desired;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class VisitCity {
  
    public static int visitCity(int[] input1,String[] input2)
    {
        //Write code here
        StringBuilder sb =new StringBuilder();
        int sum =1000;
        sb.append(input1[0]);
        int length =input1.length;
        int[][] n = new int[length][length];
        int r=0;
       
        
        for(String s: input2)
        {
        for(int j =0;j<length;j++)
        {
            
            n[r][j]=Integer.valueOf(s.split("#")[j]);
//            System.out.print(n[r][j]);
            
        }
//        System.out.println();
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
                
            boolean b= sb.toString().endsWith(String.valueOf(input1[length-1]));
            int s1=checkSum(sb);
            if(checkMult(sb.toString()) && sum>=s1)
            {
                if(b)
                sum = s1;
//                System.out.println("---"+sum);
            }
            else 
            {
                sb.deleteCharAt(sb.length()-1);
//                continue;
            }
          }
        }
        return sum;
    } 
    
    
    public static void main(String args[])
    {
        int[] r ={1,2,1,4};
        String [] c ={"0#1#1#1","1#0#0#1","1#0#0#1","1#1#1#0"};
        System.out.println(visitCity(r,c));
    }

    private static boolean checkMult(String sb) {
    
//        System.out.print(sb);
        int num = Integer.valueOf(sb);
        for(int i=0;i<sb.length();i++ )
        {
            String val =String.valueOf(sb.charAt(i));
//            System.out.println("==c :"+sb.charAt(i)+"..."+num+"[]"+val);
            
          if(num%Integer.valueOf(val)!=0)
          {
//              System.out.println("false");
              return false;
          }
        }
        return true;
        
    }

    private static int checkSum(StringBuilder sb) {
    int num =0;
        for(char c: sb.toString().toCharArray())
        {
          num += Integer.valueOf(String.valueOf(c));
        }
        return num;
    }

}
