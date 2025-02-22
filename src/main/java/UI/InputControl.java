/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author donwe
 */
public class InputControl implements MouseListener, MouseMotionListener, KeyListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("cliquiando");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("me estoy moviendo jsjsjs");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_W:
                System.out.println("la letra W esta siendo presionada");
                break;
            case KeyEvent.VK_A:
                System.out.println("la letra A esta siendo presionada");
                break;
            case KeyEvent.VK_S:
                System.out.println("la letra S esta siendo presionada");
                break;
            case KeyEvent.VK_D:
                System.out.println("la letra D esta siendo presionada");
                break;
            default:
                break;
        }        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
