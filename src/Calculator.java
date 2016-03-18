/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author axido
 */
public class Calculator {
    private Reader reader = new Reader();
    private int calculations = 0;
    
    private void sum() {
        
        System.out.print("value1: ");
        int first = reader.readInteger();
        System.out.print("value2: ");
        int second = reader.readInteger();
        System.out.println("sum of the values " + (first + second));
        this.calculations++;
    }
    
    private void difference() {
        
        System.out.print("value1: ");
        int first = reader.readInteger();
        System.out.print("value2: ");
        int second = reader.readInteger();
        System.out.println("difference of the values " + (first - second));
        this.calculations++;
    }
    
    private void product() {
        
        System.out.print("value1: ");
        int first = reader.readInteger();
        System.out.print("value2: ");
        int second = reader.readInteger();
        System.out.println("product of the values " + (first * second));
        this.calculations++;
    }
    
    private void statistics() {
        System.out.println("Calculations done: " + this.calculations);
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
}
