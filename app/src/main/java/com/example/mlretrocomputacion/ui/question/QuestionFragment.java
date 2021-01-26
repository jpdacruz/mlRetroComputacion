package com.example.mlretrocomputacion.ui.question;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mlretrocomputacion.data.mvp.question.clases.Question;
import com.example.mlretrocomputacion.data.mvp.question.QuestionInterface;
import com.example.mlretrocomputacion.data.mvp.question.QuestionPresenter;
import com.example.mlretrocomputacion.databinding.FragmentQuestionBinding;

import java.util.ArrayList;
import java.util.List;

public class QuestionFragment extends Fragment implements QuestionInterface.view{

    private static final String TAG = "QuestionFragment";
    private QuestionAdapter adapter;
    private List<Question> questions;
    private String idItem;
    private QuestionInterface.presenter presenter;
    FragmentQuestionBinding binding;

    public QuestionFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idItem = QuestionFragmentArgs.fromBundle(getArguments()).getIdItem();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentQuestionBinding.inflate(inflater, container, false);
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
        presenter = new QuestionPresenter(this);
        questions = new ArrayList<>();

        presenter.getItemQuestions(idItem);
        setAdapter();
    }

    @Override
    public void showQuestionResult(List<Question> mQuestions) {
        questions = mQuestions;
        adapter.setData(questions);
    }

    private void setAdapter() {
        questions = new ArrayList<>();
        binding.recyclerQuestion.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new QuestionAdapter(questions, getContext());
        binding.recyclerQuestion.setAdapter(adapter);
    }
}