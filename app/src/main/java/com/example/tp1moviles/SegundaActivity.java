package com.example.tp1moviles;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.tp1moviles.databinding.ActivitySegundaBinding;

public class SegundaActivity extends AppCompatActivity {

    private ActivitySegundaBinding segundaBinding;
    private SegundaActivityViewModel vmSegunda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        segundaBinding = ActivitySegundaBinding.inflate(getLayoutInflater());
        vmSegunda = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(SegundaActivityViewModel.class);
        super.onCreate(savedInstanceState);
        setContentView(segundaBinding.getRoot());

        vmSegunda.getMutablePalTraducida().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                segundaBinding.tvTraduccion.setText(s);

            }
        });
        vmSegunda.getMutableImg().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                segundaBinding.imageView.setImageResource(integer);
            }
        });
        vmSegunda.traducir(getIntent());



    }
}