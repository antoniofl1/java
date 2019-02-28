/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer;

import java.util.Scanner;

/**
 *
 * @author tonleo
 */
public class ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
        char mayus[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            mayus[j] = (char) i;
        }   
        
        String cad = "";
        int elec = -1;
        
        do
        {
            System.out.println("Ingrese un numero entre 0 y"+(mayus.length -1));
            elec = Integer.valueOf(sc.next());
            
            if (!(elec >= 0 && elec <= mayus.length -1))
            {
                System.out.println("numero invalido, ingrese otro numero");
            }
            else
            {
                if (elec != -1)
                {
                    cad += mayus[elec];
                }
            }
        } while (elec != -1);
        System.out.println(cad);
    }
    
}
