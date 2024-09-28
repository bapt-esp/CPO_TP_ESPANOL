/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_espanol;

import java.util.Random;
import java.util.Scanner;

/*Nom: ESPANOL
Prenom:Baptiste
date:28/09/24
GRP: TDB
 */
public class TP1_stats_ESPANOL {

    
    public static void main(String[] args) {
        double a=0;
        double b=0;
        double c=0;
        double d=0;
        double e=0;
        double f=0;
        
        int m=0;
        int [] tabstat= new int[6];
        Scanner sc= new Scanner (System.in);
        System.out.println("rentrez une valeure:");
        m=sc.nextInt();
        System.out.println("voila les valeurs tirees au sort ");
        for (int i=0; i<m; i++){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(tabstat.length);
            System.out.println(n);
            if (n==0){
                a+=1;
            }
            else if (n==1){
                b+=1;
            }
            else if (n==2){
                c+=1;  
            }
            else if (n==3){
                d+=1;
            }
            else if (n==4){
                e+=1;  
            }
            else if (n==5){
                f+=1;  
            }
            
            
        }
             
        a=a*100/m;
        b=b*100/m;
        c=c*100/m;
        d=d*100/m;
        e=e*100/m;
        f=f*100/m;
        double []tabres = {a,b,c,d,e,f};
        for (int p=0; p<tabres.length; p++){
            System.out.println("le chiffre "+(p+1)+" a une proba de sortie de"+tabres[p]);
        }
    }
    
}
