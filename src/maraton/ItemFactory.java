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
public abstract class ItemFactory {
    
    public abstract Item crearItem(String imagen);
    public abstract Item crearItem(String imagen, String cat, String preg, String[] op, int corr);
    
}
