/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.doranco.week11tpdocorator;

/**
 *
 * @author JiJi
 */
public class Week11TpDocorator {

    public static void main(String[] args) {
        
        
        Voiture voiture = new SportsCar(new BasicVoiture());
        
        voiture.assemble();
        
        System.out.println("\n*******");
        
        Voiture luxe = new LuxuryCar(new LuxuryCar(new BasicVoiture()));
        
        luxe.assemble();
    }
}
