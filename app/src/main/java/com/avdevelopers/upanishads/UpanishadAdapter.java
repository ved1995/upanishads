package com.avdevelopers.upanishads;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class UpanishadAdapter extends RecyclerView.Adapter<UpanishadAdapter.MyViewHolder> {
    private Context context;
    private List<String> upanishads;

    public class MyViewHolder extends RecyclerView.ViewHolder{
         public TextView txtUpanishad;
         public CardView upanishadCardView;
         public MyViewHolder(View view){
            super(view);
            txtUpanishad =(TextView) view.findViewById(R.id.txtUpanishads);
            upanishadCardView=(CardView) view.findViewById(R.id.cardUpanishads);
        }
    }
    public UpanishadAdapter(Context context,List<String> upanishads){
        this.context=context;
        this.upanishads=upanishads;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=LayoutInflater.from(parent.getContext()).inflate(R.layout.upanishad_row_view,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String upanishad=upanishads.get(position);
        holder.txtUpanishad.setText(upanishad);
        holder.upanishadCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return upanishads.size();
    }
}
