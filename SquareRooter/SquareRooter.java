import java.lang.IllegalArgumentException;

public class SquareRooter{

      public static void main(String args[]){
            double[] vals = {4,0,-2};

            for (double val : vals) {
                  try{
                        System.out.println("Calling sqrRoot with "+val);
                        System.out.println("sqrRoot of "+val+ " is "+sqrRoot(val));
                  }catch(SquareRootArgumentException e){
                        e.printStackTrace();
                  }
            }

      }

      public static double sqrRoot(double val){
            if(val>=0){
                  return Math.sqrt(val);
            }else {
                  throw new SquareRootArgumentException("Cannot calculate square root of negatives");
            }
      }

}

class SquareRootArgumentException extends IllegalArgumentException{
      public SquareRootArgumentException(String msg){
            super(msg);
      }
}
