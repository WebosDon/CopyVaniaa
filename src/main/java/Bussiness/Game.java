/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness;

import UI.Escenario;
import UI.Ventana;

/**
 *
 * @author donwe
 */
public class Game {
    private Ventana gameWindow;
    private Escenario gamePanel;
    
    public Game(){
        gamePanel = new Escenario();
        gameWindow = new Ventana(gamePanel);
        gamePanel.setFocusable(true); 
        gamePanel.requestFocus();
        
    }
}
