/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BigInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Triangle {
    static int numTriangle =0;
    static double d1; 
    static double d2; 
    static double d3; 
    static double d4; 
    static void checkTriangle(final Line line, final Line line0, final Line line1) {
//    double x1,x2,x3,y1,y2,y3;  
//    
//    
//    Point[] pArray = {line.end1,line.end2,line0.end1,line0.end2,line1.end1,line1.end2};
//   
   
        
    d1 =  Line.lengthSquare(line); 
    d2 =  Line.lengthSquare(line0); 
    d3 =  Line.lengthSquare(line1); 
    
//        Set set = new HashSet(Arrays.asList("1","2","2"));
//
//        
//        for(int i=0;i<3;i++)
//        {
//            if(pArray[i]==pArray[i+1])
//            {
//                
//            }
//            
//        }
    
       
    
        int k=0;
    
            
         List<Point> set = new ArrayList<Point>() {
            {  
                    add(line.end1);
                    add(line.end2);
                    add(line0.end1);
                    add(line0.end2);
                    add(line1.end1);
                    add(line1.end2);
                   
                    
            }
        }; 
         
         Set set1 = new HashSet(Arrays.asList(set.toArray()));
         //System.out.println(set1.size());
         for(Point p1: set)
    {
        for(Point p2: BigInfo.points)
        {
//        if(p== line.end1 || p==line.end2 || p== line0.end1 || p==line0.end2 ||p== line1.end1 || p==line1.end2 || p== line2.end1 || p==line2.end2)
//        {
//            k++;
//        
//        }
            if(p1==p2)
            {
                k++;
            }
        }   
    }
//        Set<Point> setY = new HashSet<Point>() {
//            {  
//                    add(line.end1);
//                    add(line.end2);
//                    add(line0.end1);
//                    add(line0.end2);
//                    add(line1.end1);
//                    add(line1.end2);
//                    
//                    
//                    
//               
//            }
//        };
        
                    
//        System.out.println(set+"-->"+set.size()+ "");
//        System.out.println(setY+"-->"+setY.size());
        
        if(set1.size()==3)
            
        {
            numTriangle++;
            int i =0;
//                   if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                   //System.out.println("Triangle form ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+")");
//                   {
            //Triangle with their vertices
            System.out.print("Traingle "+numTriangle+" with vertices (");
                       for (Iterator<Point> it = set1.iterator(); it.hasNext();) {
                        i++;
                        Point p =  it.next(); 
                        System.out.print(p.x+", "+p.y);    
//                      //System.out.println("Triangle form1 ("+it.next().x+","+it.next().y+")");
                        if(i!=3)
                            System.out.print("; ");
                       }
//                   }
//                   else
//                   System.out.println("Triangle form2 ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line0.end2.x+","+line0.end2.y+")");    
                       System.out.println(")");
        }
//        else
//        {
//            System.out.println("Not ");
//            
//        }
//       x1 = line.end1.x;
//       x2 = line0.end1.x;
//       x3 = line1.end1.x;
//       y1 = line.end1.y;
//       y2 = line0.end1.y;
//       y3 = line1.end1.y;
//       
//      
//       System.out.println(x1+"dcd"+y2+"dd"+y3+ "");
//       if(Point.equal(line.end1,line0.end1)||Point.equal(line.end2,line0.end1) || Point.equal(line.end1,line0.end2)||Point.equal(line.end2,line0.end2) )
//       {
//           if(Point.equal(line0.end1,line1.end1)||Point.equal(line0.end2,line1.end1)|| Point.equal(line0.end1,line1.end2)|| Point.equal(line0.end2,line1.end2))
//           {
//               if(Point.equal(line1.end1,line.end1)||Point.equal(line1.end2,line.end1)|| Point.equal(line1.end1,line.end2)||Point.equal(line1.end2,line.end2))
//               {
//                   if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                   System.out.println("Triangle form ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+")");
//                   else
//                   System.out.println("Triangle form ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line0.end2.x+","+line0.end2.y+")");    
//               }
//               else
//               {
//                   System.out.println("Triangle not form");
//               }
//           }
//           else
//           {
//               System.out.println("Triangle not form");
//           }
//       }
//       else
//       {
//           System.out.println("Triangle not form");
//       }
        //Calculate change in x for distance formula
//        double delta_x1 = (x2-x1)*(x2-x1);
//        double delta_x2 = (x3-x2)*(x3-x2);
//        double delta_x3 = (x3-x1)*(x3-x1);
//        //Calculate change in y for distance formula
//        double delta_y1 = (y2-y1)*(y2-y1);
//        double delta_y2 = (y3-y2)*(y3-y2);
//        double delta_y3 = (y3-y1)*(y3-y1);
//        //Calculate distance in square for each of the three sides if not CO-LINEAR
//        double side1 = delta_x1 + delta_y1;
////        side1 = 15;
//        double side2 = delta_x2 + delta_y2;
////        side2 = 0;
//        double side3 = delta_x3 + delta_y3;
////        side3 = 26.2; 
//
//        if ((side1 + side2 == side3) || 
//            (side1 + side3 == side2) ||
//            (side2 + side3 == side1)) {
//            System.out.println ("Right Triangle!");
//        }
//        else if ((side1 + side2 > side3) &&
//                 (side1 + side3 > side2) &&
//                 (side2 + side3 > side1)) {
//            System.out.println("Acute Triangle!");
//        }
//        else if ((side1 + side2 <= side3) ||
//                 (side1 + side3 <= side2) ||
//                 (side2 + side3 <= side1)) {
//            System.out.println("Obtuse Triangle!");
//        }
//        else if ((x2-x1)*(y3-y2)==(y2-y1)*(x3-x2))
//        {
//            System.out.println("Lines colinear");
//        }
//        else
//        {
//            System.out.println("Can't form a triangle.");
//        }
        
//if (side1 <= 0 || side2 <= 0 || side3 <= 0)
//{
//System.out.println(false);
//}
//else if (side1 >= side2 && side1 >= side3)
//{
//System.out.println(side1 < side2 + side3);
//}
//else if (side2 >= side1 && side2 >= side3)
//{
//System.out.println(side2 < side1 + side3);
//}
//else
//{
//System.out.println(side3 < side1 + side2);
//
//}

       // return line.end1.x +"->"+line0.end2.y+"->"+line1.end1.y;
    }
}
