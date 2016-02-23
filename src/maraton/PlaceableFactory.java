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
public class PlaceableFactory extends ItemFactory{

    @Override
    public Item crearItem(String imagen) {
        return new Placeable(imagen, new Position(0,0));
    }

    @Override
    public Item crearItem(String imagen, String cat, String preg, String[] op, int corr) {
        return null;
    }
    
    
    
}
