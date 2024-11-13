/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_espanol;

/**
 *
 * @author bapti
 */
public class Epee extends Armes{
    int finesse;

    public Epee(String nom,int finesse,int nivattaque) {
        super(nom, nivattaque);
        if(finesse>100){
            this.finesse = 100;

        }
        else{
            this.finesse = finesse;
        }
    }
}
