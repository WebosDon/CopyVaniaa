/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import Bussiness.Control;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author donwe
 */
public class InputControl implements KeyListener{
    private Control control;

    public InputControl(Control control) {
        this.control = control;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:
                control.controlQuieto(1);
                break;
            case KeyEvent.VK_A:
                control.controlQuieto(2);
                break;
            case KeyEvent.VK_S:
                control.controlQuieto(3);
                break;
            case KeyEvent.VK_D:
                control.controlQuieto(4);
                break;
            default:
                break;
        }        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:
                control.controlMover(1);
                break;
            case KeyEvent.VK_A:
                control.controlMover(2);
                break;
            case KeyEvent.VK_S:
                control.controlMover(3);
                break;
            case KeyEvent.VK_D:
                control.controlMover(4);
                break;
            default:
                break;
        }        
        
    }
    
}
