/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShellSortListas;

import java.util.Random;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Random ran = new Random();
        
        Lista listita = new Lista();
        
        for (int i = 0; i < 1000000; i++) {
            listita.insertar(ran.nextInt(215));
        }
        System.out.println("Lista Normal");
        listita.imprimir();
        System.out.println();
        
        System.out.println("Lista con Shell");
        listita.shell();
        listita.imprimir();
        
    }
}
