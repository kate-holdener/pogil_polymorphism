import java.lang.Math;

public class Point2D
{
   protected double xValue;
   protected double yValue;
   
   public Point2D(double x, double y)
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
      return Math.sqrt(this.xValue * this.xValue + this.yValue * this.yValue);
   }

   public double getDistance(Point2D point)
   {
      double xDelta = this.xValue - point.xValue;
      double yDelta = this.yValue - point.yValue;
      return Math.sqrt(xDelta * xDelta + yDelta * yDelta);
   }
}
