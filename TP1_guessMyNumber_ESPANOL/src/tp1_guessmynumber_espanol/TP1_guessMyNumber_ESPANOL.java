/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_espanol;

import java.util.Random;
import java.util.Scanner;

/*Nom:ESPANOL
Prenom: Baptiste
date: 23/09/24
Grp: TDB
 */
public class TP1_guessMyNumber_ESPANOL {

  
    public static void main(String[] args) {
        
        /*génration d'un nombre aléatoire*/
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(200);
        
        /*demande d'une valeur à l'utilisateur*/
        int var=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Bonjour, saisissez une valeur:");
        var=sc.nextInt();
        
        while (var<n || var>n){
            if (var<n){
                System.out.println("Trop petit");
                System.out.println("saisissez une autre valeur:");
            var=sc.nextInt();
            }
            else if (var>n){
                System.out.println("Trop grand");
                System.out.println("saisissez une autre valeur:");
            var=sc.nextInt();
            }
        }
        if (var==n){
            System.out.println("C'EST GAGNE");
        }

    }
    
}
