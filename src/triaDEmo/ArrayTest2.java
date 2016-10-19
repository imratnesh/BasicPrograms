/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triaDEmo;

/**
  *  ==============================================================
  *  ArrayTest2.java: This java program demonstrates how to create
  *  a list of triangle objects
  * 
  *  Uses: Triangle1.java, Edge.java and Node.java
  * 
  *  Written by: Mark Austin                         November, 2004 
  *  ==============================================================
  */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayTest2 {

   public static void main( String args[] ) {

      // Initialize linked list for triangles....

      List triangleList = new ArrayList();

      // Create triangle "A" ...

      Triangle1 tA = new Triangle1();
      tA.sName = "A";

      tA.node1    = new Node();
      tA.node2    = new Node();
      tA.node3    = new Node();

      tA.node1.dX = 3.0; tA.node1.dY = 0.0; tA.node2.setName ("n1");
      tA.node2.dX = 3.0; tA.node2.dY = 4.0; tA.node3.setName ("n2");
      tA.node3.dX = 0.0; tA.node3.dY = 0.0; tA.node1.setName ("n3");

      tA.edge1 = new Edge( "e1", tA.node1, tA.node2 );
      tA.edge2 = new Edge( "e2", tA.node2, tA.node3 );
      tA.edge3 = new Edge( "e3", tA.node3, tA.node1 );

      // Create triangle "B" ...

      Triangle1 tB = new Triangle1();
      tB.sName = "B";

      tB.node1    = new Node();
      tB.node2    = new Node();
      tB.node3    = new Node();

      tB.node1.dX = 1.0; tB.node1.dY = 0.0; tB.node2.setName ("n1");
      tB.node2.dX = 1.0; tB.node2.dY = 4.0; tB.node3.setName ("n2");
      tB.node3.dX = 1.0; tB.node3.dY = 1.0; tB.node1.setName ("n3");

      tB.edge1 = new Edge( "e1", tB.node1, tB.node2 );
      tB.edge2 = new Edge( "e2", tB.node2, tB.node3 );
      tB.edge3 = new Edge( "e3", tB.node3, tB.node1 );

      // Create triangle "C" ...

      Triangle1 tC = new Triangle1();
      tC.sName = "C";

      tC.node1    = new Node();
      tC.node2    = new Node();
      tC.node3    = new Node();

      tC.node1.dX =  2.0; tC.node1.dY =  0.0; tC.node2.setName ("n1");
      tC.node2.dX = -1.0; tC.node2.dY = -4.0; tC.node3.setName ("n2");
      tC.node3.dX =  2.0; tC.node3.dY = -1.0; tC.node1.setName ("n3");

      tC.edge1 = new Edge( "e1", tC.node1, tC.node2 );
      tC.edge2 = new Edge( "e2", tC.node2, tC.node3 );
      tC.edge3 = new Edge( "e3", tC.node3, tC.node1 );

      // Add triangle objects to list .. A, C ... and then B

      triangleList.add( tA );
      triangleList.add( tC );
      triangleList.add( tB );

      // Print details of triangle objects...

      System.out.println("Print triangles                  " );
      System.out.println("=================================" );

      Iterator iterator1 = triangleList.iterator();
      while ( iterator1.hasNext() != false ) {
          Triangle1 tp = (Triangle1) iterator1.next();
          System.out.println( tp.toString() );
      }
   }
}
