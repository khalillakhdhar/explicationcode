/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.explication;

import heritage.Chaise;

/**
 *
 * @author khali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chaise ch1=new Chaise("confort", true, "inconnu", "no def", "none", 1000);
        //ch1.deplacer("USA", "china");
        //double x=ch1.taxe();
        // TODO code application logic here
        /*
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
*/
        Bouteille b=new Bouteille("Sabrine", "minerale", 700);
         Bouteille b2=new Bouteille("Jektis", "minerale", 600);
         b2.setMarque("Safia");
         System.out.println(b2.getPrix());
        Laptop asus=new Laptop("asus Gamer MSI", "I7", 6200);
        System.out.println(b.toString());
        System.out.println(b2.toString());

        System.out.println(asus.toString());
        
        
        
        
    }
    
}
