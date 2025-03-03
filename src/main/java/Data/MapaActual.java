/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author csant
 */
public class MapaActual {
    private int[][] mapa;
    private ArrayList<Entidad> Entidades=new ArrayList<>();

    public MapaActual(int[][] mapa) {
        this.mapa = mapa;
    }

    public void setObjetos(Entidad[] Entidades) {
        this.Entidades.addAll(Arrays.asList(Entidades));
    }

    public ArrayList<Entidad> getEntidades() {
        return Entidades;
    }
    
}
