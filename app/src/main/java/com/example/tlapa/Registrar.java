package com.example.tlapa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registrar extends AppCompatActivity {

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
    }

    EditText mensajetext;

    public void RegistrarUsuario(View registro){
        Intent miIntent = new Intent(this, Registrar.class);
    }
    public void Home(View Home){
        mensajetext = findViewById(R.id.nombre_input);
        String mensajeS = mensajetext.getText().toString();
        Toast.makeText(Registrar.this,"Bienvenido" + mensajeS, Toast.LENGTH_SHORT).show();
        Intent miIntent = new Intent(this, Home.class);
    }
}