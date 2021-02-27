/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Logica;
import com.Logica.Cola;
import com.Logica.Nodo;
import java.util.ArrayList;


public class SJF {
 
    Cola temporal = new Cola();
    
    public Cola organizarCola(Cola colaSJF) {
        
    ArrayList<Nodo> colaOrg = colaSJF.nodosCola();
    for (int i = 1; i < colaOrg.size(); i++) {
        for (int j = 0; j < colaOrg.size() - 1; j++) {
            if (colaOrg.get(j).rafaga > colaOrg.get(j + 1).rafaga) {
                Nodo temp = colaOrg.get(j);
                colaOrg.set(j, colaOrg.get(j+1));
                colaOrg.set(j+1, temp);
            }
        }
    }
    this.temporal= new Cola();
    for (int k = 0; k < colaOrg.size(); k++) {
        this.temporal.insert(colaOrg.get(k).llegada, colaOrg.get(k).rafaga, 
                colaOrg.get(k).nombre, colaOrg.get(k).fila, colaOrg.get(k).rafagaRestante, 
                colaOrg.get(k).tiempoBloqueo,colaOrg.get(k).filaBloqueado,colaOrg.get(k).tipoCola,colaOrg.get(k).comienzo);
    }
        
        return temporal;
    }
    
}
