/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Logica;

/**
 *
 * @author ASUS
 */
public class Nodo {
    
    public int rafaga;
    public int llegada;
    public int comienzo;
    public int fin;
    public int retorno;
    public int espera;
    public int fila;
    public int rafagaRestante;
    public int filaBloqueado = 0;
    public int tiempoBloqueo = 0;
    public int nombre;
    public int conteo = 0;
    public int tiempoMejora = 0;
    public int tipoCola;
    
    public Nodo next;

    public Nodo(int rafaga, int llegada, int comienzo, int fin, int retorno, int espera, int fila, int rafagaRestante, int nombre, Nodo next) {
        this.rafaga = rafaga;
        this.llegada = llegada;
        this.comienzo = comienzo;
        this.fin = fin;
        this.retorno = retorno;
        this.espera = espera;
        this.fila = fila;
        this.rafagaRestante = rafagaRestante;
        this.nombre = nombre;
        this.next = next;
    }

    public Nodo() {
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }

    public int getTipoCola() {
        return tipoCola;
    }

    public void setTipoCola(int tipoCola) {
        this.tipoCola = tipoCola;
    }

        public Nodo(int llegada, int raf, int nom, int fil, int rRestante, int tBloqueo,int filaBloqueado, int cola,int comienzo) {
        rafaga = raf;
        next = null;
        nombre = nom;
        fila = fil;
        rafagaRestante = rRestante;
        tiempoBloqueo = tBloqueo;
        this.llegada= llegada;
        this.filaBloqueado = filaBloqueado;
        this.tipoCola = cola;
        this.comienzo = comienzo;
        
    }
    
    public Object getInfo() {
        return rafaga;
    }
        
    public int getRafaga() {
        return rafaga;
    }

    public void setRafaga(int rafaga) {
        this.rafaga = rafaga;
    }

    public int getLlegada() {
        return llegada;
    }

    public void setLlegada(int llegada) {
        this.llegada = llegada;
    }

    public int getComienzo() {
        return comienzo;
    }

    public void setComienzo(int comienzo) {
        this.comienzo = comienzo;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getRetorno() {
        return retorno;
    }

    public void setRetorno(int retorno) {
        this.retorno = retorno;
    }

    public int getEspera() {
        return espera;
    }

    public void setEspera(int espera) {
        this.espera = espera;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getRafagaRestante() {
        return rafagaRestante;
    }

    public void setRafagaRestante(int rafagaRestante) {
        this.rafagaRestante = rafagaRestante;
    }

    public int getFilaBloqueado() {
        return filaBloqueado;
    }

    public void setFilaBloqueado(int filaBloqueado) {
        this.filaBloqueado = filaBloqueado;
    }

    public int getTiempoBloqueo() {
        return tiempoBloqueo;
    }

    public void setTiempoBloqueo(int tiempoBloqueo) {
        this.tiempoBloqueo = tiempoBloqueo;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
