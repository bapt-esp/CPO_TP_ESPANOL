/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heroic_fantasy_espanol;

import Personnages.personnage;
import Personnages.Magicien;
import Personnages.Guerrier;
import Armes.Epee;
import Armes.Baton;
import Armes.Armes;
import java.util.ArrayList;

/*Nom: ESPANOL
Prenom: Baptiste
Date: 13/11
GRP: TDB
 */
public class TP3_Heroic_Fantasy_ESPANOL {

    public static void main(String[] args) {
        /*Epee Excalibur = new Epee ("Excalibur",7,5);
        Epee Durandal = new Epee ("Durandal",4,7);
        Baton Chêne = new Baton ("Chêne",4,5);
        Baton Charme = new Baton ("Charme",5,6);
        /*System.out.println(Excalibur);
        System.out.println(Durandal);
        System.out.println(Chêne);
        System.out.println(Charme);*/
        /*ArrayList<Armes> Sac= new ArrayList<Armes>();
        Sac.add(Excalibur);
        Sac.add(Durandal);
        Sac.add(Chêne);
        Sac.add(Charme);
        String result1 = Sac.toString();
        System.out.println(result1);*/
        
        /*Magicien Gandalf= new Magicien("Gandalf",65,true);
        Magicien Garcimore= new Magicien("Garcimore",44,false);
        Guerrier Conan = new Guerrier ("Conan",78, false);
        Guerrier Lannister= new Guerrier ("Lanister",45,true);
        ArrayList troupe= new ArrayList();
        troupe.add(Gandalf);
        troupe.add(Garcimore);
        troupe.add(Lannister);
        troupe.add(Conan);
        String result2 = troupe.toString();
        System.out.println(result2);*/
        
        Guerrier Paladin = new Guerrier ("Jayce",70,false);
        Magicien Sorcier = new Magicien ("Viktor",50,false);
        Epee Hexelame = new Epee ("Hexelame",100,20);
        Epee Couteaux = new Epee ("Couteaux",4,7);
        Epee Lancenoxienne= new Epee("Lance Noxienne",3,10);
        Baton Canne = new Baton ("Canne",2,2);
        Baton Spectre = new Baton ("Spectre d'arcane",1000,10);
        Baton Marteaux= new Baton ("Marteau Hexteque",7,20);
        
        
        
        Paladin.équipearme(Hexelame);
            
        Sorcier.équipearme(Spectre);

    }
}
    
