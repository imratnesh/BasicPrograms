/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Problem Statement

Consider a two dimensional co-ordinate system with two axes; X & Y. 
 * This system is identified by positive integer co-ordinates. Meaning, 
 * every valid point in this system is represented by two values (x, y) where 0 < x,y <100.
 * 

 

You are given an input set of lines, specified by the co-ordinates of the two end-points.

Write a program to identify all closed shapes created by the specified lines.

Input Format (the program should accept this simple text file called "input.txt" placed in the classpath):


A1, B1; C1, D1

A2, B2; C2, D2

…

An, Bn; Cn, Dn

 

Expected Output (based on actual values of the input lines):

 

There are two triangles and 1 square based on the input.

Triangle 1  with vertices (a1,b1; a2, b2; a3,b3)

Triangle 2 with vertices (a5,b5; a6, b6; a7, b7)

Square 1 with vertices (a8, b8; a9, b9; a10, b10; a11, b11)

 

Note:

 

    The input data may be such that some shapes overlap.
    You don't have to find shapes formed by intersection of two shapes. 
 * For example, if a square and triangle overlap such that there is another
 *  * small triangle formed at the intersection, you don't have to report that.
 * 
    For the sake of scope, report only the following shapes, if any - triangle, any quadrilateral, pentagon.


Guidelines:

    You are expected to send us a working code base as the deliverable. We will need to see the source code 
 * and not just the binaries.
    Make suitable assumptions wherever necessary and list out those assumptions with your solution.
    No documentation is necessary. You can simply zip up the code and email it to this same address.
    Please ensure that your program is standalone and the requirement can be verified from the command line. 
 * Indicate the input parameters to be used if any.
    You can use Java 1.7 for this exercise. If you are unable to use this version for any reason,
 * indicate in your response the version of Java you have used for coding.
    Follow general design & programing best practices.


 */
package BigInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Ratnesh Kushwaha
 */
   
            
public class BigInfo {
    
