/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triaDEmo;

import java.util.Vector;

/**
 *
 * @author Ratnesh Kushwaha
 */
/**
  *  =========================================================
  *  Node.java: Java class for nodes in a simple polygon.
  *             The class node extends class vector.
  * 
  *  Written by: Mark Austin                    November, 2004 
  *  =========================================================
  */

public class Node extends Vector {
   protected String sName;

   // Constructor methods ....

   public Node() {
      super( 0.0, 0.0 );
   }

   public Node( double dX, double dY ) {
      super( dX, dY );
   }

   public Node( String sName, double dX, double dY ) {
      super( dX, dY );
      this.sName = sName;
   }

   // Set name for the node ...

   public void setName( String sName ) {
      this.sName = sName;
   }

   // Convert node to a string ...

   public String toString() {
      return "Node(\"" + sName + "\") is at (" + dX + "," + dY + ")";
   }

   // Exercise methods in the Node class .....

   public static void main( String args[] ) {

      // Create and print "point 1", a node at coordinate (1,2)...

      Node nA = new Node();
      nA.dX = 1.0;
      nA.dY = 2.0;
      nA.sName  = "Point 1";

      System.out.println( nA.toString() );

      // Create and print "point 2", a node at coordinate (5,2)...

      Node nB = new Node ("Point 2", 5.0, 5.0 );
      System.out.println( "\n" + nB );
      System.out.println( "Vector Magnitude =" + nB.length() );

   }
}
