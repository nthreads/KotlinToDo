package com.nthreads.todo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.nthreads.todo.adapter.TaskAdapter
import com.nthreads.todo.model.Task

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val tasksList = ArrayList<Task>();

        val task1 = Task(1, "Task 1", "Description of task", Date());
        val task2 = task1.copy(2, "Task 2");
        val task3 = task1.copy(id = 3, title = "Task 3", description = "This is 3rd task");

        tasksList.add(task1)
        tasksList.add(task2)
        tasksList.add(task3)

        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = TaskAdapter(tasksList) {
            toast("${it.title} Clicked")
        };

        fab.setOnClickListener { view ->
            TODO("Add New Task")
        }

        if(tasksList.size > 0) tvNotTask.visibility = View.GONE;
        else tvNotTask.visibility = View.VISIBLE

    }

    private fun toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_LONG).show()

    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }*/
}
