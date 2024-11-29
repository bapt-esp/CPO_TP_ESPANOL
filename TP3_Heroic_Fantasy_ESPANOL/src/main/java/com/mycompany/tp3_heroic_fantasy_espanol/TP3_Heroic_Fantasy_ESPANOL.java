/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp3_heroic_fantasy_espanol;

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
        Epee Excalibur = new Epee ("Excalibur",7,5);
        Epee Durandal = new Epee ("Durandal",4,7);
        Baton Chêne = new Baton ("Chêne",4,5);
        Baton Charme = new Baton ("Charme",5,6);
        /*System.out.println(Excalibur);
        System.out.println(Durandal);
        System.out.println(Chêne);
        System.out.println(Charme);*/
        ArrayList<Armes> Sac= new ArrayList<Armes>();
        Sac.add(Excalibur);
        Sac.add(Durandal);
        Sac.add(Chêne);
        Sac.add(Charme);
        String result1 = Sac.toString();
        System.out.println(result1);
    }
}
    
