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
class Quadrilateral {
   static int numQuad =0; 
   static int numSq =0; 
   static int numRect =0; 
   static int numRho =0; 
   static int numPar =0; 
   
   static double d1; 
   static double d2; 
   static double d3; 
   static double d4; 
   
   
    static void isQuadrilateral(final Line line, final Line line0, final Line line1, final Line line2) {
//    double x1,x2,x3,y1,y2,y3,x4,y4; 
        
    d1 =  Line.lengthSquare(line); 
    d2 =  Line.lengthSquare(line0); 
    d3 =  Line.lengthSquare(line1); 
    d4 =  Line.lengthSquare(line2); 
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
//         System.out.println(k);
         //Check for input lines are connected and form triangle
         if(set1.size()==4 && d1!=0 && d2!=0 && d3!=0 && d4!=0)
        {
            
            
            
//            System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2)
//                                  +" form8 with ("+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+";"
//                                  +line0.end1.x+","+line0.end1.y+";"+line0.end2.x+","+line0.end2.y+")");
//            numQuad++;
            int i =0;
//                   if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                   //System.out.println("Triangle form ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+","+line1.end1.y+")");
//                   {
                // Check quadrilateral type and check vertices
                    System.out.print(checkQuadType(line, line0, line1, line2)+" with vertices  (");
                       for (Iterator<Point> it = set1.iterator(); it.hasNext();) {
                        i++;
                        Point p =  it.next(); 
                        System.out.print(p.x+", "+p.y);    
//                      //System.out.println("Triangle form1 ("+it.next().x+","+it.next().y+")");
                        if(i!=4)
                            System.out.print("; ");
                       }
//                   }
//                   else
//                     System.out.println("Triangle form2 ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line0.end2.x+","+line0.end2.y+")");    
                       System.out.println(")");
        
            
        }
//        else
//        {
//            System.out.println("Not pentagon");
//            
//        }
    
//    if(Point.equal(line.end1,line0.end1)||Point.equal(line.end2,line0.end1) || Point.equal(line.end1,line0.end2)||Point.equal(line.end2,line0.end2) )
//       {
//           if(Point.equal(line0.end1,line1.end1)||Point.equal(line0.end2,line1.end1)|| Point.equal(line0.end1,line1.end2)|| Point.equal(line0.end2,line1.end2))
//           {
//               if(Point.equal(line1.end1,line2.end1)||Point.equal(line1.end2,line2.end1)||Point.equal(line1.end1,line2.end2)||Point.equal(line1.end2,line2.end2))
//               {
//                   if(Point.equal(line2.end1,line.end1)||Point.equal(line2.end2,line.end1)||Point.equal(line2.end1,line.end2)||Point.equal(line2.end2,line.end2))
//                           {
//                                   if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                               {
//                          System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2)
//                                  +" form1 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"
//                                  +line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }
//                               else if(!Point.equal(line.end1, line2.end1) && !Point.equal(line.end2, line2.end1))
//                               {
//                          System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2) 
//                                  +" form2 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"
//                                  +line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }    
//                           }
////                           else
////                           {
////                               System.out.println("Quadrilateral not form3");
////                           }  
//               }
////               else
////               {
////                   System.out.println("Quadrilateral not form2");
////               }
//           }
//           else if(Point.equal(line0.end1,line2.end1)||Point.equal(line0.end2,line2.end1)|| Point.equal(line0.end1,line2.end2)|| Point.equal(line0.end2,line2.end2))
//           {
//               //System.out.println("Quadrilateral not form1");
//               if(Point.equal(line1.end1,line2.end1)||Point.equal(line1.end2,line2.end1)|| Point.equal(line1.end1,line2.end2)||Point.equal(line1.end2,line2.end2))
//               {
//                   //System.out.println("Quadrilateral form1");
//                               if(!Point.equal(line0.end1, line1.end1) && !Point.equal(line0.end2, line1.end1))
//                               {
//                          System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2) 
//                                  +" form3 with ("+line0.end1.x+","+line0.end1.y+";"+line0.end2.x+","+line0.end2.y+";"
//                                  +line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }
//                               else if(!Point.equal(line0.end1, line2.end1) && !Point.equal(line0.end2, line2.end1))
//                               {
//                          System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2) 
//                                  +" form4 with ("+line0.end1.x+","+line0.end1.y+";"+line0.end2.x+","+line0.end2.y+";"
//                                  +line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }    
//               }
//           }
//       }
//       else if(Point.equal(line.end1,line1.end1)||Point.equal(line.end2,line1.end1)|| Point.equal(line.end1,line1.end2)|| Point.equal(line.end2,line1.end2))
//       {
//           if(Point.equal(line1.end1,line2.end1)||Point.equal(line1.end2,line2.end1)|| Point.equal(line1.end1,line2.end2)||Point.equal(line1.end2,line2.end2))
//               {
//                   if(Point.equal(line2.end1,line.end1)||Point.equal(line2.end2,line.end1)|| Point.equal(line2.end1,line.end2)||Point.equal(line2.end2,line.end2))
//                           {
//                                   if(!Point.equal(line.end1, line1.end1) && !Point.equal(line.end2, line1.end1))
//                               {
//                          System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2) 
//                                  +" form5 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"
//                                  +line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }
//                               else if(!Point.equal(line.end1, line2.end1) && !Point.equal(line.end2, line2.end1))
//                               {
//                          System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2) 
//                                  +" form6 with ("+line.end1.x+","+line.end1.y+";"+line.end2.x+","+line.end2.y+";"+line1.end1.x+
//                                  ","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+")");
//                               }    
//                           }
////                           else
////                           {
////                               System.out.println("Quadrilateral not form12");
////                           }  
//               }
//               else if(Point.equal(line1.end1,line.end1)||Point.equal(line1.end2,line.end1)|| Point.equal(line1.end1,line.end2)||Point.equal(line1.end2,line.end2))
//               {
//                   if(Point.equal(line2.end1,line.end1)||Point.equal(line2.end2,line.end1)|| Point.equal(line2.end1,line.end2)||Point.equal(line2.end2,line.end2))
//               {
//                   //System.out.println("Quadrilateral form11");
//                                    if(!Point.equal(line1.end1, line2.end1) && !Point.equal(line1.end2, line2.end1))
//                               {
//                          System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2) 
//                                  +" form7 with ("+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+";"
//                                  +line2.end1.x+","+line2.end1.y+";"+line2.end2.x+","+line2.end2.y+")");
//                               }
//                               else if(!Point.equal(line.end1, line2.end1) && !Point.equal(line.end2, line2.end1))
//                               {
//                          System.out.println( Quadrilateral.checkQuadType(line,line0,line1,line2)
//                                  +" form8 with ("+line1.end1.x+","+line1.end1.y+";"+line1.end2.x+","+line1.end2.y+";"
//                                  +line0.end1.x+","+line0.end1.y+";"+line0.end2.x+","+line0.end2.y+")");
//                               }    
//               }
//               }
//       }
//       x1 = line.end1.x;
//       x2 = line0.end1.x;
//       x3 = line1.end1.x;
//       x4 = line2.end1.x;
//       y1 = line.end1.y;
//       y2 = line0.end1.y;
//       y3 = line1.end1.y;   
//       y4 = line2.end1.y;   
    }       
 static String  checkQuadType(Line line, Line line0, Line line1, Line line2)
{
    
//   System.out.println(d1+" "+d2+" "+d3+ " "+d4);
    //if all sides are equal
   if( d1==d2 && d2==d3 && d3==d4 && d4==d1)
   {
       //If any angle is nighty
       if(Line.isNighty(line, line0) || Line.isNighty(line1, line2) || Line.isNighty(line0, line1)  || Line.isNighty(line, line1))
       {
           numSq++;
           return "Square " + numSq;
       }
       else
       {
           numRho++;
           return "Rhombus " + numRho;
       }
   }
   // If two sides are equal
   else if((d1==d3 && d2==d4) || (d1==d2 && d3==d4) || (d1==d4 && d2==d3)) 
   {
       if(Line.isNighty(line, line0) || Line.isNighty(line1, line2) || Line.isNighty(line0, line1))
       {
           numRect++;
           return "Rectangle " + numRect++;
       }
       else
       {
           numPar++;
           return "Parallelogram " +numPar++;
       }
   }
   else
   {
       //Other wise quadrilateral
       numQuad++;
       return "Quadrilateral " + numQuad;
   }
   
//    
//if((x1-x2)*(y1-y3)==(x1-x3)*(y1-y2) || (x1-x2)*(y1-y4)==(x1-x4)*(y1-y2) || (x4-x2)*(y4-y3)==(x4-x3)*(y4-y2) || (x1-x3)*(y1-y4)==(x1-x4)*(y1-y3))
//{
//return "NONE";
//}
//else if(Line2D.linesIntersect(x1,y1,x2,y2,x3,y3,x4,y4))
//{
//return "NONE";
//}else if(Line2D.linesIntersect(x1,y1,x4,y4,x3,y3,x2,y2))
//{
//return "NONE";
//}
//else
//{
//if(x1+x3==x2+x4 && y1+y3==y2+y4)
//{
//double d1=(x1-x3)*(x1-x3)+(y1-y3)*(y1-y3);
//double d2=(x2-x4)*(x2-x4)+(y2-y4)*(y2-y4);
//double s1=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
//double s2=(x1-x4)*(x1-x4)+(y1-y4)*(y1-y4);
//if(d1==d2)
//{
//if(s1==s2)
//{
//return "SQUARE";
//}
//else
//{
//return "RECTANGLE";
//}
//}
//else
//{
//if(s1==s2)
//{
//return "RHOMBUS";
//}
//else
//{
//return "PARALLELOGRAM";
//}
//}
//}
//else
//{
//return "QUADRILATERAL";
//}
//}
}
} 

