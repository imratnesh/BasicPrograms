/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tco;

/**
 *srm282div1
 * @author Ratnesh Kushwaha
 */
public class FixTheAverage {
    double add(double[] list, double target)
    {
        double sum = 0;
        for(double i:list)
        {
            sum+=i;
        }
        double result = target*(list.length+1)-sum;
        return result;
        
    }
    public static void main(String args[])
    {
        double[] list = { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
        double target=0;
        FixTheAverage fta =new FixTheAverage();
        double num=fta.add(list, target);
        System.out.print(num);
        
    }
}
