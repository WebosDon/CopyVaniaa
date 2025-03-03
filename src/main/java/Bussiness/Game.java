/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness;

import Data.Entidad;
import Data.Jugador;
import Data.MapaActual;
import UI.Escenario;
import UI.Ventana;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author donwe
 */
public class Game implements ActionListener, Runnable{
    private Ventana gameWindow;
    private Jugador jugador=new Jugador();
    private Control control=new Control(jugador);
    private Escenario gamePanel;
    private Timer timer;
    private MapaActual mapa=new MapaActual(new int[][]{{1},{1}});
    private final int FPS_SET = 120;
    private final int UPS_SET = 200;
    private Thread GameThread;
    
    
    public Game(){
        Entidad entidad=new Entidad(100, 4, 5, new ArrayList<Integer>(),new int[][]{{50,25}},new String[]{""});
        entidad.setColliders(new int[]{1,2,3});
        entidad.setPosiciónFutura(new int[]{100, 0});
        entidad.setPosición();
        mapa.setObjetos(new Entidad[]{jugador,entidad});
        gamePanel = new Escenario(control,mapa, this);
        gameWindow = new Ventana(gamePanel);
        gamePanel.setFocusable(true); 
        gamePanel.requestFocus();
        timer=new Timer(50, this);
        timer.start();
        startGameLoop();
    }
    
    private void update() {
        jugador.update();
    } 
    
    public void render(Graphics g) {
            jugador.render(g);
    }
    
    private void startGameLoop() {
            GameThread = new Thread(this);
            GameThread.start();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        jugador.setAceleración();
        ColliderManager.Colisión(mapa);
        jugador.setPosición();

    }



    @Override
    public void run() {

            double timePerFrame = 1000000000.0 / FPS_SET;
            double timePerUpdate = 1000000000.0 / UPS_SET;

            long previousTime = System.nanoTime();

            int frames = 0;
            int updates = 0;
            long lastCheck = System.currentTimeMillis();

            double deltaU = 0;
            double deltaF = 0;

            while (true) {
                    long currentTime = System.nanoTime();

                    deltaU += (currentTime - previousTime) / timePerUpdate;
                    deltaF += (currentTime - previousTime) / timePerFrame;
                    previousTime = currentTime;

                    if (deltaU >= 1) {
                            update();
                            updates++;
                            deltaU--;
                    }

                    if (deltaF >= 1) {
                            gamePanel.repaint();
                            frames++;
                            deltaF--;
                    }

                    if (System.currentTimeMillis() - lastCheck >= 1000) {
                            lastCheck = System.currentTimeMillis();
                            System.out.println("FPS: " + frames + " | UPS: " + updates);
                            frames = 0;
                            updates = 0;

                    }
            }

    }


}
