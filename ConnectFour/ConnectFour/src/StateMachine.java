/**
 * Created by Nicole Kulakowski on 12/19/16.
 */
public class StateMachine {

    String state;

    public StateMachine(){
        state = "PLAYER1";
    }

    public String getState(){
        return state;
    }

    public void nextState()
    {
        if (state != "END")
        {
            if(state == "PLAYER1")
            {
                state = "PLAYER2";
            }
            else if(state == "PLAYER2")
            {
                state = "PLAYER1";
            }
        }
    }

    public void gameOver(){
        state = "GAMEOVER";
    }

    public void restartState(){
        state = "START";
    }

}
