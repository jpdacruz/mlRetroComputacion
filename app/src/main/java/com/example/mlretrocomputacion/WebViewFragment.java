package com.example.mlretrocomputacion;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mlretrocomputacion.databinding.FragmentDetailsBinding;
import com.example.mlretrocomputacion.databinding.FragmentWebViewBinding;
import com.example.mlretrocomputacion.ui.detail.DetailFragmentArgs;

public class WebViewFragment extends Fragment {

    private static final String TAG = "WebViewFragment";
    String urlMl;
    FragmentWebViewBinding binding;

    public WebViewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            urlMl = WebViewFragmentArgs.fromBundle(getArguments()).getUrl();
        }else {
            urlMl =" https://mercadolibre.com.ar";
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentWebViewBinding.inflate(inflater, container, false);
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

        binding.webViewMl.loadUrl(urlMl);
    }
}