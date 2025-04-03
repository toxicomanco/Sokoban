/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sokoban;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author DAM1_Alu03
 */
public class Pantalla extends JPanel{
    
    private int tileSize = 32;
    
    private BufferedImage imagen;
    private BufferedImage caja;
    
    public Pantalla(){
        try{
            imagen = ImageIO.read(new File("sprites/character.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try {
            caja = ImageIO.read(new File("sprites/caja.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        // Si non hay imagen volves pa atras
        if(imagen == null){return;}
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                g.drawImage(imagen, i * 32,j*32,32,32,this);
                // Se replica la imagen en el tablero
                
                //Se a imagen esta nos extremos poño muros
                if(i==0 || j==0 || i==9 || j==9){
                    
                    
                    
                    g.drawImage(caja, i * 32,j*32,32,32,this);
                    
                }
            }
        }
        

        
        g.drawImage(imagen, 100,100,32,32,this);
    }
}
