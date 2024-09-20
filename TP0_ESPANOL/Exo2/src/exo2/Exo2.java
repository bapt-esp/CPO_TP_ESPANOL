/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/*nom:ESPANOL
Prenom:Baptiste
Date:20/09/24
GRP: TDB
 */
public class Exo2 {

    public static void main(String[] args) {
        

        int nb; 
        int result; 
        int ind; 
        nb=0;
        result=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();

        ind=1;
        while (ind <= nb) {
        result=result+ind;
        ind+=1;
        }

System.out.println();
System.out.println("La somme des "+ nb + " entiers est : "+result);
    }
}


