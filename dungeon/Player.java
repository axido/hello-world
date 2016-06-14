package dungeon;
 
/**
 * @author axido
 * 
 */
public class Player {
    private int Y;
    private int X;
     
    public Player() {
        this.Y = 0;
        this.X = 0;
    }
     
    public int getY() {
        return Y;
    }
     
    public int getX() {
        return X;
    }
     
    public void setY(int newCoord) {
        Y = newCoord;
    }
     
    public void setX(int newCoord) {
        X = newCoord;
    }
}
