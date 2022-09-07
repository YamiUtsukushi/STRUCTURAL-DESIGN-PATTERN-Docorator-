/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpdocorator;

/**
 *
 * @author JiJi
 */
public class SportsCar extends VoitureDecorator{

    public SportsCar(Voiture voiture) {
        super(voiture);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" Ajouter les fonctionnalites d'une Sport car ");
    }
    
    
}
