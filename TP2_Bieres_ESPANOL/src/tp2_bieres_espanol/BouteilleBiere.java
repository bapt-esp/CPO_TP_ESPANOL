/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_espanol;

/*
 */
public class BouteilleBiere {
    String Nom="";
    double degreAlcool=0;
    String brasserie="";
    boolean ouverte =false;
    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    public void Décapsuler(){
        boolean resultat=false;
        if (ouverte==false){
            ouverte=true;
            resultat=true;
            System.out.println("La biere a ete ouverte "+ resultat);
        }
        else if (ouverte==true){
            resultat=false;
            System.out.println("La bouteille est deja ouverte "+resultat);
        }
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }
}