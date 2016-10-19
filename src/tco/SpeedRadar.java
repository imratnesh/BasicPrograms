/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class SpeedRadar {
    static double avg;
    static int sum=0;
    static int  faulty=0;
   static public double averageSpeed(int minLimit, int maxLimit, int[] readings)
    {
        
        for(int val : readings)
        {           
        
        if(val<minLimit || val>maxLimit)
        {
            faulty++;
           // System.out.print("hhs");
        }
       
       else
        sum+=  val;
        //System.out.print(sum);
        }
       // System.out.println((faulty*100)/readings.length+"  "+ faulty);
        if(faulty>0 && (faulty*100)/readings.length>10)
        {
            
            return 0.0;
        }
        else
        {
            //System.out.println(readings.length);
            return sum/(double)(readings.length-faulty);
             
        }
        
    }
    
    public static void main(String args[])
    {
        int[] readings={42,43,44,45,46,47,48,49,50,51};
        
        int min=1;
        int max=50;
        avg = averageSpeed(min,max,readings);
        System.out.println(avg);
                
    }
}
