/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 * 
 * 
 *
 * @author mateus
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Olá mundo","Boas vindas",JOptionPane.WARNING_MESSAGE);
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número"));
//        JOptionPane.showMessageDialog(null,"Você digitou o valor "+n);
        int n = 0;
        int valores=0, pares=0, impares=0, acima=0, media=0, soma=0;
        
        do{ 
        n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um número [valor 0 interrompe]"));
        if(n!=0){
        valores++;
        soma+=n;
        if(n>100){
            acima++;
        }
        if(n%2==0){
            pares++;
        }
        else{
            impares++;
        }
        }
        
        }while(n!=0);
        media = soma/valores;
        
        JOptionPane.showMessageDialog(null,"<html>Resultado final<hr>"+
                "Total de valores: "+valores+"<br>Total de pares: "+pares+
                "<br>Total de ímpares: "+impares+"<br>Acima de 100: "+acima+
                "<br>Soma dos valores: "+soma+"<br>Média dos valores: "+media+"</html>");
    }
    
}
