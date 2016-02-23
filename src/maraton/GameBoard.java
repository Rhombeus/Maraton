/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import java.util.ArrayList;

/**
 *
 * @author Leslie
 */
public class GameBoard {

    private String background; //image
    private static GameBoard gameBoard;
    private ArrayList<BoardSlot> casillas = new ArrayList();

    private GameBoard(String background, ArrayList<BoardSlot> casillas) {
        this.background = background;
        this.casillas = casillas;
    }

    private GameBoard() {
    }

    public static GameBoard getInstance() {
        if (gameBoard == null) {
            gameBoard = new GameBoard();
        }
        return gameBoard;
    }

    //Getters y setters
    public void setBackground(String background) {
        this.background = background;
    }

    public String getBackground() {
        return background;
    }

    public ArrayList<BoardSlot> getCasillas() {
        return casillas;
    }

    public void setCasillas(ArrayList<BoardSlot> casillas) {
        this.casillas = casillas;
    }

    @Override
    public String toString() {
        return "GameBoard{" + "background=" + background + ", casillas=" + casillas + '}';
    }

}
