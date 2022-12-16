/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

/**
 *
 * @author khali
 */
public abstract class Meubles {
    private String matiere,dimension,couleur;
    private double prix;

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Meubles() {
    }

    public Meubles(String matiere, String dimension, String couleur, double prix) {
        this.matiere = matiere;
        this.dimension = dimension;
        this.couleur = couleur;
        this.prix = prix;
    }
    
    protected void deplacer(String source,String destination)
    {
        System.out.println("deplacement de "+source+" vers "+destination);
    
    }
     abstract double taxe(); // abstraction
    
    
    
    
}
