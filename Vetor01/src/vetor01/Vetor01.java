/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author mateus
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n [] = new int[4];
        n[0] = 312;
        n[1] = 1;
        n[2] = 3;
        n[3] = 2;
        
        
        for(int c=0;c<n.length;c++){
            System.out.println(n[c]);
        }
        //////////////////////////////////
        System.out.println("//////////////////////////");
        //////////////////////////////////
        int n2 [] = {231,12332,132,123};
        for (int i = 0; i < n2.length; i++) {
            System.out.println("Na posição "+i+" temos o valor "+n2[i]);
        }
               
    }
    
}
