/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class PatternClass {
    public static void main(String args[])
    {
        String num="My number is 7898617389 india";
        Pattern p = Pattern.compile("(\\D)(\\d{3})(\\d{7})(\\D)");
        Matcher m =p.matcher(num);
        String m1= m.replaceAll("$1$2-$3$4");
        System.out.println(m1);
        while(m.find())
        {
            System.out.println(m.group());
        }
        
        String ip ="abcdbob";
        String regex= "\\b((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\b";
                    //"\\b ((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b"  
       
            System.out.println(ip +" is Valid? "+Pattern.matches("\\D(([b])(.)([b]))\\D", ip));
          
     
    }
}
