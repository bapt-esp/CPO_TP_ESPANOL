/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_ESPANOL;

/**
 *
 * @author bapti
 */
public class Convertisseur {
    int nbConversions=0;
    
    public double CelsiusVersKelvin (double tCelsius) {
        double kelv2=273.15;
        kelv2 += tCelsius;
        System.out.println(kelv2);
        nbConversions+=1;
        return kelv2;
    }
    public double KelvinVersCelsius (double tKelvin) {
        double kelv=-273.15;
        kelv += tKelvin;
        System.out.println(kelv);
        nbConversions+=1;
        return kelv;
    }
    public double FarenheitVersCelsius (double tFar) {
        double Cels=32;
        Cels= (tFar-Cels)*5/9;
        System.out.println(Cels);
        nbConversions+=1;
        return Cels;
    }
    public double CelsiusVersFarenheit (double tCels) {
        double far=32;
        far= (tCels*9/5)+far;
        System.out.println(far);
        nbConversions+=1;
        return far;
    }
    public double KelvinVersFarenheit(double tfar) {
        double far=32;
        double kelv=273.15;
        far= (tfar-kelv)*9/5+far;
        System.out.println(far);
        nbConversions+=1;
        return far;
    }
    public double FarenheitVersKelvin (double tKelv) {
        double far=32;
        double kelv=273.15;
        far= (tKelv-far)*5/9+kelv;
        System.out.println(far);
        nbConversions+=1;
        return far;
    }
    @Override
    public String toString () {
        return "nb de conversions "+ nbConversions;
    }

}
