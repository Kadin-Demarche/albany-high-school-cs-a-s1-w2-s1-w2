public class BodyOfWater {
   private String name;
   private double largestDiameter;
   private double avgDepth;
   private boolean issaltWater;

   public BodyOfWater(String n, double d, double a, boolean s) {
       name = n;
       largestDiameter = d;
       avgDepth = a;
       issaltWater = s;
   }

   public BodyOfWater(String n, double a) {
    name = n;
    avgDepth = a;
   }

   public void setName(String n) {
    name = n;
    
   }
}
