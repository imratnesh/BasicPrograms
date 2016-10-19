/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cprog;

import java.util.Locale;

/**
 *
 * @author Ratnesh
 */
public class IpAdress {
   static boolean check=true;
    
    
   public static void main (String [] args)
   {
       String ip = "10.15.254.252.";
       int i=0;int k=0;
       int len = ip.length();
//       System.out.print(len);
//       if( len <7 || len>15)
//       {
//           System.out.println("Invalid ip");
//       }
//      
//       while (i<len)
//       {
//           if( !(( ip.charAt(i)>='0' && ip.charAt(i)<='9')|| ip.charAt(i)== '.') )
//           {
//               System.out.println("Invalid ip1");
//           }
//           if (ip.charAt(i)== '.')
//           { k++;
//           
//           }
//           
//           i++;
//       }
//       if (k!=3)
//        System.out.println("Invalid ip");   
   String s[]=ip.split("\\.");
//       for (String s1 : s) {
//           System.out.println(s1);
//       }
       System.out.println(ip.substring(ip.length()-2,ip.length()-1));
   if(s.length>4){
       check=false;
       System.out.println("Invalid ip");
   } else
   {
       
       for(String s1: s)
       {
           if(Integer.parseInt(s1)<0 || Integer.parseInt(s1)>255 )
           {
               check=false;
               System.out.println("Invalid ip");
               break;
           }
      // System.out.println(s1);
       }
         }
       if(check!=false)
       {
           System.out.println("Valid ip");
       }
        
   }
    
}
