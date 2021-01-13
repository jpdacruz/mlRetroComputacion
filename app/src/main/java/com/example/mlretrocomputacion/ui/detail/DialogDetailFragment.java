package com.example.mlretrocomputacion.ui.detail;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.databinding.FragmentDetailsBinding;
import com.example.mlretrocomputacion.databinding.FragmentDialogDetailBinding;

public class DialogDetailFragment extends DialogFragment {

    private static final String TAG = "DialogDetailFragment";
    private String pictureUrl;

    public DialogDetailFragment() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return showImageDetail();
    }

    private Dialog showImageDetail() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.fragment_dialog_detail,null);

        builder.setView(v);
        builder.setPositiveButton("ok", (dialog, which) -> {});

        getImageToShow(v);

        return builder.create();
    }

    private void getImageToShow(View v) {
        pictureUrl = getArguments().getString("picture","");
        ImageView imageView = v.findViewById(R.id.imageViewDialog);
        Glide.with(getContext()).load(pictureUrl).into(imageView);
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }
}