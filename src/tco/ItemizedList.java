/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class ItemizedList {
   
    
   int i=0, quantity;
   public String[] generateList(String[] items)
    {
      Set<String> s = new TreeSet(Arrays.asList(items));
      String[] newList = new String[s.size()];
      for(String s1 : s)
      {
          quantity=0;
          for(String s2: items)
          {
           if(s1==s2)
          {
              quantity++;
          }
          }
          newList[i]= "\""+s1+" - "+quantity+"\"";
          i++;
      }
        
      return newList;
              
    }
   
   public static void main(String args[])
   {
       String[] oldList = {"apple", "apple", "apple", "apple"};
       ItemizedList ls = new ItemizedList();
       System.out.println(Arrays.asList(ls.generateList(oldList)));
   }
    
}
