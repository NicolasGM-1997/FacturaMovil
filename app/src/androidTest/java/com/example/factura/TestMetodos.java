package com.example.factura;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestMetodos {
    @Test public void testMetodo1() {
        Metodos metodos = new Metodos();
        double res = metodos.valorProducto(71.2,6);
        double expected = 427.2;
        double tolerance = 0.0001;
        assertEquals(expected, res, tolerance);
    }
    @Test public void testMetodo2() {
        Metodos metodos = new Metodos();
        double res = metodos.precioIVA(120.5,15);
        double expected = 1807.5;
        double tolerance = 0.00001;
        assertEquals(expected, res, tolerance);
    }
}
