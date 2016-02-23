/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class PLayerFacade {
    private PLayerFacade(){}

	//Corre la secuencia de turno para el jugador del argumento
	public static void tirarYSacarTarjeta(Player jugador,Scanner lec)
	{ 
                System.out.println("Turno de "+jugador.getNombre());
		//Lanzar dado
		int numCasillasAvanzar = Dado.getInstance().accion();
                System.out.println("Dado salio: "+ numCasillasAvanzar);
		//Seleccionar tarjeta al azar
		Tarjeta tarjeta = RulesController.seleccionarTarjeta();

		//Mostrar pregunta
		System.out.println(tarjeta.toString());
                
                System.out.println("Elija su respuesta");
                if(tarjeta.accion(Integer.parseInt(lec.next()))){
                    jugador.avanzar(numCasillasAvanzar);
                    System.out.println("Bien");
                }else{
                    Game.getInstance().getJugadores().get(0).avanzar(numCasillasAvanzar);
                    System.out.println("Avanza la ignorancia");
                }

	}
}
