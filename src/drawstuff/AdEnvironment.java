/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Aleah
 */
public class AdEnvironment extends Environment {

    Image logo;

    public AdEnvironment() {
        this.setBackground(Color.white);
//        logo = ResourceTools.loadImageFromFile("Apple_Logo_Blue_Transparent.png");
        logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue.jpg");
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        //System.out.println("paint");
        
      
    graphics.setColor(new Color (0,235,255));
    graphics.fillOval(100, 100, 100, 100);
    graphics.setColor(new Color (255,247,0));
    graphics.fillOval (200, 300, 100, 100);
    graphics.setColor(new Color (175,0,255, 200));
    graphics.fillOval(170, 450, 100, 100);
    graphics.setColor(new Color (21,255,0));
    graphics.fillOval(500, 200, 100, 100);
    
    graphics.setColor(new Color (0,235,255, 170));
    graphics.fillOval(600, 150, 100, 100);
    graphics.setColor(new Color (255,247,0, 170));
    graphics.fillOval(650, 100, 100, 100);
    graphics.setColor(new Color (175,0,255, 170));
    graphics.fillOval(680, 350, 100, 100);
    graphics.setColor(new Color (21,255,0, 170));
    graphics.fillOval(250, 200, 100, 100);
    
    graphics.setColor(new Color (255, 188 ,0));
    graphics.fillOval(100, 100, 100, 100);
    graphics.setColor(new Color (255,188,0, 160));
    graphics.fillOval(530, 270, 100, 100);
    
    graphics.setColor(new Color (255, 68 ,0));
    graphics.fillOval(500, 400, 100, 100);
    graphics.setColor(new Color (255,68,0,160));
    graphics.fillOval(400, 100, 100, 100);
    graphics.setColor(Color.BLACK);
    graphics.setFont(new Font("Calibri", Font.ITALIC, 32));
    graphics.drawString("This Should Brighten Everyones day", 200, 500);
    
        if (logo != null) {
//            System.out.println("logo");
            graphics.drawImage(logo, 400, 200, 125, 125, this);
        }

    }
}
