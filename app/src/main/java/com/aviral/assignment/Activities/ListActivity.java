package com.aviral.assignment.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.aviral.assignment.Adapter.ListRecyclerAdapter;
import com.aviral.assignment.databinding.ActivityListBinding;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ActivityListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();

        setUpRecyclerView();
    }

    private void setUpRecyclerView() {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("John");
        stringArrayList.add("Alice");
        stringArrayList.add("Michael");
        stringArrayList.add("Emily");
        stringArrayList.add("Daniel");
        stringArrayList.add("Sophia");
        stringArrayList.add("William");
        stringArrayList.add("Olivia");
        stringArrayList.add("David");
        stringArrayList.add("Emma");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false
        );

        binding.stringRecyclerView.setLayoutManager(linearLayoutManager);

        ListRecyclerAdapter listRecyclerAdapter = new ListRecyclerAdapter(stringArrayList);

        binding.stringRecyclerView.setAdapter(listRecyclerAdapter);

    }
}