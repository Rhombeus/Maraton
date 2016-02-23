
package maraton;

import java.util.ArrayList;

/**
 *
 * @author Leslie
 */
public class BoardSlot {
    private Position pos;
    private String image;
    private ArrayList<Placeable> placeables = new ArrayList();

    public BoardSlot(Position pos, String image) {
        this.pos = pos;
        this.image = image;
    }
    
    public void addPlaceable(Placeable p){
        placeables.add(p);
    }
    
    public void removePlaceable(Placeable p){
        placeables.remove(p);
    }
    //Getters y Setters
    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Placeable> getPlaceables() {
        return placeables;
    }

    public void setPlaceables(ArrayList<Placeable> placeables) {
        this.placeables = placeables;
    }
    
    
}
