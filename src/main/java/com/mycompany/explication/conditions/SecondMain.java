/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.explication.conditions;

/**
 *
 * @author khali
 */
public class SecondMain {
public static void main(String[] args)
{

Salaire s1=new Salaire(2000,"Ahmed");
Salaire s2=new Salaire(4600, "Mohamed");
Salaire s3=new Salaire(900, "Sami");
    System.out.println("la taxe à appliquer pour  Ahmed est: "+s1.calcultaxe());
    s1.calculeNet();
}
    
}
