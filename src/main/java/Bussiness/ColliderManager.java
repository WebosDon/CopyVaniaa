/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness;

import Data.Entidad;
import Data.MapaActual;
import java.util.ArrayList;

public class ColliderManager {
    public static void Colisión(MapaActual mapa){
        ArrayList<Entidad> entidades=mapa.getEntidades();
        for (int i = 0; i < entidades.size(); i++) {
            for (int j = i+1; j < entidades.size(); j++) {
                if(verificar(entidades.get(i),entidades.get(j))){
                    
                }
            }
        }
    }

    private static boolean verificar(Entidad get, Entidad get0) {
        return true;
    }
}
