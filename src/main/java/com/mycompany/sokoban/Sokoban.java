package com.mycompany.sokoban;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


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
