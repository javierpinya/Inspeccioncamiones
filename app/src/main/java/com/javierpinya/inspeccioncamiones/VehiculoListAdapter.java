package com.javierpinya.inspeccioncamiones;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VehiculoListAdapter extends RecyclerView.Adapter<VehiculoListAdapter.VehiculoViewHolder> {

    public class VehiculoViewHolder extends RecyclerView.ViewHolder{

        private final TextView matriculaItemView;

        public VehiculoViewHolder(@NonNull View itemView) {
            super(itemView);
            matriculaItemView = itemView.findViewById(R.id.tvVehiculo);
        }
    }

    private final LayoutInflater inflater;
    private List<PrimerComponente> tractoras;

    public VehiculoListAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public VehiculoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = inflater.inflate(R.layout.recyclerview_item, parent, false);
        return new VehiculoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VehiculoViewHolder holder, int position) {
        if (tractoras != null){
            PrimerComponente tractora = tractoras.get(position);
            holder.matriculaItemView.setText(tractora.getMatricula());
        }else{
            holder.matriculaItemView.setText("Sin matrícula");
        }

    }

    public void setTractoras(List<PrimerComponente> tractoras){
        this.tractoras = tractoras;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {

        if(tractoras != null){
            return tractoras.size();
        }else{
            return 0;
        }


    }


}
