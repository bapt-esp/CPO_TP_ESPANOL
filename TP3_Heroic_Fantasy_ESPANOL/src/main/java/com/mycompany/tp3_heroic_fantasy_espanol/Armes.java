/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_espanol;

/**
 *
 * @author bapti
 */
public abstract class Armes {
    protected String nom;
    protected int nivattaque;
    
    public Armes(String nom, int nivattaque) {
        this.nom = nom;
        if (nivattaque>100){
            this.nivattaque = 100;
        }
        else {
            this.nivattaque= nivattaque;
        }    
    }

    public String getNom() {
        return nom;
    }

    public int getNivattaque() {
        return nivattaque;
    }
    
    @Override
    public String toString() {
        return "arme {" + "nom=" + nom + ", nivattaque=" + nivattaque + '}';
    }
}
