package com.example.mlretrocomputacion.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.databinding.FragmentHomeBinding;
import com.example.mlretrocomputacion.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import okhttp3.internal.Util;
import www.sanju.motiontoast.MotionToast;

public class HomeFragment extends Fragment{

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

        setAdapter();
        setListener();
        getListRetroGames();
    }

    private void setAdapter() {
        mItems = new ArrayList<>();
        binding.recyclerHome.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new HomeAdapter(mItems, getContext());
        binding.recyclerHome.setAdapter(adapter);
    }

    private void setListener() {

        adapter.setOnClickListener(view -> goToDetails(view));
        binding.ivAtari.setOnClickListener(v -> goToClassicList(v, "atari"));
        binding.ivps1.setOnClickListener(v -> goToClassicList(v, "ps1"));
        binding.ivSega.setOnClickListener(v -> goToClassicList(v, "genesis"));
        binding.ivSnes.setOnClickListener(v -> goToClassicList(v, "snes"));
        binding.ivn64.setOnClickListener(v -> goToClassicList(v, "nintendo64"));
        binding.buttonSearch.setOnClickListener(v -> {
            String consola = binding.editTextSearch.getText().toString();
            if (Utils.validarName(consola)){
                goToClassicList(v, consola);
            }else{
                MotionToast.Companion.darkToast(getActivity(),"Ingrese lo que está buscando",
                        MotionToast.TOAST_WARNING,
                        MotionToast.GRAVITY_BOTTOM,
                        MotionToast.LONG_DURATION,
                        ResourcesCompat.getFont(getActivity(),
                                R.font.helvetica_regular));
            }
        });
    }

    private void goToClassicList(View v, String consola) {
        NavController navController = Navigation.findNavController(v);
        NavDirections action = HomeFragmentDirections.actionNavigationHomeToClassicFragment(consola);
        navController.navigate(action);
    }

    private void getListRetroGames() {
        homeViewModel.getListRetroCategory("all").observe(getViewLifecycleOwner(), items -> {
            mItems = items;
            adapter.setData(mItems);
        });
    }

    private void goToDetails(View view) {
        Item item = mItems.get(binding.recyclerHome.getChildAdapterPosition(view));
        Integer idUser = item.getIdUser();
        String idItem = item.getIdItem();
        String colorReputation = item.getColor_reputacion();
        String levelReputation = item.getLevel_reputation();

        Log.i(TAG, "goToDetailsFav: " + idItem + " " + idUser + " " + colorReputation + " " + levelReputation);

        NavController navController = Navigation.findNavController(view);
        NavDirections action = HomeFragmentDirections.actionNavigationHomeToDetailsFragment(idUser,idItem, colorReputation, levelReputation);
        navController.navigate(action);
    }
}