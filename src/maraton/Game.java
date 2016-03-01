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
    private Players jugadores;
    private GameScore score;
    private static Game instance;
    private int currentPlayer=0;
    
    private Game(){
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }
    
    public void nextPlayer(){
        currentPlayer ++;
        if(currentPlayer%jugadores.size()==0){
            currentPlayer=1; 
        }else{
           currentPlayer=currentPlayer%jugadores.size();
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

    public Players getJugadores() {
        return jugadores;
    }

    public void setJugadores(Players jugadores) {
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
