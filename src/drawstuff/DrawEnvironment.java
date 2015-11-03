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
class DrawEnvironment extends Environment {

    public DrawEnvironment() {
      
    }

    Image logo;

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
        graphics.setColor(Color.pink);
        graphics.drawOval(100, 100, 100, 100);
        graphics.setColor(Color.red);
        graphics.drawOval(150, 150, 100, 100);
        graphics.setColor(Color.blue);
        graphics.drawOval(200, 100, 100, 100);
        graphics.setColor(Color.yellow);
        graphics.drawOval(300, 100, 100, 100);
        graphics.setColor(Color.orange);
        graphics.drawOval(250, 150, 100, 100);
        graphics.fillOval(200, 400, 100, 100);
        graphics.fillRect(300, 400, 100, 100);
        graphics.drawRect(400, 400, 100, 100);

        graphics.setColor(new Color(232, 17, 255));
        graphics.fillOval(400, 300, 100, 100);
        graphics.setColor(new Color(255, 81, 17));
        graphics.fillOval(600, 200, 100, 100);
        graphics.setColor(new Color(152, 255, 17));
        graphics.fillOval(700, 200, 100, 100);
        graphics.setColor(new Color(17, 152, 255));
        graphics.fillOval(650, 250, 100, 100);
        graphics.setColor(Color.MAGENTA);
        graphics.setFont(new Font("Calibri", Font.ITALIC, 32));
        graphics.drawString("Class ends in 30 minutes", 100, 300);

       
        }
    }


