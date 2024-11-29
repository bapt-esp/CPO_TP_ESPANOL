/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import java.util.ArrayList;
import Armes.Armes;
/**
 *
 * @author bapti
 */
public abstract class personnage {
    protected String nom;
    protected int vie;
    Armes armeportée= null;
    

    public personnage(String nom, int vie) {
        this.nom = nom;
        this.vie = vie;
    }
    
    ArrayList sacperso= new ArrayList();
    
    public void addarme (Armes newarme){
        if (sacperso.size()<5){
            sacperso.add(newarme);
        }
        else{
            System.out.println("Il n'y a plus de place dans le sac perso");
        }
    }
    
/*
    @Override
    public String toString() {
        return "personnage{" + "nom=" + nom + ", vie=" + vie + '}';
    }
  */  

    public Armes getArmeportée() {
        return armeportée;
    }
    public void équipearme(Armes nom1){
        boolean result =  sacperso.contains(nom1);
        if (result == true) {
            armeportée=nom1;
            System.out.println(nom1+ " a été équipé à "+nom);
        }
        else {
            System.out.print ("Cette arme n'est pas dans le sac de "+ nom);
        }    
    }
}
