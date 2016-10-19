/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class PiCalculator {
//    
//    
////    String val;
////    int pi=22 ;
//    String s="";
//    int rem=1;
//   public  String calculate(int precision)
//    {
//      
//        for(int i=0;i<precision;i++)
//        {
//             System.out.println("remainder"+rem);
//             s+= String.valueOf((rem*10)/7);
//             System.out.println(s);
//             rem = (rem*10)%7;
//             
//            
//        }
//       
//    
//       
//        return "3."+s;
//    }
//   
//public int numBlocks(int[] length, int[] width)
//{
//    int blocks=0;
//int l=width.length;
//for(int i=0;i<l;i++)
//{
//blocks += ((length[i]/2)*(width[i]/2));
////System.out.println(blocks);
//}
//return blocks/9;
//}
    public static void main(String args[])
    {
        PiCalculator pc = new PiCalculator();
        System.out.println(pc.calculate(4));
////        System.out.println(String.valueOf(Math.PI));
//        int[] x={ 606, 517, 358, 813, 522, 766, 795, 661, 572, 465,
//  729, 290, 905,  61, 187, 147, 449, 531,  44, 969,
//  337, 539, 232, 936, 117, 579, 115, 402, 486, 510,
//  952, 400, 691, 287, 919, 323, 581, 943, 730, 652,
//   48, 847, 490, 386,  21,  86,  70, 869, 415, 334 };
//        int[] y={  36,  2, 35, 37,  1, 28, 11,  9,  5, 22,
//    7, 12, 34,  6, 26, 29,  5, 24, 13, 36,
//   21, 26, 37,  7,  9, 27, 35, 13,  9, 14,
//    3,  1,  8, 18,  6,  7, 20, 26,  8, 32,
//   10, 32, 20,  9, 10,  6, 19, 18, 24,  7 };
////        System.out.println(pc.numBlocks(x,y));
//        double v = 15.0/8.0;
//        System.out.println(Math.round(v));
    }
//    
//}
//public class PiCalculator {
 	 String s="3.141592653589793238462643383279";
    int rem=1;
    double sum=0;
   public  String calculate(int precision)
    {
//        for(double i=0;i<precision;i++)
//        {
//            if(i%2==0)
//            sum+=1/(2*i-1);
//            else SRM 246 div1
//            sum+=-1/((2*i)-1);
//        }
//        double pi=2*(Math.asin(Math.sqrt(1-Math.pow(precision, 2))))+ Math.abs(Math.asin(precision));
//        MathContext mc =  MathContext.DECIMAL128;
//        String PI= String.valueOf(BigDecimal.valueOf(355).divide(BigDecimal.valueOf(113), mc ));
//        double pi= (Double.valueOf(PI.subSequence(0, precision+2).toString()));
//        return String.valueOf(pi);
//                .divideToIntegralValue(BigDecimal.valueOf(7), MathContext.DECIMAL128));
        
        String pi= s.subSequence(0, precision+2).toString();
        if(Double.valueOf(pi.charAt(precision+1))>5)
        {
           return pi.replace(pi.charAt(precision+1) , (char)(Integer.valueOf(pi.charAt(precision+1)+1).intValue()));
        }
        else
           return pi.replace(pi.charAt(precision+1) , (char)(Integer.valueOf(pi.charAt(precision+1)-1).intValue()));
        //String s1= String.valueOf((Double.valueOf(pi)));
        
            
    }
}