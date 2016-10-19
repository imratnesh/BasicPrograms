/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

/**
 *
 * @author Ratnesh Kushwaha
 */
class ClassDemo{
    
    int a , b;
    
    ClassDemo (int i, int j)
    {
        a=i;
        b=j;
    }     
    void meth(ClassDemo o)
    {
        a*=3;
        b/=2;
    }
    
}

public class ObjectDemo {
    public static void main (String args[])
    {
        ClassDemo ob = new ClassDemo(5,10) ;
        
        System.out.println(ob.a+ob.b);
        
        ob.meth(ob);
        System.out.println(ob.a+ob.b);
    }
}
