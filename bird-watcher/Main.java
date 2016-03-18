
import java.util.Scanner;

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
        
        //System.out.println(linnut.birds());
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }

}
