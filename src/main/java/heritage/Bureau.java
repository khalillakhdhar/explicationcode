/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

import heritage.Meubles;

/**
 *
 * @author khali
 */
public class Bureau extends Meubles{

    @Override
     double taxe() {
        return this.getPrix()*0.2;
    }
    @Override
    protected void deplacer(String source,String destination)
    {
        System.out.println("décomposition en cours");
        System.out.println("deplacement de "+source+" vers "+destination);

    
    }
}
