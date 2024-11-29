/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3_heroic_fantasy_espanol;

import com.mycompany.tp3_heroic_fantasy_espanol.Armes;

/**
 *
 * @author bapti
 */
public class Baton extends Armes{
    int age;

    public Baton(String nom,int age,int nivattaque) {
        super(nom, nivattaque);
        if(age>100){
            this.age = 100;
        }
        else{
            this.age = age;
        }
    }
    
}
