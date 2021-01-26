package com.example.mlretrocomputacion.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.remote.clases.Item;
import com.example.mlretrocomputacion.data.utils.LoadImage;

import java.util.List;

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

        String url = item.getThumbnail();
        new LoadImage(holder.ivTumbnail).execute(url);
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

    public String getItem(int position){
        return items.get(position).getItemTitle();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvItemTitle, tvItemPrice;
        private ImageView ivTumbnail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItemTitle = itemView.findViewById(R.id.tvItemTitleHome);
            tvItemPrice = itemView.findViewById(R.id.tvItemPriceHome);
            ivTumbnail = itemView.findViewById(R.id.ivItemTumbHome);
        }
    }
}
