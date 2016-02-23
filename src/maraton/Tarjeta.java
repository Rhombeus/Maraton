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
public class Tarjeta extends RuleItem<Pregunta>{
    private String categoria;
    private String pregunta;
    private String[] opciones;
    private String correcta; //respuesta correcta

    public Tarjeta(String imagen, String categoria, String pregunta, String[] opciones, String correcta) {
        super(imagen);
        this.categoria = categoria;
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.correcta = correcta;
    }
    
    @Override
    public Pregunta accion() {
        System.out.println("Tomar tarjeta");
    }
    
    
}
