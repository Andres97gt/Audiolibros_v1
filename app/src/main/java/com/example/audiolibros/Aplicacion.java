package com.example.audiolibros;

import android.app.Application;

import java.util.Vector;

public class Aplicacion extends Application {
    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adaptador;

    @Override
    public void onCreate(){
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
