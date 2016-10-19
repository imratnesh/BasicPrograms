/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Alliteration 
{
//    private boolean val;
    int count(String[] words)
    {
        int cnt =0;
        boolean val;
        for(int i=0;i<words.length-1;i++)
        {
        val=false;
        //System.out.println(i+"---");
            
        	 for(int j=i+1;j<words.length;j++)
        {
            if(words[i].substring(0,1).equalsIgnoreCase(words[j].substring(0,1)))
            {
//                System.out.println(i+"-==-"+j);
//                cnt++;
                val=true;
                i=j;
            }
            else
            {
            
//            System.out.println(i+"---"+j);
            break;
            }
            
            
        }
        if(val)
        {
        cnt++;
        }
        }
        return cnt;
            
    }
    public static void main(String args[])
    {
        String[] words= 
//        {"He", "has", "four", "fanatic", "fantastic", "fans"};

        {"Round", "the", "rugged", "rock", "the", "ragged", "rascal", "ran"};

        Alliteration a =new Alliteration();
        int n = a.count(words);
        System.out.print(n);
    }
}
