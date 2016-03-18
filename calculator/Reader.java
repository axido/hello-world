
import java.util.Scanner;

/*
 * Reader class for Scanner.
 * 
 */

/**
 *
 * @author axido
 */
public class Reader {
    private Scanner reader = new Scanner(System.in);
    
    public Reader() {
        
    }
    
    public String readString() {
        String line = reader.nextLine();
        return line;
    }
    
    public int readInteger() {
        int line = Integer.parseInt(reader.nextLine());
        return line;
    }
}
