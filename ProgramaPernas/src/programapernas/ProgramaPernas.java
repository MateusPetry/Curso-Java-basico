/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas pernas você tem?");
        int pernas = teclado.nextInt();
        System.out.print("Você é um ");
        switch (pernas) {
            case 1:
                System.out.print("Saci");
                break;
            case 2:
                System.out.print("Bípede");
                break;
            case 3:
                System.out.print("Africano");
                break;
            case 4:
                System.out.print("Quadrúpede");
                break;
            case 6:
                System.out.print("Aranho");
                break;
            case 8:
                System.out.print("Aranho também");
                break;
            default:
                System.out.println("Baiano");
        }
    }
    
}
