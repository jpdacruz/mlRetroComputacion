package com.example.mlretrocomputacion.ui.detail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mlretrocomputacion.data.mvp.DetailsInterface;
import com.example.mlretrocomputacion.data.mvp.DetailsPresenter;
import com.example.mlretrocomputacion.databinding.FragmentDetailsBinding;

import java.util.ArrayList;
import java.util.List;

public class DetailsFragment extends Fragment implements DetailsInterface.view {

    //vars
    private static final String TAG = "DetailsFragment";
    private String idItem;
    private Integer idUser;
    private DetailsInterface.presenter presenter;
    private List<String> pictures;
    //widgets
    private FragmentDetailsBinding binding;
    private DetailAdapter adapter;

    public DetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idItem = DetailsFragmentArgs.fromBundle(getArguments()).getIdItem();
            idUser = DetailsFragmentArgs.fromBundle(getArguments()).getIdUser();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailsBinding.inflate(inflater, container, false);
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
        //call the presenter
        presenter = new DetailsPresenter(this);
        pictures = new ArrayList<>();

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewPictures.setLayoutManager(layoutManager);
        adapter = new DetailAdapter(pictures,getContext());
        binding.recyclerViewPictures.setAdapter(adapter);

        presenter.getItemDetails(idItem);
    }

    @Override
    public void showResult(String title, String condition, Double price, String city, String state, String permalink, List<String> mPictures,int codResult) {
        pictures = mPictures;
        adapter.setData(pictures);
    }
}