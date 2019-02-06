/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horatelaidioma;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;

/**
 *
 * @author mateus
 */
public class HoraTelaIdioma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date relogio= new Date();
        System.out.println("A hora do sistema é:"+relogio.toString());
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Largura: "+lar+ " Altura: "+alt);
        
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
    }
    
}
