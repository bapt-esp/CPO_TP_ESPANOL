/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_ESPANOL;

import java.util.Scanner;

/*Nom: ESPANOL
Prenom: Baptiste
date: 15/10/24
GRP:TDB
 */
public class TP2_convertisseurObjet_ESPANOL {

    
    public static void main(String[] args) {
        
        double var=0;
        int ope=0;
                
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
        
        if(ope==1){
            Convertisseur calc1 =new Convertisseur();
            calc1.CelsiusVersKelvin(var);
        }
        if(ope==2){
            Convertisseur calc1 =new Convertisseur();
            calc1.KelvinVersCelsius(var);
        }
        if(ope==3){
            Convertisseur calc1 =new Convertisseur();
            calc1.FarenheitVersCelsius(var);
        }
        if(ope==4){
            Convertisseur calc1 =new Convertisseur();
            calc1.CelsiusVersFarenheit(var);
        }
        if(ope==5){
            Convertisseur calc1 =new Convertisseur();
            calc1.KelvinVersFarenheit(var);
        }
        if(ope==6){
            Convertisseur calc1= new Convertisseur();
            calc1.FarenheitVersKelvin(var);
        }
        
        
        
        
    }
    
}
