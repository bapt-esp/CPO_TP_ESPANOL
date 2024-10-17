/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_espanol;

/*Nom: ESPANOL
Prenom: Baptiste
date: 17/10/24
GRP: TDB
 */
public class TP2_manip_ESPANOL {

    
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2 ;
        assiette2 =assiette1;
        assiette1=assiette3;
                
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;

        Moussaka[] tabMou = new Moussaka [10];
        
        /*Moussaka assiette10=new Moussaka (245);
        Moussaka assiette11=new Moussaka (463);
        Moussaka assiette12=new Moussaka (285);
        Moussaka assiette13=new Moussaka (937);
        Moussaka assiette14=new Moussaka (155);
        Moussaka assiette15=new Moussaka (528);
        Moussaka assiette16=new Moussaka (628);
        Moussaka assiette17=new Moussaka (735);
        Moussaka assiette18=new Moussaka (526);
        Moussaka assiette19=new Moussaka (625);*/
        
        
        for (int i=0; i<10;i++){
            tabMou[i]=new Moussaka(200+20*i);
            System.out.println(tabMou[i]);
        }
        
    }
    
}
