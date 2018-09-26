package com.example.audiolibros;

import android.annotation.SuppressLint;
import android.app.Application;

import java.util.Vector;

public class Aplicacion extends Application {
    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adaptador;

    @SuppressLint("MissingSuperCall")
    @Override
    public void onCreate(){
        // mod
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibros (this, vectorLibros);
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }

    public AdaptadorLibros getAdaptador() {
        return adaptador;
    }
}
