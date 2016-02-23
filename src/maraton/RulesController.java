/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

/**
 *
 * @author Alejandro
 */
public class RulesController {
    private static Baraja baraja;

	public static Tarjeta seleccionarTarjeta()
	{
		if(baraja != null)	return baraja.sacarTarjetaRandom();

		else 				return null;
	}

	public static void setBaraja(Baraja barajas)
	{
		baraja = barajas;
	}

	public static Baraja getBaraja()
	{
		return baraja;
	}
}
