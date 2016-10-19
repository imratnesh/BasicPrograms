/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class CoolNumbers {
    public int count(int lowerBound, int upperBound)
    {
        int val=0;
        for(int i=lowerBound;i<=upperBound ;i++)
                {
                   if(Integer.toBinaryString(i).contains("111") || Integer.toBinaryString(i).contains("000")){
                    val++;   
                   }
                }
        return  val;
    }
    public int getLength(String s)
    {
        int len=0;
        String m1 = null;
        Pattern p = Pattern.compile("\\D([\\d]/(\\d+/))\\D");
        Matcher m =p.matcher(s);
//        System.out.println(m);
//        for(int i=0;i<Integer.parseInt(m.group(1));i++)
//        {
//            m1= m.replaceAll("$2");
//        }
//        ;
        System.out.println(m.group(1));
        return len;
    }
    public static void main (String args[])
    {
        
        CoolNumbers cn =new CoolNumbers();
        int lowerBound = 2000000000;
        int upperBound = 2100000000;
                
                
       //System.out.println(cn.count(lowerBound, upperBound));
        System.out.println(cn.getLength("10342(76)"));
    }
    
}
