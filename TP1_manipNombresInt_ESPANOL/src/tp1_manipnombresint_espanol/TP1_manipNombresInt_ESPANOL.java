/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_espanol;

import java.util.Scanner;

/*Nom: ESPANOL
Prenom: Bpatiste
grp: TDB
Date: 23/09/24
 */
public class TP1_manipNombresInt_ESPANOL {

    
    public static void main(String[] args) {
        int var1= 0;
        int var2=0;
        int result=0;
        
        Scanner sc= new Scanner (System.in);
        System.out.println("rentrez deux valeurs:");
        var1=sc.nextInt();
        var2=sc.nextInt();
        
        /* calcul de la somme*/
        result= var1+var2;
        System.out.println("La somme de "+var1+" et de "+var2+" est egale a "+result);
        
        /* calcul de la difference*/
        result= var1-var2;
        System.out.println("La difference entre "+var1+" et "+var2+" est egale a "+result);
         
        /*Calcul du produit*/
        result=var1*var2;
        System.out.println("Le produit de "+var1+" et"+var2+" est egale a "+result);
        
        /* Calcul du quotient, on a de la chance que ls variable soit déjà des int*/
        int reste=0;
        result=var1/var2;
        reste = var1%var2;
        System.out.println("La division euclidienne de "+var1+" et "+var2+ " nous donne un quotient de "+result+" et un reste de "+reste);
        
        
    }
    
}
