public class Driver
{
   public static void printDistance(Point point)
   {
      double distance = point.getDistanceFromZero();
      System.out.println("Distance from point " + point + " to zero is " + distance);
   } 

   public static void main(String []args)
   {
      Point center = new Point(0,0);
      System.out.println("Center's X value is " + center.getX());
      System.out.println("Center's Y value is " + center.getY());

      Point3D start = new Point3D(10,10,10);
      // add code for your experiments below
   }
}
