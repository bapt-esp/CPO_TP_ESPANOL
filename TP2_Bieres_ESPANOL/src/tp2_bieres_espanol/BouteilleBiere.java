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
    /*public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }*/
    public boolean Décapsuler(){
        if (ouverte==false){
            ouverte=true;
            
            return true;
        }
       
        else {
            
            return false;
        }
    }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    Nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    }
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom + " (" + degreAlcool + " degres)Ouverte ? ";
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
}