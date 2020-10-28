package com.example.appsport;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.appsport.modelo.Profesional;
import com.example.appsport.vista.OnProfesionalInteractionListener;

import java.util.ArrayList;
import java.util.List;


public class ProfesionalFragment extends Fragment {
    OnProfesionalInteractionListener mListener;
    private static final String ARG_COLUMN_COUNT = "column-count";
    List<Profesional>profesionalesList;
    public ProfesionalFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ProfesionalFragment newInstance(int columnCount) {
        ProfesionalFragment fragment = new ProfesionalFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profesionales, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            profesionalesList=new ArrayList<>();
            profesionalesList.add(new Profesional(1,"Marimar","marimargargallo@gmail.com","666555444","admin"));
            profesionalesList.add(new Profesional(2,"Yolanda","yolandamagallon@gmail.com","666777888","admin"));
            profesionalesList.add(new Profesional(3,"Bea","beaVillanueva@gmail.com","654321234","admin"));
            profesionalesList.add(new Profesional(4,"Ruben","rubengarcia@gmail.com","690987654","admin"));
            recyclerView.setAdapter(new MyProfesionalRecyclerViewAdapter(profesionalesList,mListener));
        }
        return view;
    }
}