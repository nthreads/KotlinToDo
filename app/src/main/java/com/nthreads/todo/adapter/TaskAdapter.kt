package com.nthreads.todo.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nthreads.todo.R
import com.nthreads.todo.model.Task
import kotlinx.android.synthetic.main.item_task.view.*

/**
 * Created by Nauman Zubair on 10/11/2017.
 * Copyright (c) 2017 nThreads Apps. All rights reserved.
 */
class TaskAdapter(val taskList: List<Task>, val listener: (Task) -> Unit) :
        RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) =
            holder.bind(taskList.get(position), listener);

    override fun getItemCount() = taskList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskViewHolder(rootView)
    }

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(task: Task, listener: (Task) -> Unit) = with(itemView) {
            tvTitle.text = task.title;
            tvDescription.text = task.description;
            setOnClickListener { listener(task) }
        }
    }

    /*override fun onBindViewHolder(holder: TaskViewHolder?, position: Int) {
        TODO("not implemented")
    }

    override fun getItemCount(): Int {
        TODO("not implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TaskViewHolder {
        TODO("not implemented")
    }

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)*/
}