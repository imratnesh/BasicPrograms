/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BigInfo;

import java.lang.reflect.Array;
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
public class Pentagon {
    static int numPentagon=0;

    static double d1; 
    static double d2; 
    static double d3; 
    static double d4;
    static double d5;
    static void checkPentagon(final Line line, final Line line0, final Line line1, final Line line2, final Line line3) 
            
    {
    d1 =  Line.lengthSquare(line); 
    d2 =  Line.lengthSquare(line0); 
    d3 =  Line.lengthSquare(line1); 
    d4 =  Line.lengthSquare(line2);
    d5 =  Line.lengthSquare(line3);
         
        Point[] pArray = {line.end1,line.end2,line0.end1,line0.end2,line1.end1,line1.end2,line2.end1,line2.end2,line3.end1,line3.end2};
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
                    add(line2.end1);
                    add(line2.end2);
                    add(line3.end1);
                    add(line3.end2);
                    
            }
        }; 
         Set set1 = new HashSet(Arrays.asList(set.toArray()));
//         System.out.println(set1.size());
//         for(Point p1: set)
//    {
//        for(Point p2: BigInfo.points)
//        {
////        if(p== line.end1 || p==line.end2 || p== line0.end1 || p==line0.end2 ||p== line1.end1 || p==line1.end2 || p== line2.end1 || p==line2.end2)
////        {
////            k++;
////        
////        }
//            if(p1==p2)
//            {
//                k++;
//            }
//        }   
//    }
//        Set<Double> setY = new HashSet<Double>() {
//            {  
//                    add(line.end1.y);
//                    add(line.end2.y);
//                    add(line0.end1.y);
//                    add(line0.end2.y);
//                    add(line1.end1.y);
//                    add(line1.end2.y);
//                    add(line2.end1.y);
//                    add(line2.end2.y);
//                    add(line3.end1.y);
//                    add(line3.end2.y);
//                    
//               
//            }
//        }; 
        
                    
  //      System.out.println(set+"-->"+set.size());
//        System.out.println(setY+"-->"+setY.size());
        //Check for pentagon
        if(set1.size()==5 && d1!=0 && d2!=0 && d3!=0 && d4!=0 && d5!=0)
        {
            numPentagon++;
            int i =0;
//                   if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                   //System.out.println("Triangle form ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+")");
//                   {
            // Number of pentangon with corresponding vertices
            System.out.print("Pentagon "+numPentagon+" with vertices  (");
                       for (Iterator<Point> it = set1.iterator(); it.hasNext();) {
                        i++;
                        Point p =  it.next(); 
                        System.out.print(p.x+", "+p.y);    
//                      //System.out.println("Triangle form1 ("+it.next().x+","+it.next().y+")");
                        if(i!=5)
                            System.out.print("; ");
                       }
//                   }
//                   else
//                   System.out.println("Triangle form2 ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line0.end2.x+","+line0.end2.y+")");    
                       System.out.println(")");
        
            
        }
