/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

/**
 *
 * 
 * Class: Comment
Method: strip
Parameters: String[]
Returns: String[]
Method signature: String[] strip(String[] code)
(be sure your method is public)

 * @author Ratnesh Kushwaha
 */
public class Comment {
    String[] strip(String[] code)
    {
        String[] comment= new String[code.length];
        
        for(String s: comment)
        {
            
        }
        
        return comment;
    }
            
    public static void main(String args[]){
        Comment obj = new Comment();
        String[] d= {"public class Comment{"
," public String[] strip(String[] code){"
,"//this isn't right!"
,"  return code;"
," }"
,"}"};
        obj.strip(d);
    }
            
}
