package com.android.curso.fragments.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.curso.fragments.R;
import com.android.curso.fragments.adapter.ListAdapter;
import com.android.curso.fragments.dao.Animal;
import com.android.curso.fragments.listener.FragmentListener;

public class FragmentList extends Fragment {
    private ListView lstListado;
    private FragmentListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);

        lstListado = (ListView)getView().findViewById(R.id.listview);
        ListAdapter adapter = new ListAdapter(getActivity(), Animal.getList());
        lstListado.setAdapter(adapter);
        lstListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> list, View view, int pos, long id) {
                if (listener!=null) {
                    listener.onAnimalSeleccionado(
                            (Animal) lstListado.getAdapter().getItem(pos));
                }
            }
        });
    }

    public void setFragmentListener(FragmentListener listener) {
        this.listener=listener;
    }
}
