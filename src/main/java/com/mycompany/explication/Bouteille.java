/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.explication;

/**
 *
 * @author khali
 */
public class Bouteille {
    private String marque,source;
    private int prix;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Bouteille() {
    }

    public Bouteille(String marque, String source, int prix) {
        this.marque = marque;
        this.source = source;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Bouteille{" + "marque=" + marque + ", source=" + source + ", prix=" + prix + '}';
    }

   
    
    
}
