/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Players {
    private ArrayList<Player> players;
    
    public Players() {
        players=new ArrayList<>();
    }

    public Players(ArrayList<Player> players) {
        this.players = players;
    }
    public Player getPlayer(int i){
        return players.get(i);
    }
    public void addPlayer(Player player){
        players.add(player);
    }
    public Player delete(int index){
        return players.remove(index);
    }
    public int size(){
        return players.size();
    }
}
