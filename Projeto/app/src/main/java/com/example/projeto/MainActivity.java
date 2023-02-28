package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nome, telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        nome = findViewById(R.id.nome);
        telefone = findViewById(R.id.telefone);
        nome.setText("");
        telefone.setText("");
    }

    public void proximo(View view) {
        String n = nome.getText().toString();
        String t = telefone.getText().toString();
        if (!n.equals("") && !t.equals("")) {
            Cliente c = new Cliente(n, t);
            Intent i = new Intent(this, TelaPesquisa.class);
            startActivity(i);
            TelaPesquisa.cliente = c;
        }
        else {
            String mensagem = "<h1><big>Por favor, preencha os campos corretamente</big></h1>";
            Toast toast = Toast.makeText(this, HtmlCompat.fromHtml(mensagem,HtmlCompat.FROM_HTML_MODE_COMPACT), Toast.LENGTH_LONG);
            toast.getView().setBackgroundColor(Color.GREEN);
            toast.show();
        }
    }

}