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
 * @author Zaira
 */
class DrawingEnvironment extends Environment {

    public DrawingEnvironment() {
        logo = ResourceTools.loadImageFromResource("drawstuff//windowslogo.jpg");
        this.setBackground(Color.white);

    }

    Image logo = null;

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

//        //Olympics Sign
//        graphics.drawOval(100, 100, 200, 200);
//        
//        graphics.setColor(Color.red);
//        graphics.drawOval(250, 100, 200, 200);
//        
//        graphics.setColor(Color.blue);
//        graphics.drawOval(400, 100, 200, 200);
//        
//        graphics.setColor(Color.yellow);
//        graphics.drawOval(325, 200, 200, 200);
//        
//        graphics.setColor(Color.green);
//        graphics.drawOval(175, 200, 200, 200);
//
//        //Venn Diagram
//        graphics.setColor(new Color(225, 0, 0, 200));
//        graphics.fillOval(500, 200, 200, 200);
//        
//        graphics.setColor(new Color(0, 255, 0, 120));
//        graphics.fillOval(650, 200, 200, 200);
//        
//        graphics.setColor(new Color(0, 0, 255, 120));
//        graphics.fillOval(575, 325, 200, 200);
//
//        //Rectangle
//        graphics.setColor(Color.red);
//        graphics.fillRect(50, 400, 100, 150);
//
//        //Text
//        graphics.setFont(new Font("Calibri", Font.BOLD, 55));
//        graphics.drawString("random text", 200, 250);
//        graphics.drawLine(600, 500, 23, 65);
//      
        //Image
        if (logo != null) {
            graphics.drawImage(logo, 875, 400, 200, 225, this);

            graphics.setColor(new Color(225, 0, 0, 50));
            graphics.fillOval(500, 200, 150, 150);
            
            graphics.setColor(new Color(0, 225, 0, 120));
            graphics.fillOval(1200, 300, 150, 150);
            
            graphics.setColor(new Color(0, 0, 225, 120));
            graphics.fillOval(800, 650, 150, 150);
            
            graphics.setColor(new Color(0, 0, 255, 30));
            graphics.fillOval(1000, 100, 150, 150);
            
            graphics.setColor(new Color(250, 0, 0, 150));
            graphics.fillOval(1300, 800, 150, 150);

            graphics.setColor(new Color(0, 225, 0, 100));
            graphics.fillOval(500, 750, 150, 150);
            
            graphics.setColor(new Color(0, 0, 50, 50));
            graphics.fillOval(550, 100, 150, 150);
        }

    }

}
