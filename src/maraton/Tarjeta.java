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
public class Tarjeta extends RuleItem<Boolean,Integer>{
    private String categoria;
    private String pregunta;
    private String[] opciones;
    private int correcta; //respuesta correcta

    public Tarjeta(String imagen, String categoria, String pregunta, String[] opciones, int correcta) {
        super(imagen);
        this.categoria = categoria;
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.correcta = correcta;
    }

    @Override
    public Boolean accion(Integer... resp) {
        return resp[0]==correcta;
    }

    @Override
    public String toString() {
        
        
        String respuesta =  "Tarjeta{" + "categoria=" + categoria + ", pregunta=" + pregunta + ", opciones=";
        for(int i = 0; i< opciones.length; i++)
        {
            respuesta+=opciones[i] +", ";
        }
        respuesta += "}";
        return respuesta;
    }
    
    
    
    
}
