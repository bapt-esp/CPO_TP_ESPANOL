/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import java.util.Scanner;

/*Nom:ESPANOL
Prenom: Baptiste
grp: TDB
date:20/09/24
fonction:Calculette
 */
public class Exo3 {

    
    public static void main(String[] args) {
        double operateur;
        double operateur1;
        double operateur2;
        double result;
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Please enter the operator : \n 1) add \n 2) Substract \n 3) Multiply \n 4) divide \n 5) modulo");
        operateur=sc.nextInt();
        
        while (operateur>5 || operateur<=0){
            System.out.println("erreur de saisie");
            System.out.println("Please enter the operator : \n 1) add \n 2) Substract \n 3) Multiply \n 4) divide \n 5) modulo");
            operateur=sc.nextInt();
            
            
        }
        
        
        System.out.println("enter first value");
        operateur1=sc.nextInt();
    
        System.out.println("enter second value");
        operateur2=sc.nextInt();
        
        if (operateur==1){
            result= operateur1+operateur2;
            System.out.println("Le resultat est "+result);
        }
        
        if (operateur==2){
            result=operateur1-operateur2;
            System.out.println("Le resultat est "+result);
        }
        
        if (operateur==3){
            result=operateur1*operateur2;
            System.out.println("Le resultat est "+result);
        }
        
        if (operateur==4){
            result=operateur1/operateur2;
            System.out.println("Le resultat est "+result);
        }
        if (operateur==5){
            result=operateur1%operateur2;
            System.out.println(operateur1+" est egale a "+result+" modulo "+operateur2);
        }
    }
    
}
