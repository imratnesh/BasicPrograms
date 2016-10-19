/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

/**
 *
 * @author Ratnesh Kushwaha
 */
//public class A {
//    
//    A()
//    {
//        System.out.println("A constructor");
//    }
//}
//class B extends A
//{
//    B(){
//    System.out.println("B constructor") ;
//    }
//}
//class C extends B
//{
//    public static void main(String args[])
//    {
//        C d= new C();
//        for (int a=0; a<25;a++){ 
//  for (int b=a+1;b<25;b++){  // use ascending-order rule 
//    for (int c=b+1;c<25;c++)
//            {
//                System.out.println(a+"--"+b+"--"+c);
//    }
//  }
//  
//    
//    }
//    }
//}
//
class A {
static String s = "-";
public static void main(String[] args) {
new A().s1();
System.out.println(s);
}
void s1() {
try { s2(); }
catch (Exception e) { s += "c"; }
}
void s2() throws Exception {
s3(); s += "2";
s3(); s += "2b";
}
void s3() throws Exception {
throw new Exception();
} }