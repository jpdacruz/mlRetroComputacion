package com.example.mlretrocomputacion.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.Model.Item;

import java.util.List;

import static com.example.mlretrocomputacion.R.color.reputation_green;
import static com.example.mlretrocomputacion.R.color.reputation_light_green;
import static com.example.mlretrocomputacion.R.color.reputation_no;
import static com.example.mlretrocomputacion.R.color.reputation_orange;
import static com.example.mlretrocomputacion.R.color.reputation_red;
import static com.example.mlretrocomputacion.R.color.reputation_yellow;

public class HomeAdapter
        extends RecyclerView.Adapter<HomeAdapter.ViewHolder>
        implements View.OnClickListener {

    private List<Item> items;
    private View.OnClickListener listener;
    private Context context;

    public HomeAdapter(List<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_home, parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Item item = items.get(position);
        holder.tvItemTitle.setText(item.getItemTitle());
        holder.tvItemPrice.setText(String.format("$ %s", item.getItemPrice()));
        holder.tvLevelReputation.setText(String.format("Reputacion %s", item.getLevel_reputation()));

        String color = item.getColor_reputacion();
        if (color ==null){
            color = "grey";
        }
        switch (color){
            case "grey":
                holder.tvLevelReputation.setTextColor(ContextCompat.getColor(context,reputation_no));
                break;
            case "green":
                holder.tvLevelReputation.setTextColor(ContextCompat.getColor(context,reputation_green));
                break;
            case "light":
                holder.tvLevelReputation.setTextColor(ContextCompat.getColor(context, reputation_light_green));
                break;
            case "yellow":
                holder.tvLevelReputation.setTextColor(ContextCompat.getColor(context, reputation_yellow));
                break;
            case "orange":
                holder.tvLevelReputation.setTextColor(ContextCompat.getColor(context,reputation_orange));
                break;
            case "red":
                holder.tvLevelReputation.setTextColor(ContextCompat.getColor(context,reputation_red));
                break;
        }

        Glide.with(context).load(item.getThumbnail()).into(holder.ivTumbnail);
    }

    @Override
    public int getItemCount() {
        if (items != null) {
            return items.size();
        } else {
            return 0;
        }
    }

    @Override
    public void onClick(View view) {
        if(listener != null){
            listener.onClick(view);
        }
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    //method to refresh the recycler view
    public void setData(List<Item> itemsList) {
        this.items = itemsList;
        notifyDataSetChanged();
    }

    //todo: revisar cambiar getItemTitle
    public String getItem(int position){
        return items.get(position).getItemTitle();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvItemTitle, tvItemPrice, tvLevelReputation;
        private ImageView ivTumbnail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItemTitle = itemView.findViewById(R.id.tvItemTitleHome);
            tvItemPrice = itemView.findViewById(R.id.tvItemPriceHome);
            tvLevelReputation = itemView.findViewById(R.id.tvLevelReputation);
            ivTumbnail = itemView.findViewById(R.id.ivItemTumbHome);
        }
    }
}
