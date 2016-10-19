/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triaDEmo;

/**
 *
 * @author Ratnesh Kushwaha
 */

public class Edge {
   protected Node node1, node2;
   protected String sName;

   // Constructor methods ....

   public Edge() {}

   public Edge( Node node1, Node node2 ) {
      this.node1 = node1;
      this.node2 = node2;
   }

   public Edge( String sName, Node node1, Node node2 ) {
      this.node1 = node1;
      this.node2 = node2;
      this.sName   = sName;
   }

   // Compute edge length ...

   public double length () {
       return node1.sub(node2).length();
   }

   // Convert node to a string ...

   public String toString() {
      return "Edge(\"" + sName + "\") connects nodes (" + node1.sName + ", " + node2.sName + ")";
   }

   // Exercise methods in the Edge class .....

   public static void main( String args[] ) {

      System.out.println( "Exercise methods in Edge class" );
      System.out.println( "==============================" );

      // Create "Edge 1" .....

      Edge eA  = new Edge();
      eA.node1 = new Node ("Point 1", 0.0,0.0);
      eA.node2 = new Node ("Point 2", 5.0,0.0);
      eA.sName  = "Edge 1";

      // Create "Edge 2" and "Edge 3" ....

      Node node3 = new Node ("Point 3", 5.0,5.0);
      Edge eB    = new Edge ("Edge 2", eA.node2, node3 );
      Edge eC    = new Edge ("Edge 3", node3, eA.node1 );

      // Create details of edges ....

      System.out.println( eA.toString() );
      System.out.println( eB.toString() );
      System.out.println( eC.toString() );

      // Compute and print lengths of each edge ....

      System.out.println( "Length (" + eA.sName + ") = " + eA.length() );
      System.out.println( "Length (" + eB.sName + ") = " + eB.length() );
      System.out.println( "Length (" + eC.sName + ") = " + eC.length() );

   }
}
