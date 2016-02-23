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
public class Position3d extends Position{
    private int z;

    public Position3d(int x, int y,int z) {
        super(x, y);
        this.z=z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Position3d{"+super.toString() + "z=" + z + '}';
    }
    
    
    
}
