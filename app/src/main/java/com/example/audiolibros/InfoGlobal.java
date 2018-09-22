package com.example.audiolibros;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Vector;

class InfoGlobal {
    private static final InfoGlobal ourInstance = new InfoGlobal();

    private Context contexto;
    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adaptador;

    static InfoGlobal getInstance() {
        return ourInstance;
    }

    private InfoGlobal() {
    }

    public void inicializa(Context contexto){
        this.contexto = contexto;
        SharedPreferences prerf = contexto.getSharedPreferences("pref", Context.MODE_PRIVATE);
    }

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }

    public AdaptadorLibros getAdaptador() {
        return adaptador;
    }
}
