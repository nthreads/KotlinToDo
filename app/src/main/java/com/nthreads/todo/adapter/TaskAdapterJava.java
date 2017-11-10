package com.nthreads.todo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nthreads.todo.R;
import com.nthreads.todo.model.TaskJava;

import java.util.List;

/**
 * Created by Nauman Zubair on 10/11/2017.
 * Copyright (c) 2017 nThreads Apps. All rights reserved.
 */

public class TaskAdapterJava extends RecyclerView.Adapter<TaskAdapterJava.TaskItemViewHolder>{

    private List<TaskJava> tasks;

    @Override
    public TaskItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_task, parent, false);
        return new TaskItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TaskItemViewHolder holder, int position) {
        TaskJava task = tasks.get(position);
        holder.tvTitle.setText(task.getTitle());
        holder.tvDescription.setText(task.getDescription());
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    class TaskItemViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle;
        private TextView tvDescription;

        public TaskItemViewHolder(View itemView) {
            super(itemView);
            this.tvTitle = itemView.findViewById(R.id.tvTitle);
            this.tvDescription = itemView.findViewById(R.id.tvDescription);
        }
    }
}
