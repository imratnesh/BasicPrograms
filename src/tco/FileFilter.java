/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

/**
 *Class:
FileFilter
Method:
filter
Parameters:
String[], String[]
Returns:
String[]
Method signature:
String[] filter(String[] files, String[] extensions)
(be sure your method is public)
    

 * 
 * 
 * 
 * @author Ratnesh Kushwaha
 */
public class FileFilter {
    
   String[] filter(String[] files, String[] extensions)
   {
       String[] stat = new String[files.length];
       int i=0;
       for(String f: files)
       {
         String[] d=  f.split("\\.");
//           if(d.length==2)
//               System.out.println(f.length());
           for(String s:extensions)
               
           { 
               System.out.println(s +d[1]);
               if(d[1].equalsIgnoreCase(s))
           {
               stat[i]= "Allow";
               break;
           }
           else
               stat[i]="Deny";
           }
           i++;
       }
       return stat;
   }
    public static void main (String args[])
    {
        String [] f = {"algorithm.txt","algorithms.html","wingl.exe","yourDoc.PIF","graph.gIf"};
        String[]s= {"txt","html","gif","doc"};
        FileFilter obj = new FileFilter();
        String[] d1= obj.filter(f,s);
        for (String st: d1 )
        {
            System.out.println(st);
        }
    }
}
