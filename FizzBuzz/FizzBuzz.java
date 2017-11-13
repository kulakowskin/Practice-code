public class FizzBuzz
{
      public static void main(String[] args)
      {
            FizzBuzz FB = new FizzBuzz(args[0]);
      }

      public FizzBuzz(String arg)
      {
            int limit = Integer.parseInt(arg);
            System.out.println(limit+"\n"+"----");
            for(int i = 1; i<=limit; i++)
            {
                  String output = "\0";
                  if(i%3 == 0)
                  {
                        output+="Fizz";
                  }

                  if(i%5 == 0)
                  {
                        output+="Buzz";
                  }

                  final long startTime = System.nanoTime();
                  output = (output == "\0") ? Integer.toString(i) : output;
                  final long endTime = System.nanoTime();

                  System.out.println(output+"\t"+(endTime-startTime)+"ns");

                  //Printing method above is significantly more efficient

                  // if(output == "\0")
                  // {
                  //       System.out.println(i);
                  // }
                  // else
                  // {
                  //       System.out.println(output);
                  // }
            }
      }
}
