/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package statexemple;

/**
 *
 * @author khali
 */
public final class Eleve {
  public static int identifiant=0;
  private String nom,prenom,groupe;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public Eleve(String nom, String prenom, String groupe) {
        identifiant++;
        this.nom = nom;
        this.prenom = prenom;
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "Eleve{" + "nom=" + nom + ", prenom=" + prenom + ", groupe=" + groupe + '}';
    }
  
  
    
}
