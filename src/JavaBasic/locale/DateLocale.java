/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic.locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class DateLocale {
    
    public static void main(String args[])
    {
        Calendar c = new GregorianCalendar();
//        Calendar c1 = Calendar.getInstance();
//        c1.set(2014,11,5);
        Date d = c.getTime();
//        System.out.println(c.getTime().getDate()+"--"+c.getTime().getMonth()+"--"+c1.get(2));
        Locale l = new Locale("en");
        DateFormat dfIt = DateFormat.getDateInstance(DateFormat.SHORT, l);
        System.out.println(dfIt.format(d)+"--"+l.getDisplayLanguage(l));
        
        c.add(Calendar.DATE, 2);
        System.out.println(c.getTime());
        
    }
    
}
