/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author donwe
 */
public class Escenario extends JPanel{
        private InputControl Control;
    public Escenario() {
        Control = new InputControl();
        this.addKeyListener(Control);
        this.addMouseListener(Control);
        this.addMouseMotionListener(Control);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(300, 300, 50, 50);
    
    
    }
    
}
