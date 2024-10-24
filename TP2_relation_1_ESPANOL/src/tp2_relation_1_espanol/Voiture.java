/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_espanol;

/**
 *
 * @author bapti
 */
public class Voiture {
    String modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture(String modele, String Marque, int PuissanceCV) {
        this.modele = modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.Proprietaire= null;
    }

    @Override
    public String toString() {
        return "Voiture{" + "modele=" + modele + ", Marque=" + Marque + ", PuissanceCV=" + PuissanceCV + '}';
    }

    
    
}
