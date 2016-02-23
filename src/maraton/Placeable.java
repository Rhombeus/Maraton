/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

/**
 *
 * @author Leslie
 */
public class Placeable extends Item{
    Position p;

    public Placeable(String imagen, Position p) {
        super(imagen);
        this.p = p;
    }

    public Position getP() {
        return p;
    }

    public void setP(Position p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Placeable{" + "p=" + p + '}';
    }
    
    
    
    
    
}
