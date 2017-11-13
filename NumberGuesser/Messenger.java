/**
 * Created by Nicole Kulakowski on 5/12/17.
 */
public class Messenger {

    private NumberCheck NC;
    private String message;
    private String name;
    private int numTries = 0;

    public Messenger()
    {
        NC = new NumberCheck();
    }

    public void welcome()
    {
        message = "\n\nWelcome to this silly game made by Nicole! ";
        message+= "\nBefore we become best friends, I'd like to know your name.";
        message+= "\n\nTell the program your name:\t";

        print();
    }

    public void setName(String name){
        this.name = name;
        message = "\n\nHey "+this.name+"! "+"Let's get started on this trivial game!";
        message+= "\nI'm going to randomly pick a number between 1 and 10,000 and it's up to YOU to figure it out.";
        message+= "\nAs we go along, I'll give you hints as to whether you need to go higher or lower.";

        print();

        message = "\n\nLet me think ";
        print();

        for(int i = 0; i<5; i++){
            message = ". ";
            print();
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        message = "\n\nOk, I got one! Take a guess:\t ";
        print();

    }

    // returns true if the guess is correct, and exits the while loop in Main
    public boolean interpret(int input)
    {
        numTries++;
        int result = NC.checkGuess(input);
        boolean ret = false;

        switch(result){
            case 0:
                message = "\n\nSomething went wrong... I don't know how this happened!\n";
                ret = true;
                break;
            case 1:
                message = "\n\nBye golly you guessed it "+name+"! Nice. And it only took you "+numTries+" attempts!\n";
                ret = true;
                break;
            case 2:
                message = "\n\nTry going lower.\n";
                break;
            case 3:
                message = "\n\nTry going higher.\n";
                break;
        }

        print();
        return ret;
    }

    public void print()
    {
        message = (char)27 + "[36m" + message;
        System.out.print(message);
    }

    public void newGame(){
        NC = new NumberCheck();
        numTries = 0;
        message = "\n\nOk, I've got a new number. Go ahead.\n";
        print();
    }

}
