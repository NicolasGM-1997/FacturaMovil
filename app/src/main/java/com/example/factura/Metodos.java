package com.example.factura;

public class Metodos {
    public double valorProducto(double precio, int cantidad){
        if(cantidad>=1){
            return valorProducto(precio,cantidad-1)+precio;
        } else {
            return 0;
        }
    }
    public double precioIVA(double precio, int iva){
        if(iva>=1){
            return valorProducto(precio,iva-1)+precio;
        } else {
            return 0;
        }
    }
}
