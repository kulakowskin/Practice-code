import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nicole Kulakowski on 11/17/16.
 */
public class PieceButton extends JButton implements ActionListener{

    private ImageIcon player1, player2;
    protected int playerMove;
    private StateMachine SM;
    private int position;
    private ConnectFour CF;

    public PieceButton(int pos, StateMachine SM, ConnectFour CF){
        player1 = new ImageIcon("ConnectFour/res/chrome.png");
        player2 = new ImageIcon("ConnectFour/res/firefox.png");
        this.addActionListener(this);
        setIcon(null);
        this.CF = CF;
        this.SM = SM;
        position = pos;
        playerMove = 0;
    }

    // a move was made
    public void actionPerformed(ActionEvent e){
        if(SM.getState() == "PLAYER1")
        {
            setIcon(player1);
            setDisabledIcon(player1);
            playerMove = 1;
        }
        else if(SM.getState() == "PLAYER2")
        {
            setIcon(player2);
            setDisabledIcon(player2);
            playerMove = 2;
        }
        setText(Integer.toString(position));
        SM.nextState();
        setEnabled(false);
        CF.notify(this);
    }

    public int getPosition(){
        return position;
    }
    public int getPlayer(){
        return playerMove;
    }

}
