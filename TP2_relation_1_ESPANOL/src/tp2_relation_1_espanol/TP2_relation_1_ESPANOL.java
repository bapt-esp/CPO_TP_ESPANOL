/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_espanol;

/*Prenom: Baptiste
Nom: ESPANOL
GRP: TDB
date: 23/10/24
 */
public class TP2_relation_1_ESPANOL {

    
    public static void main(String[] args) {
        Voiture Clio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles \n"+ Clio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
    bob.liste_voitures[0] = Clio ;
    bob.nbVoitures += 1 ;
    Clio.Proprietaire = bob ;
    
    bob.liste_voitures[1] = uneMicra ;
    bob.nbVoitures += 1 ;
    uneMicra.Proprietaire = bob ;
    
    System.out.println("la premiere voiture de Bob est "+bob.liste_voitures[0]);
    System.out.println("Bob a "+bob.nbVoitures+" Voiture");
    
    reno.liste_voitures[0] = Clio ;
    reno.nbVoitures += 1 ;
    Clio.Proprietaire = reno ;
    
    reno.liste_voitures[1] = une2008 ;
    reno.nbVoitures += 1 ;
    uneMicra.Proprietaire = reno ;
    
    reno.liste_voitures[2] = uneAutreClio ;
    reno.nbVoitures += 1 ;
    uneMicra.Proprietaire = reno ;
    
    System.out.println("la premiere voiture de reno est "+reno.liste_voitures[0]);
    System.out.println("reno a "+reno.nbVoitures+" Voiture");
    }
    
}
