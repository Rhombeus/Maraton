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
    Position position;

    public Placeable(String imagen, Position p) {
        super(imagen);
        this.position = p;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Placeable{" + "p=" + position + '}';
    } 
}
