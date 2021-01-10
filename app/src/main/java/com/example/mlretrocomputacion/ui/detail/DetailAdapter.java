package com.example.mlretrocomputacion.ui.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.ui.home.HomeAdapter;

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> implements View.OnClickListener {

    private List<String> pictures;
    private View.OnClickListener listener;
    private Context context;

    public DetailAdapter(List<String> pictures, Context context) {
        this.pictures = pictures;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_pictures, parent,false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String picture = pictures.get(position);
        Glide.with(context).load(picture).into(holder.ivPictures);
    }

    @Override
    public int getItemCount() {
        if (pictures != null) {
            return pictures.size();
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
    public void setData(List<String> mPictures) {
        this.pictures = mPictures;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivPictures;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivPictures = itemView.findViewById(R.id.ivItemPictures);
        }
    }
}
