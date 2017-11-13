/*****************************************
*
*      Nicole Kulakowski
*      Nov. 4, 2017
*
*      HappyNumber.java
*      Desc: Starting with any positive integer, replace the number by the
*      sum of the squares of its digits in base-ten, and repeat the process
*      until the number either equals 1 (where it will stay), or it loops
*      endlessly in a cycle that does not include 1. Don't look at line 4
*
*****************************************/
import java.util.LinkedList;

public class HappyNumber
{
      private int num;
      private int result;

      public static void main(String[] args)
      {
            HappyNumber HN = new HappyNumber(args[0]);
            System.out.println("---\nIs number happy?\t"+HN.isHappy());
      }

      public HappyNumber(String param)
      {
            num = Integer.parseInt(param);
            result = num;
      }

      public boolean isHappy()
      {
            boolean var = false;
            int loopCheck = 0;
            while((result != 1)&& !var)
            {
                  result = doMath(result);
                  System.out.println(result);
                  loopCheck++;
                  if(20 == loopCheck) // shameshameshame
                  {
                        var = true;
                  }
            }

            if(result == 1)
            {
                  return true;
            }
            else return false;
      }

      public int doMath(int digit)
      {
            LinkedList<Integer> stack = new LinkedList<Integer>();
            int newDigit = 0;
            while (digit > 0)
            {
                  stack.push(digit % 10);   //pushing right-most digit of number
                  digit = digit / 10;
            }
            while(!stack.isEmpty())
            {
                  int popped = stack.pop();
                  newDigit += (popped*popped);;
            }
            //System.out.println(newDigit);
            return newDigit;
      }
}
