public class Cylinder extends Shape3D{
      private int radius;
      private int height;

      public Cylinder(){
            super();
            radius = 0;
      }

      public Cylinder(int radius, int height){
            this. radius = radius;
            this.height = height;
            super(height, radius*2, radius*2);
      }

      public double getSurfaceArea(){
            return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
      }

      public int getRadius(){
            return radius;
      }
      public int getHeight(){
            return height;
      }
      @Override
      public int getDepth(){
            return radius*2;
      }
      @Override
      public int getWidth(){
            return radius*2;
      }
      public void setRadius(int radius){
            this.radius = radius;
      }
      public void setHeight(int height){
            this.height = height;
      }

      // setting the depth and width with parameters could lead to inconsistencies with the radius
      @Override
      public int setDepth(){
            this.depth = radius*2;
      }
      @Override
      public void setWidth(){
            this.width = radius*2;
      }
}
