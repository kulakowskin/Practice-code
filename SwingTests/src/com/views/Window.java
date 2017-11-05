package swingstuff;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Window{

      public Window(int width, int height, String title, JPanel panel){

            JFrame frame = new JFrame(title);
            frame.setPreferredSize(new Dimension(width,height));
            frame.setMinimumSize(new Dimension(width,height));
            frame.setMaximumSize(new Dimension(width,height));

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null); // frame starts in middle of screen
            frame.setVisible(true);


      }
}
