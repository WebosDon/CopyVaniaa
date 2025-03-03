/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import Bussiness.Control;
import Bussiness.Game;
import Data.Entidad;
import Data.MapaActual;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author donwe
 */
public class Escenario extends JPanel{

    private InputControl input;
    private MapaActual mapa;
    private Game game;
    
    
    public Escenario(Control control,MapaActual mapa, Game game) {
        
        input = new InputControl(control);
        this.addKeyListener(input);
        this.mapa=mapa;
        this.game = game;
        
        setPanelSize();
        
    }
    
    private void setPanelSize() {
        Dimension size = new Dimension(1080, 720);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);

    }
    
    
    

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        for (Entidad entidad : mapa.getEntidades()) {
            g.fillRect(entidad.getPosición()[0], 300-entidad.getPosición()[1], entidad.getArea()[0][1], entidad.getArea()[0][0]);        
        }
        game.render(g);
        
    }
}
