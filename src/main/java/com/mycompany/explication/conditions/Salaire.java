/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.explication.conditions;

/**
 *
 * @author khali
 */
public class Salaire {
    // si salaire <1000 => taxe=5% 
    //si salaire [1000-3600]=> taxe=12%
    // si salaire >3600 => taxe=19%
    private int brute;
   private  String nom;

    public int getBrute() {
        return brute;
    }

    public void setBrute(int brute) {
        this.brute = brute;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

  
    public Salaire(int brute, String nom) {
        this.brute = brute;
        this.nom = nom;
    }
    public double calcultaxe()
    {
    if(this.brute<1000)
    {
    return this.brute*0.05;
    }
    else if(this.brute<=3600)
    {
    return this.brute*0.12;
    }
    else 
    {
    return this.brute*0.19;
            }
        
  
    
    
    
    }
    
    
    
      public void calculeNet()
    {
        double net=this.brute-this.calcultaxe();
        System.out.println("le salaire net est: "+net);
    
    }
    
    
    
}
