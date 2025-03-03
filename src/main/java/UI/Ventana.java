/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author donwe
 */
public class Ventana {
    private JFrame jframe;
    
    public Ventana(Escenario gamePanel){
        jframe = new JFrame();
          
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.pack();   
        jframe.setVisible(true);
    }
}
