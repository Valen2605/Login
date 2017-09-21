package com.example.valentina.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.text.TextUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  boton = (Button) findViewById(R.id.btnaceptar);
        boton.setOnClickListener(new View.OnClickListener(){

            @Override

            public  void onClick(View view){

              String usuario = ((EditText)findViewById(R.id.txtusuario)).getText().toString();
                String contrasena = ((EditText)findViewById(R.id.txtcontra)).getText().toString();

                if (TextUtils.isEmpty(usuario) || TextUtils.isEmpty(contrasena)) {
                    Toast.makeText(getApplicationContext(), "Debes de completar todos los campos", Toast.LENGTH_SHORT).show();
                }

                else if(usuario.equals("valentina") && contrasena.equals("valen"))
                {

                    Intent nuevapantalla = new Intent(MainActivity.this,SegundaPantalla.class);
                    startActivity(nuevapantalla);

                }
                else
                {

                    Toast.makeText(getApplicationContext(), "Usuario y/o Contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }

            }


        });
    }
}
