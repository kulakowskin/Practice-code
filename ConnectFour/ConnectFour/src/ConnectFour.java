import javax.swing.*;
import java.awt.*;

/**
 * Created by Nicole Kulakowski on 11/17/16.
 */
public class ConnectFour extends JFrame{

    private JPanel panel = new JPanel();
    private PieceButton[] pieces = new PieceButton[49];
    private boolean turn = false;
    private StateMachine SM;
    private ScoreKeeper SK;

    public ConnectFour(){
        super("Nicole's Connect Four Game!");
        setSize(800,800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(7,7));
        SM = new StateMachine();
        for(int i = 0; i<49; i++){
            pieces[i] = new PieceButton(i, SM, this);
            panel.add(pieces[i]);
            if(i < 42)
            {
                pieces[i].setEnabled(false);
            }
        }
        add(panel);
        setVisible(true);
        SK = new ScoreKeeper(pieces);
    }

    public void notify(PieceButton piece)
    {
        int posToEnable = piece.getPosition() - 7;
        if(posToEnable >= 0) {
            pieces[posToEnable].setEnabled(true);
        }

        if(SK.updateScore(piece))
        {
            SM.gameOver();
        }
    }

    public StateMachine getStateMachine(){
        return SM;
    }

    public static void main(String args[]){
        new ConnectFour();
    }


}
