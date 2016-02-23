/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alejandro
 */
public class Baraja {
    private ArrayList<Tarjeta> tarjetas=new ArrayList<>();
    private static final Random R=new Random();
	public Baraja(){}

	public void addTarjeta(Tarjeta tarjeta)
	{
		tarjetas.add(tarjeta);
	}

	public Tarjeta sacarTarjetaRandom()
	{
		return tarjetas.get(R.nextInt(tarjetas.size()));
	}
}
