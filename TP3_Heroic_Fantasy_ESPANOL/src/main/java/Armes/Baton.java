/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Armes;

/**
 *
 * @author bapti
 */
public class Baton extends Armes{
    int age;

    public Baton(String nom,int age,int nivattaque) {
        super(nom, nivattaque);
        if(age>1000){
            this.age = 1000;
        }
        else{
            this.age = age;
        }
    }
    
}
