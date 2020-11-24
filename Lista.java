/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShellSortListas;

/**
 *
 * @author DELL
 */
public class Lista {

    Nodo inicio = null;
    Nodo fin = null;

    public void insertar(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.ant = null;
        nuevo.sig = null;
        nuevo.dato = dato;
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            inicio = nuevo;
        }
    }

    boolean isEmpty() {
        return inicio == null && fin == null;
    }

    public void imprimir() {
        Nodo reco = inicio;
        int con = 0;
        while (reco != null) {
            System.out.print(reco.dato + " ");
            reco = reco.sig;
            con++;
            if (con == 100) {
                System.out.println();
                con = 0;
            }
        }
        System.out.println();
    }

    public void shell() {
        int salto = largo() / 2;
        while(salto>0){
            salto = salto /2;
            boolean cambio = true;
            while (cambio) {
                cambio = false;
                for (int i = salto; i < largo(); i++) {
                    Nodo temp = salto(i - salto);  //Obtenemos el nodo en esa posicion
                    Nodo temp2 = salto(i);
                    if ((temp.dato) > (temp2.dato)) {
                        int a = temp2.dato;
                        temp2.dato = temp.dato;
                        temp.dato = a;
                        cambio = true;
                    }
                }
            }
        }
    }

    int largo() {
        Nodo aux = inicio;
        int cont = 0;
        while (aux != null) {
            cont++;
            aux = aux.sig;
        }
        return cont;
    }

    Nodo salto(int salto) {
        if (inicio != null) {
            Nodo aux = inicio;
            while (salto != 0) {
                aux = aux.sig;
                salto--;
            }
            return aux;
        }
        return null;
    }
}
