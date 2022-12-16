/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

/**
 *
 * @author khali
 */
public class Chaise extends Meubles{
    private String type;
    private boolean roue;
    

    @Override
     double taxe() {
return this.getPrix()*0.15;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRoue() {
        return roue;
    }

    public void setRoue(boolean roue) {
        this.roue = roue;
    }

    public Chaise() {
    }

    public Chaise(String type, boolean roue, String matiere, String dimension, String couleur, double prix) {
        super(matiere, dimension, couleur, prix);
        this.type = type;
        this.roue = roue;
    }
    
    
    
    
    
}
