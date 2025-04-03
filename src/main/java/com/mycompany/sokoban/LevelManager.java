package com.mycompany.sokoban;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DAM1_Alu03
 */
public class LevelManager {
    private char [][] nivel ={
        {'#', '#', '#', '#'},
        {'#',' ' ,'.', '#'},
        {'#', ' ',' ', '#', '#', '#'},
        {'#', '*', '@', ' ',' ', '#'},
        {'#', ' ', ' ', '$', ' ', '#'},
        {'#', ' ',' ', '#', '#', '#'},
        {'#', '#', '#', '#'}
    };
    
    public void cargarNiveles() throws IOException{
        String nombreArchivo = "nivel/niveles.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println("linea");
                
            }
        }catch(IOException e){
            System.err.print("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * @return the nivel
     */
    public char[][] getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(char[][] nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the nivel
     */
   
    
    
}
