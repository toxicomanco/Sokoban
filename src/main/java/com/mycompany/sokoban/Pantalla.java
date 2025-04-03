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
    
    private BufferedImage protagonista;
    private BufferedImage caja;
    private BufferedImage cajaPuesta;
    private BufferedImage muro;
    private BufferedImage boton;
    
    public Pantalla(){
        try{
            protagonista = ImageIO.read(new File("sprites/character.png"));
            caja = ImageIO.read(new File("sprites/caja.png"));
            cajaPuesta = ImageIO.read(new File("sprites/cajaPuesta.png"));
            muro = ImageIO.read(new File("sprites/muro.png"));
            boton = ImageIO.read(new File("sprites/boton.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        
        LevelManager nivel = new LevelManager();
        char[][]lvl = nivel.getNivel();
        
        // Si non hay protagonista volves pa atras
        if(protagonista == null){return;}
        
        /*for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
        g.drawImage(protagonista, i * 32,j*32,32,32,this);
        // Se replica la protagonista en el tablero
        
        //Se a protagonista esta nos extremos poño muros
        if(i==0 || j==0 || i==9 || j==9){
        
        
        
        g.drawImage(caja, i * 32,j*32,32,32,this);
        
        }
        }
        }*/
        
        // Imprime los objetos segun su valor
        
        for (int i = 0; i < lvl.length; i++) {
            for (int j = 0; j < lvl[i].length; j++) {
                if(lvl[i][j]== '#'){
                    g.drawImage(muro, j * 32,i*32,32,32,this);
                }
                else if(lvl[i][j] == '$'){
                    g.drawImage(caja, j * 32,i*32,32,32,this);
                }
                else if(lvl[i][j] == '*'){
                    g.drawImage(cajaPuesta, j * 32,i*32,32,32,this);
                }
                else if(lvl[i][j]== '@'){
                    g.drawImage(protagonista, j * 32,i*32,32,32,this);
                }
                else if(lvl[i][j]== '.'){
                    g.drawImage(boton, j * 32,i*32,32,32,this);
                }
                
                
            }
        }

        
        /*g.drawImage(protagonista, 100,100,32,32,this);*/
    }
}
