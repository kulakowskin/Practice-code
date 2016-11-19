import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nicole Kulakowski on 11/17/16.
 */
public class PieceButton extends JButton implements ActionListener{

    private ImageIcon chrome, firefox;
    private ConnectFour CF;

    public PieceButton(ConnectFour CF){
        this.CF = CF;
        chrome = new ImageIcon("res/chrome.png");
        firefox = new ImageIcon("res/firefox.png");
        this.addActionListener(this);
        setIcon(null);
    }

    public void actionPerformed(ActionEvent e){
        if(CF.turn()){
            setIcon(chrome);
        }else setIcon(firefox);
    }

}
