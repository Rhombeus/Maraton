package maraton;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leslie
 */
public class Maraton {
    private static ArrayList<BoardSlot> generateCasillas(int casillas){
        ArrayList<BoardSlot> casillass=new ArrayList<>();
        for(int i=0;i<casillas;i++){
            casillass.add(new BoardSlot(new Position(i,0), "img"+i));
        }
        return casillass;
    }
    private static GameBoard setupGBoard(int casillas){
        GameBoard g =GameBoard.getInstance();
        g.setBackground("Algo");
        g.setCasillas(generateCasillas(casillas));
        return g;
    }
    public static Game setup(){
        Game juego=Game.getInstance();
        juego.setNombre("PruebaMaraton");
        juego.setTablero(setupGBoard(30));
        
        ArrayList<Player> jugs=new ArrayList<>();
        jugs.add(new Player("Ignorancia"));
        for(int i=0;i<2;i++){
            jugs.add(new Player("Jugador"+i));
        }
        juego.setJugadores(jugs);
        juego.nextPlayer();
        
        return juego;
    }
    
    public static Baraja generateCards(int cuantas){
        Baraja b=new Baraja();
        TarjetaFactory tj= new TarjetaFactory();
        
        String[] op={"op1","op2","op3"};
        for(int i=0;i<cuantas;i++){
            b.addTarjeta((Tarjeta)tj.crearItem("img"+i, "Cat1", "Alguna pregunta "+i, op, i%3));
            
        }
        
        
        return b;
    }

    //Representar un turno con dos jugadores
    public static void main(String[] args) {
        RulesController.setBaraja(generateCards(20));
        Scanner lec=new Scanner(System.in);
        Game g=setup();
        System.out.println(g);
        for(int i=0;i<5;i++){
            PLayerFacade.tirarYSacarTarjeta(g.getJugadores().get(g.getcPlayer()), lec);
            System.out.println(g);
            g.nextPlayer();
        }
    }
    
}
