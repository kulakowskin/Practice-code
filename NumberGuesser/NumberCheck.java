import java.util.Random;

/**
 * Created by Nicole Kulakowski on 5/12/17.
 */
public class NumberCheck {

    private Random rand;
    protected int toGuess;
    private int min = 1;
    private int max = 10000;

    public NumberCheck(){
        rand = new Random();
        toGuess = rand.nextInt((max - min) + 1) + min;
    }

    public int checkGuess(int input){
        if(toGuess == input){
            return 1;
        }
        else if(toGuess < input){
            return 2;
        }
        else if(toGuess > input){
            return 3;
        }
        else return 0;
    }

}
