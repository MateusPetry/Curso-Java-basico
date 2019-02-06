/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author mateus
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static void soma(int a, int b){
        int soma=a+b;
        System.out.println("Soma: "+soma);
       }
    
      static int sub(int a, int b){
        int subt=a-b;
        return subt;
       }
    public static void main(String[] args) {
       soma(5,2);
       int sb = sub(5,2);
        System.out.println("Subtração: "+sb);
    }
    
}
