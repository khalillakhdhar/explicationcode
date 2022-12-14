/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.explication.conditions;

/**
 *
 * @author khali
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age=71;
        if((age<18)&& age>0) //condition
        {
            System.out.println("vous êtes mineur");
        }
        else if(age<=70) // condition (avec obligation d'erreur pour n1)
            //=> age>=18 && age <=70
        {
            System.out.println("vous êtes adulte");
        }
        else // condition générale
        {
            System.out.println("vous êtes senior");
        }
            
        
        
        
        
    }
    
}
