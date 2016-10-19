/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class PalindromeDecoding {
    
    private StringBuilder s= new StringBuilder();
    private StringBuilder s1= new StringBuilder();
    
    public String decode(String code, int[] position, int[] length)
    {
        s1.append(code);
        for(int i=0;i<position.length;i++)
        {
           
           s1.insert(length[i]+position[i],s.append(s1.substring(position[i],
                    position[i]+length[i])).reverse());
           s.delete(0, s.capacity());
           System.out.println(s1);
        }
        
        return s1.toString();
    }
    public static void main (String args[])
    {
        PalindromeDecoding pd = new PalindromeDecoding();
//       String s= "Misip";
//int [] pos={2,3,1,7};
//int []len ={1,1,2,2};
String s= "XY";
int [] pos={0,0,0,0};
int []len ={2, 4, 8, 16};
        pd.decode(s, pos, len);
//        System.out.println();
    }
    
}
