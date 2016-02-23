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
public class Dado extends RuleItem<Integer,Void>{
    private static final Random R= new Random();
    private static Dado instanceDado;
    
    
    private Dado() {
    }
    
    
    public static Dado getInstance(){
       if(instanceDado==null){
           instanceDado=new Dado();
       }
       return instanceDado;
    }
    /* Facade
    public int tirarDado(){
        Random num = new Random();
        return num.nextInt(6) + 1;
    }*/   

    @Override
    public Integer accion(Void... args) {
        Integer a=R.nextInt(6)+1;
        return a;
    }
}
