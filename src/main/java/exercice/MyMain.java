/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercice;

/**
 *
 * @author khali
 */
public class MyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=4; int y=18;
        double ppcm=x*y /(pgcd(x,y));
        System.out.println("le ppcm de "+x+" et "+y+" est: "+ppcm);
    }
    /*
    a=20; b=7;
    a=a-b=20-7=13
    a=a-b=13-7=6
    b=b-a=7-6=1
    6-1=5
    ...
    2-1=1
    1-1=0
    pgcd => 1
    
    */
   static int pgcd(int a,int b)
    {
        
    while(a!=b)
    {
        if(a>b)
            a=a-b;
        else
            b=b-a;
    
    
    }
    return a;
    }
}
