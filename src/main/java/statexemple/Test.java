/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statexemple;

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
        final int x=9; // constante
   
        Eleve e1=new Eleve("eleve1", "user", "first");
        System.out.println("id= "+Eleve.identifiant);
        Eleve e2=new Eleve("eleve2", "user2", "second");
        System.out.println("id= "+Eleve.identifiant);
        Eleve eleve3=new Eleve("eleves", "users", "third");
        System.out.println("id= "+Eleve.identifiant);
        
        ListEleves.addEleve(e1);
        ListEleves.addEleve(e2);
        ListEleves.addEleve(eleve3);
        for(Eleve e: ListEleves.liste)
        {
            System.out.println(e.toString());
        }
        
    }
    
}
