package com.example.mlretrocomputacion.ui.question;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.mvp.question.clases.Question;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.ViewHolder> {

    private List<Question> questions;
    private Context context;

    public QuestionAdapter(List<Question> mQuestions, Context context) {
        this.questions = mQuestions;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_question, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Question question = questions.get(position);
        holder.tvQuestion.setText(question.getQuestion());
        holder.tvAnswerd.setText(question.getAnswerd());
        String status = question.getStatus();
        if (status.equals("ANSWERED")){
            holder.tvQuestion.setTextColor(Color.BLUE);
        }else{
            holder.tvQuestion.setTextColor(Color.RED);
        }
    }

    @Override
    public int getItemCount() {
        if (questions != null) {
            return questions.size();
        } else {
            return 0;
        }
    }

    //method to refresh the recycler view
    public void setData(List<Question> questionsList) {
        this.questions = questionsList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvQuestion, tvAnswerd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvQuestion = itemView.findViewById(R.id.tvItemQuestion);
            tvAnswerd = itemView.findViewById(R.id.tvItemAnswer);
        }
    }
}
