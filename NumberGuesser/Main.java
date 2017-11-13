import java.util.Scanner;

/**
 * Created by Nicole Kulakowski on 5/12/17.
 */
public class Main {

    private static Messenger messenger;

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        messenger = new Messenger();
        boolean quit = false;

        System.out.println("To quit at any time, type \"quit\".");

        messenger.welcome();
        messenger.setName(scanner.nextLine());

        while(!quit){

            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("quit")){
                System.out.println("\n\nOk bye now!");
                break;
            }
            else if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
                messenger.newGame();
            }
            else if(input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no")){
                System.out.println("\n\nOk bye now!");
                break;
            }else if(messenger.interpret(Integer.parseInt(input))){
                    System.out.println("\n\nPlay again? (Y/N):\t");
            }
        }

        System.out.println("\n\nExiting..."+(char)27+"[0m");
    }
}
