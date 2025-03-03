package Data;

import java.util.ArrayList;

public class Entidad {

    private int vida;
    private int ataque;
    private int defensa;
    private int[] Aceleración = new int[]{0, 0};
    private int[] Velocidad = new int[]{0, 0};
    private int[] Posición=new int[]{0,0};
    private int[] PosiciónFutura=new int[]{0,0};
    private ArrayList<Integer> colliders;
    private int[][] area;
    // private String[] animaciones;

    public Entidad(int vida, int ataque, int defensa, ArrayList<Integer> colliders, int[][] area, String[] animaciones) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.colliders = colliders;
        this.area = area;
        //this.animaciones = animaciones;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int[] getPosición() {
        return Posición;
    }

    public int[] getPosiciónFutura() {
        return PosiciónFutura;
    }

    public ArrayList<Integer> getColliders() {
        return colliders;
    }

    public int[][] getArea() {
        return area;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAceleración() {
        if (this.Velocidad[0]!=0) {
            this.Aceleración[0]=(int) (-this.Velocidad[0]/3);
            if((int) (-this.Velocidad[0]/3)==0){
                this.Velocidad[0]=0;
            }
        }
        /*if(this.Aceleración[1]!=9){
            this.Aceleración[1]=9;
        }*/
        setVelocidad();
    }

    public void setAceleración(int[] Aceleración) {
        this.Aceleración = Aceleración;
        this.setVelocidad();
    }

    public void setVelocidad(int[] velocidad) {
        this.Velocidad = velocidad;
        this.setPosiciónFutura();
    }

    public void setVelocidad() {
        this.Velocidad[0] = this.Velocidad[0] + this.Aceleración[0];
        this.Velocidad[1] = this.Velocidad[1] + this.Aceleración[1];
        if (this.Velocidad[0] > 10) {
            this.Velocidad[0] = 10;
        } else if (this.Velocidad[0] < -10) {
            this.Velocidad[0] = -10;
        }
        this.setPosiciónFutura();
    }

    public void setPosiciónFutura(int[] Posición) {
        this.PosiciónFutura = Posición;
    }
    
    public void setPosiciónFutura() {
        this.PosiciónFutura[0] = this.PosiciónFutura[0] + this.Velocidad[0];
        this.PosiciónFutura[1] = this.PosiciónFutura[1] + this.Velocidad[1];
    }

    public void setPosición() {
        this.Posición=this.PosiciónFutura;
    }
    public void setColliders(int[] colliders) {
        for (int collider : colliders) {
            this.colliders.add(collider);
        }
    }

    public void deleteColliders(int[] colliders) {
        for (int collider : colliders) {
            this.colliders.remove(collider);
        }
    }

    public void setArea(int[][] area) {
        this.area = area;
    }

    /*public void setAnimaciones(String[] animaciones) {
        this.animaciones = animaciones;
    }*/
}
