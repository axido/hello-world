
import java.util.Scanner;

/*
 * Main class for the assignment.
 *
 */

public class Main {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        Birdwatcher linnut = new Birdwatcher();
        
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.contains("Add")) {
                linnut.addBird(scanner);
            } else if (command.contains("Statistics")) {
                linnut.statistics();            
            } else if (command.contains("Observation")) {
                linnut.observe(scanner);
            } else if (command.contains("Quit")) {
                break;
            } else if (command.contains("Show")) { 
                linnut.show(scanner);
            } else {
                continue;
            }
        }
    }

}
