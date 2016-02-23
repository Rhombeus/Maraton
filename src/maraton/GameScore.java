/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import java.util.HashMap;

/**
 *
 * @author Alejandro
 */
public class GameScore<T> {
    private HashMap<Player,T> score;
     public T getPlayerScore(Player p){
         return score.get(p);
     }
     public void setPlayerScore(Player p, T sc){
         score.replace(p, sc);
     }

    @Override
    public String toString() {
        return "GameScore{" + "score=" + score + '}';
    }
     
     
}
