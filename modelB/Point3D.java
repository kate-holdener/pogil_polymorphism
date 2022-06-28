import java.lang.Math;

public class Point3D extends Point
{
   protected double zValue;

   public Point3D(double x, double y, double z)
   {
      super(x,y);
      this.zValue = z;
   }

   public double getDistanceFromZero()
   {
      Point3D zero = new Point3D(0,0,0);
      return this.getDistance(zero);
   }

   public double getDistance(Point3D point)
   {
      double deltaX = point.xValue - this.xValue;
      double deltaY = point.yValue - this.yValue;
      double deltaZ = point.zValue - this.zValue;
      return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
   }

}
