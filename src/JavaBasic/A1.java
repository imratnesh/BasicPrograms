/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

/**
 *
 * @author Ratnesh Kushwaha
 */
     import java.lang.instrument.Instrumentation;  
      
    class B1  
    {  
        /* Header Info 8 Byte */  
        int x; //4  
        float y;  // 4  
        long d; //8  
        String z; //4  
    }  
      
    class C1  
    {     
    }  
      
    public class A1  
    {  
        /* new concept */  
        public static void premain  
            (String args, Instrumentation ins)  
        {  
            B1 obj = new B1();  
            long size = ins.getObjectSize(obj);  
            System.out.println("B Size is "+size);  
            size = ins.getObjectSize(new C1());  
            System.out.println("C size is "+size);  
            String q ="test";  
            size = ins.getObjectSize(q);  
            System.out.println("Q String size is "+size);  
        }  
        public static void main(String[] args)  
        {  
            System.out.println("Inside Main ");  
            //A1 a = new A1();
             Instrumentation ins = null;
            A1.premain(args[0], ins);
        }  
    }  