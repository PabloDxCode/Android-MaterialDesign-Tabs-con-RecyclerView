package com.devmc.pablo.recyclerviewwithtabs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Pablo on 02/03/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] myData;

    public RecyclerAdapter(String[] Data){
        this.myData = Data;
    }

    //Crea los elementos del RecyclerView
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    //Actualiza los datos
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(myData[position]);
    }

    //Retorna el tamaño del array
    @Override
    public int getItemCount() {
        return myData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;

        public ViewHolder(View itemView){
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.title);
        }

    }

}
