package dungeon;
 
import java.util.Random;
 
/**
 * @author oppilas
 * 
 */
class Vampire {
    private int X;
    private int Y;
    private Random rand = new Random();
     
    public Vampire(int height, int length) {
        this.X = rand.nextInt(length);
        this.Y = rand.nextInt(height);
        // Make sure it doesn't spawn at (0,0)
        while (X == 0 & Y == 0) {
            this.X = rand.nextInt(length);
            this.Y = rand.nextInt(height);
        }
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
