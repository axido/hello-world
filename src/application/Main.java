/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author axido
 */
public class Main {


        public static void main(String[] args) {
    Sensor kumpula = new ConstantSensor(20);
    Sensor kaisaniemi = new ConstantSensor(10);
    Sensor helsinkiVantaa = new ConstantSensor(10);

    AverageSensor helsinkiArea = new AverageSensor();
    helsinkiArea.addSensor(kumpula);
    helsinkiArea.addSensor(kaisaniemi);
    helsinkiArea.addSensor(helsinkiVantaa);

    helsinkiArea.on();
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

    System.out.println("readings: "+helsinkiArea.readings());
}
    
    
}
