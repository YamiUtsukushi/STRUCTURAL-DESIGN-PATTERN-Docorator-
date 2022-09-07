/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpdocorator;

/**
 *
 * @author JiJi
 */
public class VoitureDecorator implements Voiture{
    
    protected Voiture voiture;

    public VoitureDecorator(Voiture voiture) {
        this.voiture = voiture;
    }
    

    @Override
    public void assemble() {
        this.voiture.assemble();
    }
    
}
