/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Game {
    private String nombre;
    private GameBoard tablero;
    private ArrayList<Player> jugadores;
    private GameScore score;
    private static Game instance;
    private int cPlayer=0;
    
    private Game(){
    }

    public int getcPlayer() {
        return cPlayer;
    }
    
    public void nextPlayer(){
        cPlayer ++;
        if(cPlayer%jugadores.size()==0){
            cPlayer=1; 
        }else{
           cPlayer=cPlayer%jugadores.size();
        }
        
        
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GameBoard getTablero() {
        return tablero;
    }

    public void setTablero(GameBoard tablero) {
        this.tablero = tablero;
    }

    public GameScore getScore() {
        return score;
    }

    public void setScore(GameScore score) {
        this.score = score;
    }

    public ArrayList<Player> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Player> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    public static Game getInstance() {
        if(instance==null){
            instance=new Game();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Game{" + "nombre=" + nombre + ",\n tablero=" + tablero + ",\n jugadores=" + jugadores + ",\n score=" + score + '}';
    }
    
    
}
