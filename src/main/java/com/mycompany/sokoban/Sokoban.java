package com.mycompany.sokoban;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
    @: Representa al jugador (el "sokoban"). Es el personaje que mueve las cajas.

#: Representa una pared o bloque. Es una barrera que el jugador no puede atravesar.

$: Representa una caja que debe ser movida a una ubicación específica (un objetivo).

.: Representa un objetivo vacío. Es el lugar donde debe ir una caja para completar el nivel.

*: Representa una caja en un objetivo (una caja colocada correctamente).

(espacio en blanco): Representa un área vacía donde el jugador puede moverse libremente.
*/


public class Sokoban {

    private JFrame frame;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Sokoban().iniciar());
                
        
    }
    
    private void iniciar(){
        frame = new JFrame("Sokoban");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        
        frame.add(new Pantalla());
        
        leerTeclado();
        
    }

    private void leerTeclado() {
        frame.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e);
                switch (e.getKeyCode()) {
                    case 39:
                        System.out.println("voy derecha");
                        break;
                    case 40:
                        System.out.println("voy abajo");
                        break;
                    case 37:
                        System.out.println("voy izquierda");
                        break;
                    case 38:
                        System.out.println("voy arriba");
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Suelta tecla");

            }
        });
    }
    
    
}
