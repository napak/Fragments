package com.android.curso.fragments.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.curso.fragments.R;
import com.android.curso.fragments.dao.Animal;

public class FragmentDetail extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    public void mostrarDetalle(Animal item) {
        ImageView imgDetalle = (ImageView) getView().findViewById(R.id.imgAnimal);
        TextView txtNombre =  (TextView)getView().findViewById(R.id.nombre);
        TextView txtDescripcion =  (TextView)getView().findViewById(R.id.descripcion);

        imgDetalle.setImageResource(item.getDrawableImageID());
        txtNombre.setText(item.getNombre());
        txtDescripcion.setText(item.getDescripcion());
    }
}
