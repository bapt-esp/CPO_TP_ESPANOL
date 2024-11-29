/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

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

    @Override
    public String toString() {
        return "Magicien{"+"nom="+nom+", vie="+vie + ", confirm\u00e9=" + confirmé + '}';
    }
    
    
}
