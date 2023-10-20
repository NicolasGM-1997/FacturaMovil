package com.example.factura;

import java.io.Serializable;

public class Producto implements Serializable {
    private String nombre;
    private int cantidad;
    private double valor;
    public Producto(String nombre,int cantidad,double valor){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "El producto es :"+nombre+"\nCantidad :"+cantidad+"\nValor x unidad :"+valor;
    }
}
