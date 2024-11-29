/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_espanol;

/**
 *
 * @author bapti
 */
public abstract class personnage {
    protected String nom;
    protected int vie;

    public personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }

    @Override
    public String toString() {
        return "personnage{" + "nom=" + nom + ", vie=" + vie + '}';
    }
    
}
