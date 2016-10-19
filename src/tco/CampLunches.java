/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class CampLunches {
    
  static  int firstMatching(String[] menu1, String[] menu2)
    {
     
     int i;
       int j=0;
     for(i=0;i<6;i++,j++)
     {
                 if(i>menu1.length )
             if(menu1[i].equals(menu2[j]))
             {
                break;
                
             }
         
     }
    
       return i; 
    }
    
    public static void main (String args[])
    {
        String[]  m1  = {"pbj", "pizza"};
        String[]  m2= {"pizza", "pbj"};
        int firstMatching1;
        firstMatching1 = firstMatching (m1,m2);
       System.out.print(firstMatching1);
//round 1adiv1.txt
    }
}
