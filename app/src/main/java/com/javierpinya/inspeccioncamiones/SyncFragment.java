package com.javierpinya.inspeccioncamiones;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class SyncFragment extends Fragment {

   // private SharedPreferences prefs;
   // private Button btnSinc;
    private View view;

    public SyncFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_sync, container, false);

        /*
        btnSinc = view.findViewById(R.id.btnSinc);

        btnSinc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //borrar bbdd y leer los archivos
                //async task
                Toast.makeText(getActivity(), "Sincronizando datos", Toast.LENGTH_SHORT).show();
            }
        });
        */

        // Inflate the layout for this fragment
        return view;
    }


/*
    private void saveOnPreferences(String user, String password, String rutafoto,
                                   String nombre, String puesto, String correo, String movil){

        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("user", user);
        editor.putString("pass", password);
        editor.putString("rutaFoto", rutafoto);
        editor.putString("nombre", nombre);
        editor.putString("puesto", puesto);
        editor.putString("correo", correo);
        editor.putString("movil", movil);
        editor.commit();
        editor.apply();
    }

 */

}
