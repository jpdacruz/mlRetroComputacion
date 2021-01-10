package com.example.mlretrocomputacion.ui.detail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.mlretrocomputacion.data.mvp.DetailsInterface;
import com.example.mlretrocomputacion.data.mvp.DetailsPresenter;
import com.example.mlretrocomputacion.databinding.FragmentDetailsBinding;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import static com.example.mlretrocomputacion.R.color.reputation_green;
import static com.example.mlretrocomputacion.R.color.reputation_light_green;
import static com.example.mlretrocomputacion.R.color.reputation_orange;
import static com.example.mlretrocomputacion.R.color.reputation_red;
import static com.example.mlretrocomputacion.R.color.reputation_yellow;

public class DetailsFragment extends Fragment implements DetailsInterface.view {

    //vars
    private static final String TAG = "DetailsFragment";
    private String idItem, colorReputation, levelReputation;
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
            colorReputation = DetailsFragmentArgs.fromBundle(getArguments()).getColorReputation();
            levelReputation = DetailsFragmentArgs.fromBundle(getArguments()).getLevelReputation();
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
        presenter.getUserDetails(idUser);
        presenter.getItemQuestions(idItem);
    }

    @Override
    public void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> mPictures) {
        binding.tvDetailsCondition.setText(String.format("Estado: %s", condition));
        binding.tvDetailsTitle.setText(title);
        binding.tvDetailsPrice.setText(String.format("$ %s", price));
        binding.tvDetailsCiudad.setText(String.format("Ciudad: %s", city));
        binding.tvDetailsState.setText(String.format("Provincia: %s", state));
        pictures = mPictures;
        adapter.setData(pictures);
    }

    @Override
    public void showUserResult(String usuario, String registerSince, Integer transactions) {
        binding.tvDetailsUsuario.setText(String.format("Nick usuario: %s", usuario));
        binding.tvDetailsYearRegister.setText(String.format("Usuario desde el año: %s", registerSince));
        binding.tvDetailsSales.setText(MessageFormat.format("Ventas totales: {0}", transactions));
        binding.tvDetailsReputacion.setText(String.format("Reputacion: %s", levelReputation));
        String color = colorReputation;
        switch (color){
            case "green":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(),reputation_green));
                break;
            case "light_green":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(), reputation_light_green));
                break;
            case "yellow":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(), reputation_yellow));
                break;
            case "orange":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(),reputation_orange));
                break;
            case "red":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(),reputation_red));
                break;
        }
    }

    @Override
    public void showQuestionResult(int totalQuestions) {

       binding.tvDetailsNumberQuestions.setText(MessageFormat.format("Preguntas realizadas: {0}", totalQuestions));
    }
}