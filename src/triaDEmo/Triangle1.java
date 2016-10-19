/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triaDEmo;

/**
 *
 * @author Ratnesh Kushwaha
 */
/*
 *  ==========================================================================
 *  Triangle1.java : This Java 2 program prompts a user for three pairs of
 *  (x,y) coordinates and computes and prints the perimeter and area of the
 *  triangle.
 *
 *  Written By : Mark Austin                                    December, 2002
 *  ==========================================================================
 */

import java.lang.Math;
import java.util.*;
import java.io.*;
import java.text.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Triangle1 {
    protected Node node1, node2, node3;
    protected Edge edge1, edge2, edge3;
    protected String sName;

    // Constructor methods ....

    public Triangle1() {}

    public Triangle1( double dX1, double dY1,
                     double dX2, double dY2,
                     double dX3, double dY3 ) {

       this.sName = null;
       this.node1    = new Node();
       this.node2    = new Node();
       this.node3    = new Node();

       node1.dX = dX1; node1.dY = dY1; node2.setName ("n1");
       node2.dX = dX2; node2.dY = dY2; node3.setName ("n2");
       node3.dX = dX3; node3.dY = dY3; node1.setName ("n3");

       this.edge1 = new Edge( "e1", this.node1, this.node2 );
       this.edge2 = new Edge( "e2", this.node2, this.node3 );
       this.edge3 = new Edge( "e3", this.node3, this.node1 );
    }

    public Triangle1( String sName, double dX1, double dY1,
                                   double dX2, double dY2,
                                   double dX3, double dY3 ) {

       this.sName = sName;
       this.node1 = new Node();
       this.node2 = new Node();
       this.node3 = new Node();

       node1.dX = dX1; node1.dY = dY1; node2.setName ("n1");
       node2.dX = dX2; node2.dY = dY2; node3.setName ("n2");
       node3.dX = dX3; node3.dY = dY3; node1.setName ("n3");

       this.edge1 = new Edge( "e1", this.node1, this.node2 );
       this.edge2 = new Edge( "e2", this.node2, this.node3 );
       this.edge3 = new Edge( "e3", this.node3, this.node1 );
    }

    //  ===================================================
    //  Retrieve X and Y coordinates of a polygon point....
    //  ===================================================

    public double getCentroidX() {
       return ( node1.dX + node2.dX + node3.dX )/3.0;
    }

    public double getCentroidY() {
       return ( node1.dY + node2.dY + node3.dY )/3.0;
    }

    // =====================================
    // Compute perimeter of triangle ....
    // =====================================

    public double perimeter() {
        return edge1.length() + edge2.length() + edge3.length();
    }

    // =====================================
    // Compute area of triangle ....
    // =====================================

    public double area() {
        double dS = perimeter()/2.0;
        double dArea = Math.sqrt( dS*(dS - edge1.length()) *
                                     (dS - edge2.length()) *
                                     (dS - edge3.length()) );
        return dArea;
    }

    /*
     *  ==========================================================
     *  pointInsideTriangle(): Test to see if a (x,y) coordinate is
     *                         inside a triangle
     * 
     *  Arguments: 
     *  -- double dX: X coordinate 
     *  -- double dY: Y coordinate 
     *  =========================================================
     */

    public boolean pointInsideTriangle( double dX, double dY ) {
       int iCounter = 0;
       double xinters;
       double   slope;

       // ================================================================
       // Intersection of horizontal line and edge 1 (i.e., nodes 1 and 2)
       // ================================================================

       // Test. Is dY between the y values of nodes 1 and 2?...

       if (dY  > Math.min ( edge1.node1.dY, edge1.node2.dY ) &&
           dY <= Math.max ( edge1.node1.dY, edge1.node2.dY ) ) {

               if ( (dX <= Math.max( edge1.node1.dX, edge1.node2.dX )) &&
                    (edge1.node1.dY != edge1.node2.dY) ) {

                         // Compute slope (i.e., dx/dy) of edge ...

                         slope = (edge1.node2.dX - edge1.node1.dX)/
                                 (edge1.node2.dY - edge1.node1.dY);

                         // Compute x coordinate where edge intersects
                         // horizontal line....

                         xinters = ( dY - edge1.node1.dY)*slope + edge1.node1.dX;

                         // Increment counter for no of line crossings ...

                         if ( edge1.node1.dX == edge1.node2.dX || dX <= xinters ) 
                             iCounter = iCounter + 1;
               }
       }

       // ================================================================
       // Intersection of horizontal line and edge 2 (nodes 2 and 3)
       // ================================================================

       // Test. Is dY between the y values of nodes 2 and 3?...

       if (dY  > Math.min ( edge2.node1.dY, edge2.node2.dY ) &&
           dY <= Math.max ( edge2.node1.dY, edge2.node2.dY ) ) {

               if ( (dX <= Math.max( edge2.node1.dX, edge2.node2.dX )) &&
                    (edge2.node1.dY != edge2.node2.dY) ) {

                         // Compute slope (i.e., dx/dy) of edge ...

                         slope = (edge2.node2.dX - edge2.node1.dX)/
                                 (edge2.node2.dY - edge2.node1.dY);

                         // Compute x coordinate where edge intersects
                         // horizontal line....

                         xinters = ( dY - edge2.node1.dY)*slope + edge2.node1.dX;

                         // Increment counter for no of line crossings ...

                         if ( edge2.node1.dX == edge2.node2.dX || dX <= xinters) 
                             iCounter = iCounter + 1;
 
               }
       }

       // ================================================================
       // Intersection of horizontal line and edge 3 (nodes 3 and 1)
       // ================================================================

       // Test. Is dY between the y values of nodes 3 and 1?...

       if (dY  > Math.min ( edge3.node1.dY, edge3.node2.dY ) &&
           dY <= Math.max ( edge3.node1.dY, edge3.node2.dY ) ) {

               if ( (dX <= Math.max( edge3.node1.dX, edge3.node2.dX )) &&
                    (edge3.node1.dY != edge3.node2.dY) ) {

                         // Compute slope (i.e., dx/dy) of edge ...

                         slope = (edge3.node2.dX - edge3.node1.dX)/
                                 (edge3.node2.dY - edge3.node1.dY);

                         // Compute x coordinate where edge intersects
                         // horizontal line....

                         xinters = ( dY - edge3.node1.dY)*slope + edge3.node1.dX;

                         // Increment counter for no of line crossings ...

                         if ( edge3.node1.dX == edge3.node2.dX || dX <= xinters) 
                             iCounter = iCounter + 1;
               }
       }

       // Test to see if number of intersections is odd or even....

       if (iCounter % 2 == 0)
          return false;
       else
          return true;

    }

    // Convert details of triangle to a string ...

    public String toString() {
        return "Triangle: \"" + sName + "\"\n" +
               "================================= \n" +
               edge1.toString() + "\n" +
               edge2.toString() + "\n" +
               edge3.toString() + "\n" +
               node1.toString() + "\n" +
               node2.toString() + "\n" +
               node3.toString() + "\n" +
               "================================= \n";
    }

    // Exercise methods in triangle class ....

    public static void main( String args[] ) {
        String sLine;

        // [a] Create a triangle and node objects ...

        Triangle1 t = new Triangle1();
        t.node1    = new Node();
        t.node2    = new Node();
        t.node3    = new Node();

        // [b] Set coordinates for triangle ...

        t.node1.dX = 3.0; t.node1.dY = 0.0; t.node2.setName ("n1");
        t.node2.dX = 3.0; t.node2.dY = 4.0; t.node3.setName ("n2");
        t.node3.dX = 0.0; t.node3.dY = 0.0; t.node1.setName ("n3");

        // [c] Create edge objects .....

        t.edge1 = new Edge( "e1", t.node1, t.node2 );
        t.edge2 = new Edge( "e2", t.node2, t.node3 );
        t.edge3 = new Edge( "e3", t.node3, t.node1 );

        // [d] Exercise the toString(), perimeter() and area() methods ...

        System.out.println( "Test output with toString() method" );
        System.out.println( t.toString() );
        System.out.println("Perimeter = " + t.perimeter() );
        System.out.println("Area      = " + t.area() );

        System.out.println( "Test pointInsideTriangle() method ..." );
        if( t.pointInsideTriangle( 1.0, 1.0 ) == true )
            System.out.println("*** Point (1,1) is INSIDE triangle");
        else
            System.out.println("*** Point (1,1) is OUTSIDE triangle");

        if( t.pointInsideTriangle( 3.0, 1.0 ) == true )
            System.out.println("*** Point (3,1) is INSIDE triangle");
        else
            System.out.println("*** Point (3,1) is OUTSIDE triangle");

        if( t.pointInsideTriangle(  3.5, 1.0 ) == true )
            System.out.println("*** Point ( 3.5, 1) is INSIDE triangle");
        else
            System.out.println("*** Point ( 3.5, 1) is OUTSIDE triangle");

        if( t.pointInsideTriangle( -3.0, 1.0 ) == true )
            System.out.println("*** Point (-3,1) is INSIDE triangle");
        else
            System.out.println("*** Point (-3,1) is OUTSIDE triangle");

    }
}
