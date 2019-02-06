/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author mateus
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //transformar int em string
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        //transformar string em int
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        
        //transformar string em float
        String valor3 = "40";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(idade3);
    }
    
}
