import java.lang.Math;

public class Point
{
   protected double xValue;
   protected double yValue;
   
   public Point(double x, double y)
   {
      this.xValue = x;
      this.yValue = y;
   }

   public double getX()
   {
      return xValue;
   }

   public double getY()
   {
      return yValue;
   }

   public double getDistanceFromZero()
   {
      Point zero = new Point(0,0);
      return this.getDistance(zero);
   }

   public double getDistance(Point point)
   {
      double xDelta = this.xValue - point.xValue;
      double yDelta = this.yValue - point.yValue;
      return Math.sqrt(xDelta * xDelta + yDelta * yDelta);
   }
}