//        else
//        {
//            System.out.println("Not pentagon");
//            
//        }

        
//        if(Point.equal(line.end1,line0.end1)||Point.equal(line.end2,line0.end1) || Point.equal(line.end1,line0.end2)||Point.equal(line.end2,line0.end2) )
//       {
//           if(Point.equal(line0.end1,line1.end1)||Point.equal(line0.end2,line1.end1)|| Point.equal(line0.end1,line1.end2)|| Point.equal(line0.end2,line1.end2))
//           {
//               if(Point.equal(line1.end1,line2.end1)||Point.equal(line1.end2,line2.end1)||Point.equal(line1.end1,line2.end2)||Point.equal(line1.end2,line2.end2))
//               {
//                   if(Point.equal(line2.end1,line3.end1)||Point.equal(line2.end2,line3.end1)||Point.equal(line2.end1,line3.end2)||Point.equal(line2.end2,line3.end2))
//                           {
//                               if(Point.equal(line3.end1,line.end1)||Point.equal(line3.end2,line.end1)||Point.equal(line3.end1,line.end2)||Point.equal(line3.end2,line.end2))
//                                {
//                                   if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                               {
//                          System.out.println( "Pentagon form1 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }
//                               else if(!Point.equal(line.end1, line2.end1) && !Point.equal(line.end2, line2.end1))
//                               {
//                          System.out.println( "Pentagon form2 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }    
//                               }
//                           }
////                           else
////                           {
////                               System.out.println("Quadrilateral not form3");
////                           }  
//               }
//               else
//               {
//                   System.out.println("Quadrilateral not form2");
//               }
//           }
//           else if(Point.equal(line0.end1,line2.end1)||Point.equal(line0.end2,line2.end1)|| Point.equal(line0.end1,line2.end2)|| Point.equal(line0.end2,line2.end2))
//           {
//               //System.out.println("Quadrilateral not form1");
//               if(Point.equal(line1.end1,line2.end1)||Point.equal(line1.end2,line2.end1)|| Point.equal(line1.end1,line2.end2)||Point.equal(line1.end2,line2.end2))
//               {
//                   if(Point.equal(line2.end1,line3.end1)||Point.equal(line2.end2,line3.end1)|| Point.equal(line2.end1,line3.end2)||Point.equal(line2.end2,line3.end2))
//               {
//                   //System.out.println("Quadrilateral form1");
//                               if(!Point.equal(line0.end1, line1.end1) && !Point.equal(line0.end2, line1.end1))
//                               {
//                          System.out.println( "Pentagon form3 with ("+line0.end1.x+","+line0.end1.y+";"+line0.end2.x+","+line0.end2.y+";"+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }
//                               else if(!Point.equal(line0.end1, line2.end1) && !Point.equal(line0.end2, line2.end1))
//                               {
//                          System.out.println( "Pentagon form4 with ("+line0.end1.x+","+line0.end1.y+";"+line0.end2.x+","+line0.end2.y+";"+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }    
//               }
//               }
//           }
//       }
//       else if(Point.equal(line.end1,line1.end1)||Point.equal(line.end2,line1.end1)|| Point.equal(line.end1,line1.end2)|| Point.equal(line.end2,line1.end2))
//       {
//           if(Point.equal(line1.end1,line2.end1)||Point.equal(line1.end2,line2.end1)|| Point.equal(line1.end1,line2.end2)||Point.equal(line1.end2,line2.end2))
//               {
//                   if(Point.equal(line2.end1,line3.end1)||Point.equal(line2.end2,line3.end1)|| Point.equal(line2.end1,line3.end2)||Point.equal(line2.end2,line3.end2))
//                           {
//                               if(Point.equal(line3.end1,line.end1)||Point.equal(line3.end2,line.end1)|| Point.equal(line3.end1,line.end2)||Point.equal(line3.end2,line.end2))
//                           {
//                                   if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                               {
//                          System.out.println( "Pentagon form5 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }
//                               else if(!Point.equal(line.end1, line2.end1) && !Point.equal(line.end2, line2.end1))
//                               {
//                          System.out.println( "Pentagon form6 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }    
//                           }
//                               }
////                           else
////                           {
////                               System.out.println("Quadrilateral not form12");
////                           }  
//               }
//               else if(Point.equal(line1.end1,line.end1)||Point.equal(line1.end2,line.end1)|| Point.equal(line1.end1,line.end2)||Point.equal(line1.end2,line.end2))
//               {
//                   if(Point.equal(line2.end1,line.end1)||Point.equal(line2.end2,line.end1)|| Point.equal(line2.end1,line.end2)||Point.equal(line2.end2,line.end2))
//               {
//                    if(Point.equal(line3.end1,line.end1)||Point.equal(line3.end2,line.end1)|| Point.equal(line3.end1,line.end2)||Point.equal(line3.end2,line.end2))
//               {
//                   //System.out.println("Quadrilateral form11");
//                                    if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                               {
//                          System.out.println( "Pentagon form7 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }
//                               else if(!Point.equal(line.end1, line2.end1) && !Point.equal(line.end2, line2.end1))
//                               {
//                          System.out.println( "Pentagon form8 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }    
//               }
//               }
//               }
//    }
    
}
}