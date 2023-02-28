package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaPesquisa extends AppCompatActivity {
    static Cliente cliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_pesquisa);
        getSupportActionBar().hide();
    }
}