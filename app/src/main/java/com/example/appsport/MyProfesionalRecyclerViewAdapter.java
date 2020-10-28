package com.example.appsport;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.appsport.modelo.Profesional;
import com.example.appsport.vista.OnProfesionalInteractionListener;

import java.util.List;


public class MyProfesionalRecyclerViewAdapter extends RecyclerView.Adapter<MyProfesionalRecyclerViewAdapter.ViewHolder> {

    private final List<Profesional> mValues;
    private final OnProfesionalInteractionListener mListener;

    public MyProfesionalRecyclerViewAdapter(List<Profesional> items, OnProfesionalInteractionListener listener) {
        mValues = items;
        mListener=listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.profesional_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textNombreProfesional.setText(holder.mItem.getNombreProfesional());
        holder.textViewEmailProfesional.setText(holder.mItem.getEmailProfesional());
        holder.textViewTelefonoProfesional.setText(holder.mItem.getTelefonoProfesional());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onProfesionalClick(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView textNombreProfesional;
        public final TextView textViewEmailProfesional;
        public final TextView textViewTelefonoProfesional;
        public final ImageView imagen;
        public Profesional mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textNombreProfesional = (TextView) view.findViewById(R.id.textNombreProfesional);
            textViewEmailProfesional = (TextView) view.findViewById(R.id.textEmailProfesional);
            textViewTelefonoProfesional=(TextView)view.findViewById(R.id.textTelefonoProfesional);
            imagen=(ImageView)view.findViewById(R.id.imageProfe);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + textNombreProfesional.getText() + "'";
        }
    }
}