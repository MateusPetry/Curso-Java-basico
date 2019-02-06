/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author mateus
 */
public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento:");
        int nasc = teclado.nextInt();
        int idade = 2019-nasc;
        System.out.println("Sua idade é "+idade+" anos.");
        if(idade>=18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
    
}
