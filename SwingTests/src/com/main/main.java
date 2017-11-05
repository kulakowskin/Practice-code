package swingstuff;

import javax.swing.*;
import java.awt.*;

public class main{

      public static void main(String args[]){

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int width = (int)screenSize.getWidth();
            int height = (int)screenSize.getHeight();

            new Window(width, height, "Test", new ViewPanel());
      }
}
