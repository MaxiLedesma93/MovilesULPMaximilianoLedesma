package com.example.tp1moviles;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainActivityViewModel extends AndroidViewModel {


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public void enviarPalabra(String palabra){

        Intent intent = new Intent(getApplication(), SegundaActivity.class);
        intent.putExtra("key", palabra);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplication().startActivity(intent);


    }


}
