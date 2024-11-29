/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_espanol;

/**
 *
 * @author bapti
 */
public class Guerrier extends personnage{
    boolean acheval= false;
    
    public Guerrier(String nom, int vie, boolean acheval) {
        super(nom, vie);
        this.acheval=acheval;
    }

    public void setAcheval(boolean acheval) {
        this.acheval = acheval;
    }
    
}
