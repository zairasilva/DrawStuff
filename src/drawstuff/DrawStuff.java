/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.ApplicationStarter;
import java.awt.Dimension;

/**
 *
 * @author Zaira
 */
public class DrawStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startUp();
    }
    
    private static void startUp() {
        
        ApplicationStarter.run(new String[0], "Windows Ad", new Dimension(1000, 500), new DrawingEnvironment());
        
//        ApplicationStarter.run("My First Drawing", new DrawingEnvironment());
    }    
}
