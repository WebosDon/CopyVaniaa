/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import static Utilidades.Constantes.ConstantesJugador.*;
import static Utilidades.Constantes.ConstantesJugador.ATTACK;
import static Utilidades.Constantes.ConstantesJugador.IDLE;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import static Utilidades.Constantes.ConstantesJugador.RUN;

public class Jugador extends Entidad {
    Objeto[] inventario=new Objeto[10];
    Habilidad[] habilidades=new Habilidad[5];
    private BufferedImage[][] animations;
    private int aniTick, aniIndex, aniSpeed = 25;
    private int playerAction = IDLE;
    private boolean moving = false, attacking = false;
    private boolean left, up, right, down;

    
    
    
    
    
    public Jugador() {
        super(100, 10, 5,new ArrayList<Integer>(),new int[][]{{25,25},{25,15}},new String[]{"Hola"});
        super.setColliders(new int[]{1,2,3,4,5});
        cargarAni();
    }


    

    
    public void update(){
        actualizarPos();
        updateAnimationTick();
        setAnimation();       
    
    }
    private void updateAnimationTick(){
            aniTick++;
            if (aniTick >= aniSpeed) {
                    aniTick = 0;
                    aniIndex++;
                    if (aniIndex >= GetCantidadSprites(playerAction)) {
                            aniIndex = 0;
                            attacking = false;
                    }

            }        
    
    }
    
    private void actualizarPos() {
		moving = false;
                //comprobacion de a que direccion va el jugador.
		if (left && !right) {
                        
			setAceleración(new int[]{-2,0});
			moving = true;
		} else if (right && !left) {
                        
			setAceleración(new int[]{2,0});
			moving = true;
		}

		if (up && !down) {
                        
			setAceleración(new int[]{0,2});
			moving = true;
		} else if (down && !up) {
                        
			setAceleración(new int[]{0,-2});
			moving = true;
		}        
       
    }    
    private void setAnimation() {
            int startAni = playerAction;

            if (moving)
                    playerAction = RUN;
            else
                    playerAction = IDLE;

            /*if (attacking)
                    playerAction = ATTACK;*/

            if (startAni != playerAction)
                    resetAniTick();
    }
    
    

    private void resetAniTick() {
            aniTick = 0;
            aniIndex = 0;
    }   
 
    private void cargarAni() {
            InputStream is = getClass().getResourceAsStream("/AssetsJugador/animations.png");
            if(is == null){
                System.out.println("no se encontro el archivo");
                
            }
            try {
                    BufferedImage img = ImageIO.read(is);

                    animations = new BufferedImage[2][8];
                    for (int j = 0; j < animations.length; j++)
                            for (int i = 0; i < animations[j].length; i++)
                                    animations[j][i] = img.getSubimage(i * 128, j * 64, 128, 64);

            } catch (IOException e) {
                    e.printStackTrace();
            } finally {
                    try {
                            is.close();
                    } catch (IOException e) {
                            e.printStackTrace();
                    }
            }
    }
   
    
    public void render(Graphics g){       
            g.drawImage(animations[playerAction][aniIndex], 100, 100, 128, 80, null);  
    }       

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }
    
}
