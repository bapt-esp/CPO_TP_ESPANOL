/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_espanol;

import java.util.Scanner;

/*Nom= ESPANOL
Prenom: Baptiste
Date: 23/09/24
Grp: TDB
 */
public class TP1_convertisseur_ESPANOL {

    
    public static void main(String[] args) {
        /*Initialisation des variables*/
        double var=0;
        int ope=0;
        
        /*Choix des valeurs et de la convertion*/
        Scanner sc= new Scanner (System.in);
        System.out.println("Bonjour, saisissez une valeur:");
        var=sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer : \n 1) Celsius => Kelvin \n 2) Kelvin => Celsius \n 3) Farenhiet => Celsius \n 4) Celsius => Farenheit \n 5) Kelvin => Farenheit \n 6) Farenheit => Kelvin" );
        ope=sc.nextInt();
        
        while (ope>6 || ope<=0){
            System.out.println("erreur de saisie");
            System.out.println("Saisissez la conversion que vous souhaitez effectuer : \n 1) Celsius => Kelvin \n 2) Kelvin => Celsius \n 3) Farenhiet => Celsius \n 4) Celsius => Farenheit \n 5) Kelvin => Farenheit \n 6) Farenheit => Kelvin");
            ope=sc.nextInt();    
        }
           
        
        /*Affichage des convertion*/
        if (ope==1){
        double kelv=CelsiusVersKelvin(var);
        System.out.println(var+ " degre Celsius donne "+kelv+ " Kelvin");
        }
        if (ope==2){
        double Cels=KelvinVersCelsius(var);
        System.out.println(var+ " degre Kelvin donne "+Cels+ " Celsius");
        }
        if (ope==3){
        double Far=FarenheitVersCelsius(var);
        System.out.println(var+ " degre Farenheit donne "+Far+ " Celsius");
        }
        if (ope==4){
        double cels=CelsiusVersFarenheit(var);
        System.out.println(var+ " degre Celsius donne "+cels+ " Farenheit");
        }
        if (ope==5){
        double Kelv=KelvinVersFarenheit(var);
        System.out.println(var+ " degre Kelvin donne "+Kelv+ " Farenheit");
        }
        if (ope==6){
        double far=FarenheitVersKelvin(var);
        System.out.println(var+ " degre Farenheit donne "+far+ " Kelvin");
        }
    }
    
    /*Calcul des conversion*/
    public static double CelsiusVersKelvin (double tCelsius) {
        double kelv2=273.15;
        kelv2 += tCelsius;
        return kelv2;
    }
    public static double KelvinVersCelsius (double tKelvin) {
        double kelv=-273.15;
        kelv += tKelvin;
        return kelv;
    }
    public static double FarenheitVersCelsius (double tFar) {
        double Cels=32;
        Cels= (tFar-Cels)*5/9;
        return Cels;
    }
    public static double CelsiusVersFarenheit (double tCels) {
        double far=32;
        far= (tCels*9/5)+far;
        return far;
    }
    public static double KelvinVersFarenheit(double tfar) {
        double far=32;
        double kelv=273.15;
        far= (tfar-kelv)*9/5+far;
        return far;
    }
    public static double FarenheitVersKelvin (double tKelv) {
        double far=32;
        double kelv=273.15;
        far= (tKelv-far)*5/9+kelv;
        return far;
    }
    
}
