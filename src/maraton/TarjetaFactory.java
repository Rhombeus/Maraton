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
public class TarjetaFactory extends ItemFactory{

    @Override
    public Item crearItem(String imagen) {
        return null;
    }

    @Override
    public Item crearItem(String imagen, String cat, String preg, String[] op, String corr) {
        return new Tarjeta(imagen, cat, preg, op, corr);
    }


    
}
