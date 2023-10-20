package com.example.factura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText producto,valorxunidad,cantidad;
    private Button calcular;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        producto = findViewById(R.id.producto);
        valorxunidad = findViewById(R.id.valorxunidad);
        cantidad = findViewById(R.id.cantidad);
        calcular = findViewById(R.id.calcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Producto prod = new Producto(producto.getText().toString(),Integer.valueOf(cantidad.getText().toString()),
                        Double.valueOf(valorxunidad.getText().toString()));
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("producto",prod);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}