   static List<Line> line = new ArrayList<Line>();
   static List<Point> points = new ArrayList<Point>();
   
    
    public static void main(String args[])
    {
        //int i=1;
        double x1,x2,y1,y2;
        Scanner in;
        File f =new File("F:\\myprojects\\BasicPrograms\\src\\BigInfo\\input.txt");
        
        try {
            in = new Scanner(f);
            int lineNumber = 0;
        while(in.hasNextLine()){
//            System.out.println(in.nextLine());
            String s= in.nextLine();
            
            String[] l;
            if(!s.isEmpty())
            {              
             l = s.split(";");               
//            Point p1 = new Point(4,6);
//            Point p2 = new Point(7,2);
            // Splitting and  creating coordinates with input line
            x1 = Double.parseDouble(l[0].split(",")[0]);
            y1 = Double.parseDouble(l[0].split(",")[1]);
            x2 = Double.parseDouble(l[1].split(",")[0]);
            y2 = Double.parseDouble(l[1].split(",")[1]);
            //System.out.println(s);
            int i1 = 0,i2 = 0;
            Point p1 = null;
            Point p2 = null;
            //two values (x, y) where 0 < x,y <100.
            if(x1>0 && x1<100 && x2>0 && x2<100 && y1>0 && y1<100 && y2>0 && y2<100)
            {
            //Creating list of unique points    
            i1=   Point.correct(x1,y1);
            i2=   Point.correct(x2,y2);        
                if(i1== -1)
                {
                    p1 = new Point(x1,y1);
                    points.add(p1);
                }
                if(i2== -1)
                {
                   p2 = new Point(x2,y2);
                   points.add(p2);}
                }
            
            if(i1!=-1 && i2!=-1)
            line.add(lineNumber, new Line(BigInfo.points.get(i1),BigInfo.points.get(i2)));
            else if(i1==-1 && i2!=-1 )
            line.add(lineNumber, new Line(p1,BigInfo.points.get(i2)));
            else if(i1!=-1 && i2==-1)
            line.add(lineNumber, new Line(BigInfo.points.get(i1),p2));
            else
            line.add(lineNumber, new Line(p1,p2));
               
            lineNumber++;
            
            }
           
        }

        in.close();
//        System.out.printf("%d lines\n", lineNumber);
//        System.out.println("points->"+points.size());
//        int arr[] = new int[lineNumber];
//        Point p1 = null,p2 = null,p3 = null,p4 = null,p5 = null;
        
        
        // Based on number giving lines as input
        
        if(lineNumber<=2)
        {
          //  System.out.println("No Shapes can be form");
        }
        else if(lineNumber<=3)
        {
           // System.out.println("Only triangle can possible");
            Triangle.checkTriangle(line.get(0),line.get(1),line.get(2));
        }
        else if(lineNumber<=4)
        {
//            System.out.println("Only triangle and 1 Quadrilateral can be possible");
            Triangle.checkTriangle(line.get(0), line.get(1), line.get(2));
            Triangle.checkTriangle(line.get(1), line.get(2), line.get(3));
            Triangle.checkTriangle(line.get(0), line.get(2), line.get(3));
            Triangle.checkTriangle(line.get(0), line.get(1), line.get(3));
            
//            for(int i=0;i<lineNumber-4;i++)
//            {
//                for(int j=i+1;j<lineNumber-3;j++)
//                {
//                    for(int k=i+2;k<lineNumber-2;k++)
//                    {
//                        System.out.println(i+"->"+j+"->"+k);
//                        Triangle.checkTriangle(line.get(i), line.get(j), line.get(k));
//                    }
//                }
//            }
            Quadrilateral.isQuadrilateral(line.get(0), line.get(1), line.get(2),line.get(3) );
        }
        else
        {
//            System.out.println("Any shape can be possible");
//            Triangle.checkTriangle(line.get(0), line.get(1), line.get(2));
//            Triangle.checkTriangle(line.get(1), line.get(2), line.get(3));
//            Triangle.checkTriangle(line.get(2), line.get(3), line.get(4));
//            Quadrilateral.isQuadrilateral(line.get(0), line.get(1), line.get(2),line.get(3) );
//            Quadrilateral.isQuadrilateral(line.get(1), line.get(2), line.get(3),line.get(4) );
//            Pentagon.checkPentagon(line.get(0), line.get(1), line.get(2),line.get(3), line.get(4));
          
            //Giving unique combination of lines
            for(int i=0;i<lineNumber;i++)
            {
                for(int j=i+1;j<lineNumber;j++)
                {
                    for(int k=j+1;k<lineNumber;k++)
                    {
                        
//                        System.out.println(i+"->"+j+"->"+k);
                        Triangle.checkTriangle(line.get(i), line.get(j), line.get(k));
                        
                    }
                }
            }
            for(int i=0;i<lineNumber;i++)
            {
                for(int j=i+1;j<lineNumber;j++)
                {
                    for(int k=j+1;k<lineNumber;k++)
                    {
                        for(int l=k+1;l<lineNumber;l++)
                    {
//                        System.out.println(i+"->"+j+"->"+k+"->"+l);
                        
                        Quadrilateral.isQuadrilateral(line.get(i), line.get(j), line.get(k),line.get(l));
                    }
                    }
                }
            }
            for(int i=0;i<lineNumber;i++)
            {
                for(int j=i+1;j<lineNumber;j++)
                {
                    for(int k=j+1;k<lineNumber;k++)
                    {
                        for(int l=k+1;l<lineNumber;l++)
                    {
                            for(int m=l+1;m<lineNumber;m++)
                    {
//                         System.out.println(i+"->"+j+"->"+k+"->"+l+"->"+m);
                        
                        Pentagon.checkPentagon(line.get(i), line.get(j), line.get(k), line.get(l), line.get(m));
                    }
                    }
                    }    
                }
            }
            
//            for(int i=0;i<lineNumber;i++)
//            {
//                arr[i]=i;
//            }
//            for (int i=0; i<arr.length; i++) {
//    System.out.println( arr[i]+"->" );
//  }
//            for(int r =3; r<=5;r++)
//            {
//                //int r = 4;
//            int n = arr.length;
//            printCombination(arr, n, r);
//            if(r==3)
//            {
//                Triangle.checkTriangle(line.get(i), line.get(j), line.get(k));
//            }else if(r==4)
//            {
//                Quadrilateral.isQuadrilateral(line.get(i), line.get(j), line.get(k),line.get(l));
//            }
//            else{
//                Pentagon.checkPentagon(line.get(i), line.get(j), line.get(k), line.get(l), line.get(m));
//            }
//            }
        }
        
        }
        catch (FileNotFoundException ex) 
        {
            ex.getMessage();
        }
        
        
        
        //boolean x1 = p1==p2;
//        System.out.println(equal(p1,p2)+" "+i);
        
    }
//   static void printCombination(int[] arr, int n, int r)
//{
//    // A temporary array to store all combination one by one
//    int[] data= new int[arr.length];
//
//    // Print all combination using temprary array 'data[]'
//    combinationUtil(arr, data, 0, n-1, 0, r);
//}
//
///* arr[]  ---> Input Array
//   data[] ---> Temporary array to store current combination
//   start & end ---> Staring and Ending indexes in arr[]
//   index  ---> Current index in data[]
//   r ---> Size of a combination to be printed */
//static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r)
//{
//    // Current combination is ready to be printed, print it
//    if (index == r)
//    {
//        for (int j=0; j<r; j++)
//            System.out.print(data[j]);
//        System.out.println();
//            
//            //return;
//    }
//
//    // replace index with all possible elements. The condition
//    // "end-i+1 >= r-index" makes sure that including one element
//    // at index will make a combination with remaining elements
//    // at remaining positions
//    for (int i=start; i<=end && end-i+1 >= r-index; i++)
//    {
//        data[index] = arr[i];
//        combinationUtil(arr, data, i+1, end, index+1, r);
//    }
//}

// Driver program to test above functions
//int unique()
//{
//    int arr[] = {1, 2, 3, 4, 5};
//    
//}
    

//    private static  boolean equal(Point p1, Point p2)
//    {
//
//        return p1.x == p2.x && p1.y==p2.y;
//    }
//
//    private static String checkTriangle(Point p1, Point p2, Point p3) {
//        throw new UnsupportedOperationException("Not yet implemented");
//        
//    }
//
//    private static String checkQuadrilateral(Point p1, Point p2, Point p3, Point p4) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
//
//    private static String checkPentagon(Point p1, Point p2, Point p3, Point p4, Point p5) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }

    

   
}
