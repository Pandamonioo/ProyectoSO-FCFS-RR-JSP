/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Logica;
import java.util.ArrayList;

public class Cola {
    
        protected Nodo Cabecera;
    protected Nodo Final;
    
    ArrayList<String> ClientesArr;
    
    public Cola() {
        Cabecera = null;
    }
    
        public void insert(int llegada, int rafaga, int nom, int fil, int rRestante, int tBloqueo, int filab, int cola, int comienzo) {
        Nodo tmp = new Nodo(llegada, rafaga, nom, fil, rRestante, tBloqueo,filab,cola,comienzo);
        int l = longitud();
        if (l > 0) {
        Nodo aux1 = Cabecera;
        while (aux1.next!=null){
            aux1=aux1.next;
        }//System.out.println("Va despues de:");
          //  System.out.println(aux1.nombre);
            aux1.setNext(tmp);
    }
        else {
            Cabecera = tmp;
        }
    }
        
        public Nodo extraerCabeza(){
        return this.Cabecera;
    }
    public ArrayList imprimir() {
        String clientes = "";
        ClientesArr = new ArrayList();
        if (!isEmpty()) {
            Nodo tmp = Cabecera;
            while (tmp != null) {
                clientes = clientes + "CLIENTE: " + tmp.nombre + " - N° RECIBOS: " + tmp.getInfo() + "." + "\n";
                ClientesArr.add("CLIENTE: " + tmp.nombre + " - N° RECIBOS: " + tmp.getInfo() + ".");
                tmp = tmp.getNext();
            }
        }
        
        return ClientesArr;
    }

    public void extraer(int x) {
        while (x > 0) {
            int l = longitud();
          //  System.out.println("Borraremos a "+Cabecera.nombre);
           // System.out.println("Será cabeca "+Cabecera.next.nombre);
            if (l > 1) {
                Cabecera=Cabecera.next;
            }else{
                Cabecera=null;
              //  System.out.println("Queda vacia la cola");
            }
            x--;
        }

    }

    public int longitud() {
        int cont = 0;
        Nodo tmp = Cabecera;
        while (tmp != null) {
            cont = cont + 1;
            tmp = tmp.getNext();
        }
        if (cont==0){
        //    System.out.println("COLA VACIA");
        }
        return cont;
    }

    public ArrayList<Nodo> nodosCola() {
        ArrayList<Nodo> rafagas = new ArrayList<Nodo>();
        if (!isEmpty()) {
            Nodo tmp = Cabecera;
            while (tmp != null) {
                rafagas.add(tmp);
                tmp = tmp.getNext();         
            }
        }
        return rafagas;
    }

    public boolean isEmpty() {
        if (Cabecera == null) {
            return true;
        } else {
            return false;
        }
    }

    
    



}
