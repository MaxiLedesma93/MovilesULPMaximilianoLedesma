package com.example.tp1moviles;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import entidades.Palabra;

public class SegundaActivityViewModel extends AndroidViewModel {
    private ArrayList<Palabra> palabras = new ArrayList<>();
    private MutableLiveData<Integer> mutableImg;
    private MutableLiveData<String> mutablePalTraducida;

    public SegundaActivityViewModel(@NonNull Application application) {
        super(application);
        palabras.add(new Palabra("mesa", "table", R.drawable.imgmesa ));
        palabras.add(new Palabra("sol", "sun", R.drawable.imgsol));
        palabras.add(new Palabra("bote", "boat", R.drawable.imgbote));
        palabras.add(new Palabra("pescado", "fish", R.drawable.imgpescado));
        palabras.add(new Palabra("casa", "house", R.drawable.imgcasa));



    }
    public LiveData<Integer> getMutableImg(){
        if(mutableImg == null){
            mutableImg = new MutableLiveData<>();
        }
        return mutableImg;
    }
    public LiveData<String> getMutablePalTraducida(){
        if(mutablePalTraducida == null){
            mutablePalTraducida = new MutableLiveData<>();
        }
        return mutablePalTraducida;
    }
    public void traducir(Intent intent){
        String palabra = intent.getStringExtra("key");
        palabras.forEach(pal ->{
            if(pal.getPalabraEsp().equalsIgnoreCase(palabra)){
                mutablePalTraducida.setValue(pal.getPalabraIng());
                mutableImg.setValue(pal.getImagen());

            }

        });
        if (palabra==null||palabra.isEmpty()||mutablePalTraducida.getValue()==null){
            mutablePalTraducida.setValue("Palabra no encontrada!!");
            mutableImg.setValue(R.drawable.imgnoencontrada);
        }

    }
}



