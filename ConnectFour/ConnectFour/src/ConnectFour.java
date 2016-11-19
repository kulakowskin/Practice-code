import javax.swing.*;
import java.awt.*;

/**
 * Created by Nicole Kulakowski on 11/17/16.
 */
public class ConnectFour extends JFrame{

    private JPanel panel = new JPanel();
    private PieceButton[] pieces = new PieceButton[49];
    private boolean turn = false;

    public ConnectFour(){
        super("Nicole's Connect Four Game!");
        setSize(800,800);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(7,7));
        for(int i = 0; i<49; i++){
            pieces[i] = new PieceButton(this);
            panel.add(pieces[i]);
        }
        add(panel);
        setVisible(true);
    }

    public static void main(String args[]){
        new ConnectFour();
    }

    public boolean turn(){
        turn = !turn;
        return turn;
    }

}
