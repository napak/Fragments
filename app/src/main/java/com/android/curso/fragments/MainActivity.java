package com.android.curso.fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.curso.fragments.dao.Animal;
import com.android.curso.fragments.fragment.FragmentDetail;
import com.android.curso.fragments.fragment.FragmentList;
import com.android.curso.fragments.listener.FragmentListener;

public class MainActivity extends AppCompatActivity implements FragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentList frgListado
                =(FragmentList) getSupportFragmentManager()
                .findFragmentById(R.id.FrgListado);

        frgListado.setFragmentListener(this);
    }

    @Override
    public void onAnimalSeleccionado(Animal item) {
        boolean hayDetalle =
                (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);

        if(hayDetalle) {
            ((FragmentDetail)getSupportFragmentManager()
                    .findFragmentById(R.id.FrgDetalle)).mostrarDetalle(item);
        }
        else {
            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra(Animal.KEY, item);
            startActivity(i);
        }
    }
}
