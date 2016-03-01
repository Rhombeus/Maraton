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
public class Inventario {
    private ArrayList<Item> items;

    public Inventario() {
        items=new ArrayList<>();
    }

    public Inventario(ArrayList<Item> items) {
        this.items = items;
    }
    public Item getItem(int i){
        return items.get(i);
    }
    public void addItem(Item it){
        items.add(it);
    }
    public Item delete(int index){
        return items.remove(index);
    }
    
}
