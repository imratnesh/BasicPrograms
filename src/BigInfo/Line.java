/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BigInfo;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Line {
     
    Point end1,end2 ;
        Line(Point p1, Point p2)
        {
            this.end1=p1;
            this.end2=p2;
            
        }
        public String toString()
        {
            return end1+"->"+end2;
        }
        //Square of length of line
        static double lengthSquare(Line line)
        {
            return Math.pow(line.end1.x-line.end2.x,2) + Math.pow(line.end1.y-line.end2.y,2);
        }
        //Two lines are perpendicular
        static boolean isNighty(Line line1,Line line2)
        {
        double x1 = line1.end1.x;
        double y1 = line1.end1.y;
        double x2 = line2.end1.x;
        double y2 = line2.end1.y;
        double x3 = line1.end1.x;
        double y3 = line2.end1.y;
        double x4 = line1.end2.x;
        double y4 = line2.end2.y;
        //Calculation of slopes
        double slope1 = (y2-y1)/(x2-x1);
        double slope2 = (y4-y3)/(x4-x3);
        // Check for perpendicular 
            if(slope1 == -(1/slope2))
            return true;
            else
            return false;
        }
        
}
