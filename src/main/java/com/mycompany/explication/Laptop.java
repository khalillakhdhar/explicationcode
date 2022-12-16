/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.explication;

/**
 *
 * @author khali
 */
public class Laptop {
    private String marque,cpu;
    private double prix;

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Laptop() {
    }

    public Laptop(String marque, String cpu, double prix) {
        this.marque = marque;
        this.cpu = cpu;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Laptop{" + "marque=" + marque + ", cpu=" + cpu + ", prix=" + prix + '}';
    }
    
}
