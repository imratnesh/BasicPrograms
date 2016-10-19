/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google.jam.desired;

/**
 *
 * @author Ratnesh Kushwaha
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class CandidateCode 
{ 
    public static int PalindromeLengthPuzzle(String[] input1)
    {
//        Write code here
//        int length = input1.length;
        int max=0;
        StringBuilder s = new StringBuilder();
//        if(length==0)
//            return max;
        
        for(String s1:  input1 )
        {
            s.append(s1.charAt(0));
        }
        System.out.println(s);
//        
//        for(int i=0;i<1000;i++)
//        {
//            String s="";
//           for(int j=0;j<1000;j++)
//           {
//               if(j==sb.length())
//               break;
//               System.out.println(max+"-"+i+"-"+j);
//              if(i<j)
//              s= sb.toString().substring(i,j);
//              else
//                  s= sb.toString()..substring(j,i);
//              
//              int len = s.length();
//              boolean b = checkPalindrome(s);
//              if(b && max < len)
//                  max =len;
//              
//               
//               
//           }
//           if(i==sb.length())
//               break;
//        }
//        
////        max= longestPalindromeDP(sb.toString()).length();
////        
//        return max;
//        
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
 
	if (s == null || s.length() == 0) {
		return result.size();
	}
 
	ArrayList<String> partition = new ArrayList<String>();
	addPalindrome(s.toString(), 0, partition, result);
 
        System.out.println(result);
	return result.size();
}
 
private static void addPalindrome(String s, int start, ArrayList<String> partition,
		ArrayList<ArrayList<String>> result) {
	//stop condition
	if (start == s.length()) {
		ArrayList<String> temp = new ArrayList<String>(partition);
		result.add(temp);
		return;
	}
 
	for (int i = start + 1; i <= s.length(); i++) {
		String str = s.substring(start, i);
		if (checkPalindrome(str)) {
			partition.add(str);
			addPalindrome(s, i, partition, result);
			partition.remove(partition.size() - 1);
		}
	}
}
 

    public static void main(String args[])
    {
//        String[] row = {"Bharti", "Bharat", "Akash", "Bhavya", "Chand", "Brijesh" ,"Chetak", "Arvind", "Bhavna"};
        String[] row ={"A","B","C","A"};
        System.out.println(CandidateCode.PalindromeLengthPuzzle(row));
    }

    private static boolean checkPalindrome(String s) {
        
        
        StringBuilder s1 = new StringBuilder();
        for(int i= s.length()-1; i>=0;i--)
        {
           s1.append(s.charAt(i)); 
        }
        //System.out.println(s+"......"+s1);
        if(s1.toString().contentEquals(s))
        {
           // System.out.println("--"+s1);
            return true;
        }
                return false;
    }
}