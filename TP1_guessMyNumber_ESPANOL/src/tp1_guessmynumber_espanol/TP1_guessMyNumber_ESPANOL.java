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
        
        
        
        
       /* choix de la difficulté*/
        int diff=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Bonjour, veuyez choisir une difficulte \n1) Facile \n2) Normal \n3) Difficile ");
        diff=sc.nextInt();
        
        while (diff>3 || diff<=0){
            System.out.println("erreur de saisie");
            System.out.println("Veuyez choisir une difficulte \n1) Facile \n2) Normal \n3) Difficile ");
            diff=sc.nextInt();    
        }
        
        /*difficulté facile*/
        if (diff==1){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(50);
            System.out.println(n);
            /*demande d'une valeur à l'utilisateur*/
            int var=0;
            System.out.println("Saisissez une valeur entre 0 et 50:");
            var=sc.nextInt();
        
            while (var<n || var>n){
                if (var<n){
                    if (n-var>=20){
                        System.out.println("Vraiment trop petit");
                        System.out.println("saisissez une autre valeur:");
                        var=sc.nextInt();
                    }
                    if (n-var >10 && n-var<20 ){
                        System.out.println(" trop petit");
                        System.out.println("saisissez une autre valeur:");
                        var=sc.nextInt();
                    }
                    if (n-var <=10 ){
                        System.out.println(" Un peu trop petit");
                        System.out.println("saisissez une autre valeur:");
                        var=sc.nextInt();
                    }
                }
                if (var>n){
                    if (var>n+20){
                        System.out.println("Vraiment trop grand");
                        System.out.println("saisissez une autre valeur:");
                        var=sc.nextInt();
                    }
                    if (var >n +10 && var<n+20 ){
                        System.out.println(" trop grand");
                        System.out.println("saisissez une autre valeur:");
                        var=sc.nextInt();
                    }
                    if (var <=n+10 ){
                        System.out.println(" Un peu trop grand");
                        System.out.println("saisissez une autre valeur:");
                        var=sc.nextInt();
                    }
                }
                
            }
            if (var==n){
                System.out.println("C'EST GAGNE");
            }
        
        }
        if (diff==2){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(100);
            System.out.println(n);
            /*demande d'une valeur à l'utilisateur*/
            int var=0;
            System.out.println("Saisissez une valeur entre 0 et 100:");
            var=sc.nextInt();
        
            while (var<n || var>n){
                if (var<n){
                    System.out.println("Trop petit");
                    System.out.println("Saisissez une valeur entre 0 et 100:");
                    var=sc.nextInt();
                }
                if (var>n){
                    System.out.println("Trop grand");
                    System.out.println("Saisissez une valeur entre 0 et 100:");
                    var=sc.nextInt();
                }
                
            }
            if (var==n){
                System.out.println("C'EST GAGNE");
            }
        
        }
        if (diff==3){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(200);
            System.out.println(n);
            /*demande d'une valeur à l'utilisateur*/
            int var=0;
            System.out.println("vous avez 10 coups \n Saisissez une valeur entre 0 et 200:");
            var=sc.nextInt();
        
            for (int i=0; i<=8;i++){
                if (var<n){
                    System.out.println("Trop petit");
                    System.out.println("Saisissez une valeur entre 0 et 200:");
                    var=sc.nextInt();
                }
                if (var>n){
                    System.out.println("Trop grand");
                    System.out.println("Saisissez une valeur entre 0 et 200:");
                    var=sc.nextInt();
                }
                if (i==10){
                    System.out.println("GAME OVER!");
                }
                
            }
            if (var==n){
                System.out.println("C'EST GAGNE");
            }
        
        }
    }
}
