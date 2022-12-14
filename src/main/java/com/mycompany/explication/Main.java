/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.explication;

/**
 *
 * @author khali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=7;
        float y=1;
        double z=8.345;
        char c='o';
        String machaine="bonjour";
        String convert="2022";
        
         // deux equivalent x=x+2;x+=2; (-/*+)
        y=x; // pas de probléme
        System.out.println("x= "+x+" y= "+y+" z= "+z);
        // on peut affecter un int à float sans problémes
        //x=y;  traitement refusé (possible value loss) possibilité de perte de donnée
        //z=y;
        //y=z;  traitement refusé (possible value loss) possibilité de perte de donnée
        int w= (int) z;
        boolean b=true;
        System.out.println("b= "+ b);
        System.out.println("!b= "+ !b);
        System.out.println( "z= "+z+" w= "+w);
        
        int cv=Integer.parseInt(convert); 
        double cvd=Double.parseDouble(convert);
        float cvf=Float.parseFloat(convert);

        // Type.parseType => convertit une chaine en nombre

    }
    
}
