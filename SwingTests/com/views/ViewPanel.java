package com.tigerzone.views;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ViewPanel extends JPanel{

      public ViewPanel(){
            this.setFocusable(true);
            this.setBackground();
      }

      @Override
      protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                  RenderingHints.VALUE_ANTIALIAS_ON);

            try {
                  BufferedImage bi = ImageIO.read(new File("/Users/MyMac/Desktop/SwingTests/res/bane.png"));
                  g2d.drawImage(bi, null, 800,400);
            } catch (IOException e) {
                  e.printStackTrace();
            }

            //g2d.setColor(Color.red);
      }
}
