/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpdocorator;

/**
 *
 * @author JiJi
 */
public class LuxuryCar extends VoitureDecorator{

    public LuxuryCar(Voiture voiture) {
        super(voiture);
    }

    @Override
    public void assemble() {
        super.assemble(); 
        System.out.println("Ajoute des fonctionalités de la voiture de Luxe");
    }
    
    
    
}
