/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness;

import Data.Jugador;
import UI.InputControl;

/**
 *
 * @author csant
 */
public class Control implements Movimiento{
    private Jugador jugador;

    public Control( Jugador jugador) {
        this.jugador = jugador;
    }
    public void controlQuieto(int letra){
        switch (letra) {
            case 1:
                jugador.setUp(false);
                break;
            case 2:
                jugador.setLeft(false);
                
                break;
            case 3:
                jugador.setRight(false);
                
                break;
            case 4:
                jugador.setDown(false);
                break;
            default:
                throw new AssertionError();
        }
    
    
    
    
    
    }
    
    
    
    public void controlMover(int letra){
        switch (letra) {
            case 1:
                jugador.setUp(true);
                break;
            case 2:
                jugador.setLeft(true);
                
                break;
            case 3:
                jugador.setRight(true);
                
                break;
            case 4:
                jugador.setDown(true);
                break;
            default:
                throw new AssertionError();
        }
    }
}
