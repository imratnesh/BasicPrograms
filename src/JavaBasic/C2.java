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

class ObjectSizeFetcher {
    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
        return instrumentation.getObjectSize(o);
    }
}
public class C2 {
     int x;
     int y;

    public static void main(String [] args) {
        C2 c = new C2();
        c.x=5;
        c.y=10;
        System.out.println(ObjectSizeFetcher.getObjectSize(c));
    }
}