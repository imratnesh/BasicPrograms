/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BigInfo;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Point
    {
    double x,y;

      
        Point(double p1, double p2)
        {
            x=p1;
            y=p2;
        }
        
        // Two points are equal
        static  boolean equal(Point p1, Point p2)
    {
        //System.out.println(p1.x+"-"+p2.x+"-"+p1.y+"-"+p2.y);

        if ((p1.x == p2.x) && (p1.y==p2.y))
        {
//            p1=p2;
//            BigInfo.points.remove(p2);
            return true;
        }
        else 
            return false;
    }
     
        //Check for point exist
        public static int correct (double x, double y)
        {
             for (int i = 0; i < BigInfo.points.size(); i++) 
             {
                 
                 if(BigInfo.points.get(i).x==x && BigInfo.points.get(i).y==y)
                 {
                     return i;
                 }
                 
//                 for (int j = 1; j < BigInfo.points.size(); j++) {
//            
////                System.out.println(BigInfo.points.get(i));
//                
//            if(Point.equal(BigInfo.points.get(i),BigInfo.points.get(j)))
//            {
//                BigInfo.points.get(j).equals(BigInfo.points.get(i));
//            }
//        }
             }
             return -1;
        }
 
      
    }