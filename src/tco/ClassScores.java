/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * srm258div2
 * @author Ratnesh Kushwaha
 */
public class ClassScores {
    
    int cnt=0,j; 
    private int i;
    int[] findMode(int[] scores)
    {
        Set<Integer> m = new TreeSet<Integer>();
              
        for(i=0;i<scores.length;i++)
        {
            for(j=0;j<scores.length;j++)
            {
                if(scores[i]==scores[j] && i!=j )
                
                {cnt++;
                m.add(scores[i]);
                }
            }
        }
        int k[]= new int[m.size()];
        i=0;
        for (Iterator<Integer> it = m.iterator(); it.hasNext();) {
            Integer integer = it.next();
            k[i++] =integer;
            
        }
      
      System.out.println(m.size());

      if(m.size()==0)
      {
          Arrays.sort(scores);
          return scores;
      }
          else
        return k;
    }
    public static void main(String args[])
    {
        int[] nums ={92, 56, 14, 73, 22, 38, 93, 45, 55};
        
        ClassScores cs = new ClassScores();
         int[] n = cs.findMode(nums);
         
        for(int j : n)
         System.out.println(j);
    }
}
