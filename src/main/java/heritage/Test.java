/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heritage;

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
        //Meubles m=new Meubles(); => impossible 
        Chaise ch=new Chaise("gaming", true, "bois", "120*120", "noir", 900);
        System.out.println(ch.getCouleur());
        System.out.println(ch.taxe());
        ch.deplacer("gabés", "Sousse");
        Bureau br=new Bureau();
        br.setDimension("190*100");
        br.setPrix(1400);
        br.deplacer("Sfax", "Tataouine");
        System.out.println(br.taxe());
        
    }
    
}
