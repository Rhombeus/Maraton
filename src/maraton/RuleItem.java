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
public abstract class RuleItem<T,S> extends Item{

    public RuleItem(String imagen) {
        super(imagen);
    }

    public RuleItem() {
    }
    
    
    public abstract T accion(S... args);
}
