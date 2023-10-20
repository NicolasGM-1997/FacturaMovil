package com.example.factura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    private TextView descripcion,valor_sin_iva,iva,total;
    private Metodos metodos = new Metodos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        descripcion = findViewById(R.id.descripcion);
        valor_sin_iva = findViewById(R.id.valor_sin_iva);
        iva = findViewById(R.id.iva);
        total = findViewById(R.id.total);
        Bundle objeto_enviado = getIntent().getExtras();
        Producto prod = null;
        if(objeto_enviado!=null){
            DecimalFormat formato = new DecimalFormat("#,##0.00");
            prod = (Producto) objeto_enviado.getSerializable("producto");
            descripcion.setText(prod.toString());
            double precioProducto = metodos.valorProducto(prod.getValor(),prod.getCantidad());
            double ivaTotal = metodos.precioIVA(precioProducto,19)/100;
            double totalFactura = precioProducto+ivaTotal;
            valor_sin_iva.setText(""+formato.format(precioProducto));
            iva.setText(""+formato.format(ivaTotal));
            total.setText(""+formato.format(totalFactura));
        }
    }
}