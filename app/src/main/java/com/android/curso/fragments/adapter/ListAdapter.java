package com.android.curso.fragments.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.curso.fragments.dao.Animal;
import com.android.curso.fragments.R;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Animal> {
    private final Activity context;
    private final List<Animal> items;

    public ListAdapter(Activity context,List<Animal> items) {
        super(context, R.layout.item_listview,items);
        this.context = context;
        this.items = items;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.item_listview, null);

        Animal item = items.get(position);

        ImageView imagen = (ImageView) view.findViewById(R.id.imgAnimal);
        imagen.setImageResource(item.getDrawableImageID());

        TextView nombre = (TextView) view.findViewById(R.id.tvContent);
        nombre.setText(item.getNombre().toUpperCase());

        return view;
    }

    public void addItems(Animal a) {
        items.add(a);
        notifyDataSetChanged();
    }
}

