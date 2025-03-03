/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author donwe
 */
public class Constantes {
    
    	public static class ConstantesJugador {
		public static final int IDLE = 0;
		public static final int RUN = 1;
		public static final int JUMP = 2;
		public static final int FALLING = 3;
		public static final int GROUND = 4;
		public static final int HURT = 5;
		public static final int ATTACK = 6;
		public static final int ATTACK_JUMP = 7;

                //consultar la cantidad de sprites que tiene cada accion
		public static int GetCantidadSprites(int player_action) {
			switch (player_action) {
			case IDLE:
				return 8;                            
			case RUN:
				return 8;
			case HURT:
				return 4;
			case JUMP:
				return 3;
			case GROUND:
				return 2;
			case FALLING:
			default:
				return 1;
			}
		}
	}
    
    
    
    
}
