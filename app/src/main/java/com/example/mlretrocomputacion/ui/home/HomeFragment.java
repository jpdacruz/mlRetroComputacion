package com.example.mlretrocomputacion.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    //vars
    private static final String TAG = "HomeFragment";
    private List<Item> mItems;
    private HomeViewModel homeViewModel;
    //widgets
    FragmentHomeBinding binding;
    private HomeAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        binding = FragmentHomeBinding.inflate(inflater, container, false);
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

        mItems = new ArrayList<>();
        binding.recyclerHome.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new HomeAdapter(mItems, getContext());
        binding.recyclerHome.setAdapter(adapter);

        adapter.setOnClickListener(view1 -> goToDetails(view1));

        homeViewModel.getListRetroCategory().observe(getViewLifecycleOwner(), items -> {
            mItems = items;
            adapter.setData(mItems);
        });
    }

    private void goToDetails(View view) {
        Item item = mItems.get(binding.recyclerHome.getChildAdapterPosition(view));
        Integer idUser = item.getIdUser();
        String idItem = item.getIdItem();
        Log.i(TAG, "goToDetailsFav: " + idItem + " " + idUser);

        NavController navController = Navigation.findNavController(view);
        NavDirections action = HomeFragmentDirections.actionNavigationHomeToDetailsFragment(idUser,idItem);
        navController.navigate(action);
    }
}