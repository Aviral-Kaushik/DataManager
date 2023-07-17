package com.aviral.assignment.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aviral.assignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnShowList.setOnClickListener(view -> startActivity(new Intent(this, ListActivity.class)));

        binding.btnStorageManager.setOnClickListener(view -> startActivity(new Intent(this, SharedManagerActivity.class)));

    }
}