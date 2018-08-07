package com.example.blake.tessera;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.sql.Driver;
import java.util.List;

public class BusDiverAdapter extends RecyclerView.Adapter<BusDiverAdapter.BusDriverViewHolder> {

    private Context mCtx;
    private List<BusDriverList> driverList;

    public BusDiverAdapter(Context mCtx, List<BusDriverList> driverList) {
        this.mCtx = mCtx;
        this.driverList = driverList;
    }

    @NonNull
    @Override
    public BusDriverViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        BusDriverViewHolder holder = new BusDriverViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BusDriverViewHolder holder, int position) {
        BusDriverList driver = driverList.get(position);
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(driver.getImage()));
        holder.textViewBusDiverId.setText(driver.getBusDriverId());
        holder.textViewBusNumber.setText(driver.getBusNumber());


    }

    @Override
    public int getItemCount() {
        return driverList.size();
    }

    class BusDriverViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewBusDiverId;
        TextView textViewBusNumber;

        public BusDriverViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewBusDiverId = itemView.findViewById(R.id.textViewBusDiverId);
            textViewBusNumber = itemView.findViewById(R.id.textViewBusNumber);
        }
    }
}
