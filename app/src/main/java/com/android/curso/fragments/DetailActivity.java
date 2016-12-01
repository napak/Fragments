package com.android.curso.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.curso.fragments.dao.Animal;
import com.android.curso.fragments.fragment.FragmentDetail;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        FragmentDetail detalle =
                (FragmentDetail) getSupportFragmentManager()
                        .findFragmentById(R.id.FrgDetalle);

        detalle.mostrarDetalle((Animal) getIntent().getSerializableExtra(Animal.KEY));
    }
}
