/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import java.util.Random;

/**
 *
 * @author Leslie
 */


//Singleton
public class Dado extends RuleItem{
    private static final Random R= new Random();
    private Dado dado;
    private Dado(String imagen) {
        super(imagen);
    }
    
    public Dado getInstance(String imagen){
        if(dado == null){
            return new Dado(imagen);
        }else{
            return dado;
        }
    }

    @Override
    public Integer accion() {
        System.out.println("Tirar dado");
        Integer a=R.nextInt(6)+1;
        return a;
    }
    /* Facade
    public int tirarDado(){
        Random num = new Random();
        return num.nextInt(6) + 1;
    }*/
    
}
