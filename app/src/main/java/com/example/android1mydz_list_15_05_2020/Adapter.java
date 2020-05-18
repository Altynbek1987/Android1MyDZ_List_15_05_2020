package com.example.android1mydz_list_15_05_2020;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Students> list;
    onClick onClick;

    public Adapter() {
        list = new ArrayList<>();
    }

    public void update(ArrayList<Students> students) {
        list = students;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.activity_view_holder, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.listener = onClick;
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
        holder.listener = onClick;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

