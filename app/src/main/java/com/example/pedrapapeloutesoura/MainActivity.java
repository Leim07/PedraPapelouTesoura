package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }
    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imgResult = findViewById(R.id.imgResult);
        TextView textResul = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcoesApp = opcoes[numero];

        switch (opcoesApp){
            case "Pedra" :
                imgResult.setImageResource(R.drawable.pedra);
                break;
            case "Papel" :
                imgResult.setImageResource(R.drawable.papel);
                break;
            case "Tesoura" :
                imgResult.setImageResource(R.drawable.tesoura);
                break;
        }

        if((    opcaoSelecionada.equals("Pedra") && opcoesApp.equals("Tesoura") ||
                opcaoSelecionada.equals("Papel") && opcoesApp.equals("Pedra") ||
                opcaoSelecionada.equals("Tesoura") && opcoesApp.equals("Papel"))){
                textResul.setText("Você ganhou");
        } else if ((opcaoSelecionada.equals("Pedra") && opcoesApp.equals("Pedra") ||
                    opcaoSelecionada.equals("Papel") && opcoesApp.equals("Papel") ||
                    opcaoSelecionada.equals("Tesoura") && opcoesApp.equals("Tesoura"))) {
                textResul.setText("Empate!");
        } else {
                textResul.setText("Você perdeu :(");
        }

        System.out.println("Item clicado " + opcoesApp);

    }

}