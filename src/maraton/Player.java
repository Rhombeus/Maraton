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

    public boolean getState() {
        throw new UnsupportedOperationException();
    }

    public void setState(boolean state) {
        throw new UnsupportedOperationException();
    }
    
    public void setStrategy(ItemStrategy str){
        throw  new UnsupportedOperationException();
    }

}
