
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
