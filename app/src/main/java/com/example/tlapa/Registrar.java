package com.example.tlapa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registrar extends AppCompatActivity {

    Button registro;
    EditText nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        registro = findViewById(R.id.Registrar_btn);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom = findViewById(R.id.nombre_input);
                String nom2 = nom.getText().toString();
                Intent intent = new Intent(Registrar.this, Home.class);
                startActivity(intent);
                Toast.makeText(Registrar.this, "Bienvenido " + nom2, Toast.LENGTH_SHORT).show();
            }
        });
    }
}