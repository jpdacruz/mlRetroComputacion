package com.example.mlretrocomputacion.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private List<Item> mItems;
    private HomeViewModel homeViewModel;

    private static final String TAG = "HomeFragment";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mItems = new ArrayList<>();
        homeViewModel.getListRetroCategory().observe(getViewLifecycleOwner(), items -> {
            mItems = items;

            for (int i=0; i< mItems.size(); i++){
                System.out.println("nombre: " + mItems.get(i).getItemTitle());
                System.out.println("precio: " + mItems.get(i).getItemPrice());
            }
        });
    }
}