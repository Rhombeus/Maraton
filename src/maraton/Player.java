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
public class Player {

    private String nombre;
    private ArrayList<Item> inventario;
    private Item represenacion;
    private Position pos;
    public Player(String nombre) {
        this.nombre = nombre;
        pos=new Position(0,0);
    }
    

    public boolean getState() {
        throw new UnsupportedOperationException();
    }

    public void setState(boolean state) {
        throw new UnsupportedOperationException();
    }
    
    public void setStrategy(ItemStrategy str){
        throw  new UnsupportedOperationException();
    }
     public void avanzar(int cuanto){
         pos.setX(pos.getX()+cuanto);
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Item> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Item> inventario) {
        this.inventario = inventario;
    }

    public Item getRepresenacion() {
        return represenacion;
    }

    public void setRepresenacion(Item represenacion) {
        this.represenacion = represenacion;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Player{" + "nombre=" + nombre + ", inventario=" + inventario + ", represenacion=" + represenacion + ", pos=" + pos + '}';
    }
   
    
    
    

}
