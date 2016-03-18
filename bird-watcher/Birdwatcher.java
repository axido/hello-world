
import java.util.ArrayList;
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
public class Birdwatcher {
    
    public ArrayList<Bird> birds;
    
    public Birdwatcher() {
        this.birds = new ArrayList<Bird>();
    }
    
    public static void scan(Scanner scanner) {
        String scan = scanner.nextLine();
    }
    
    public void addBird(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Latin Name: ");
        String latin = scanner.nextLine();
        Bird bird = new Bird(name, latin);
        this.birds.add(bird);
        
    }
    
    public void observe(Scanner scanner) {
        boolean found = false;
        System.out.print("What was observed? ");
        String name = scanner.nextLine();
        for (Bird bird : birds) {
            if (bird.name().contains(name)) {
                bird.observe();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Dat not börd!");
        }
    }
    
    public void show(Scanner scanner) {
        boolean found = false;
        System.out.print("What? ");
        String name = scanner.nextLine();
        for (Bird bird : birds) {
            if (bird.name().contains(name)) {
                System.out.println(bird.name() + " (" + bird.latin() + "): " + bird.getObservations() + " observations"); 
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Dat not börd!");
        }
    }
    
    public void statistics() {
        for (Bird bird : this.birds) {
            System.out.println(bird.name() + " (" + bird.latin() + "): " + bird.getObservations() + " observations"); 
        }
        
    }
    


}
