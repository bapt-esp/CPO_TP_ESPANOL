/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_espanol;

/*Nom: ESPANOL
Prenom: Baptiste
Grp: TDB
date: 11/10/24
 */
public class TP2_Bieres_ESPANOL {

    
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0 ,"Dubuisson");
        uneBiere.ouverte=false;
        uneBiere.Décapsuler();
        /*uneBiere.lireEtiquette();*/
        System.out.println(uneBiere) ;
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        deuxBiere.ouverte=false;
        deuxBiere.Décapsuler();
        /*deuxBiere.lireEtiquette();*/
        System.out.println(deuxBiere) ;
        
        BouteilleBiere troisBiere = new BouteilleBiere("86",9,"8 morts 6 blesses");
        troisBiere.ouverte=true;
        troisBiere.Décapsuler();
        /*troisBiere.lireEtiquette();*/
        System.out.println(troisBiere) ;
        
        BouteilleBiere quatreBiere = new BouteilleBiere("Rince Cochon",8,"trois petits cochons");
        quatreBiere.ouverte=false;
        quatreBiere.Décapsuler();
        /*quatreBiere.lireEtiquette();*/
        System.out.println(quatreBiere) ;
        
        BouteilleBiere cinqBiere = new BouteilleBiere("Desperados",6.8,"Viva ESPANA");
        cinqBiere.ouverte=true;
        cinqBiere.Décapsuler();
        /*cinqBiere.lireEtiquette();*/
        System.out.println(cinqBiere) ;
    }
    
}
