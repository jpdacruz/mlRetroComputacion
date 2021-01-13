package com.example.mlretrocomputacion.ui.classic;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.databinding.FragmentClassicBinding;
import com.example.mlretrocomputacion.databinding.FragmentHomeBinding;
import com.example.mlretrocomputacion.ui.detail.DetailsFragmentArgs;
import com.example.mlretrocomputacion.ui.home.HomeAdapter;
import com.example.mlretrocomputacion.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;

public class ClassicFragment extends Fragment {

    private static final String TAG = "ClassicFragment";
    FragmentClassicBinding binding;
    private HomeViewModel homeViewModel;
    private List<Item> mItems;
    private String mConsola;
    private HomeAdapter adapter;

    public ClassicFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mConsola = ClassicFragmentArgs.fromBundle(getArguments()).getConsola();
            Toast.makeText(getContext(), mConsola, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentClassicBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setAdapter();
    }

    private void setAdapter() {
        mItems = new ArrayList<>();
        binding.recyclerClassic.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new HomeAdapter(mItems, getContext());
        binding.recyclerClassic.setAdapter(adapter);
    }
}