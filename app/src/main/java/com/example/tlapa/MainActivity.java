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

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    Button Registro;
    EditText Usuario;
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    btnlogin = findViewById(R.id.login_btn);

    btnlogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Usuario = findViewById(R.id.user_input);
            String UsuarioS = Usuario.getText().toString();
            Password = findViewById(R.id.password_input);
            String PasswordS = Password.getText().toString();
            if(UsuarioS == "Admin" && PasswordS == "aaaa"){
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Bienvenido", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
            }
        }
    });

    Registro = findViewById(R.id.Registrar_btn);
    Registro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Registrar.class);
            startActivity(intent);
        }
    });
    }
}