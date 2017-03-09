package com.example.normahuerta.popular_movies;

import android.os.StrictMode;
import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.CURSOANDROID.models.Carro;
import com.adapters.CarAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Carro> carros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carros.add(new Carro(R.drawable.carros1,"Titulo1",
                "Descripcion1"));
        carros.add(new Carro (R.drawable.carros2,"Titulo2",
                "Descripcion2"));
        carros.add(new Carro (R.drawable.carros3,"Titulo3",
                "Descripcion3"));
        carros.add(new Carro (R.drawable.carros4,"Titulo4",
                "Descripcion4"));
        carros.add (new Carro (R.drawable.carros5,"Titulo5",
                "Descripcion5"));

        CarAdapter adapter = new CarAdapter(this, carros);
        RecyclerView lista = (RecyclerView) findViewById(R.id.listaDatos);
        lista.setLayoutManager(new GridLayoutManager(this,2));
        lista.setHasFixesdSize(true);
        lista.setAdapter(adapter);
    }

}
