/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_espanol;

/**
 *
 * @author bapti
 */
public class Magicien extends personnage{
    boolean confirmé= false;

    public Magicien(String nom, int vie, boolean confirmé) {
        super(nom, vie);
        this.confirmé= confirmé;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
}
