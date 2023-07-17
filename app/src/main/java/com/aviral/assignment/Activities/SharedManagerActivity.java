package com.aviral.assignment.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.aviral.assignment.databinding.ActivitySharedManagerBinding;
import com.google.android.material.snackbar.Snackbar;

public class SharedManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySharedManagerBinding binding = ActivitySharedManagerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnAdd.setOnClickListener(view -> {

            SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();

            myEdit.putString("text", String.valueOf(binding.editTextName.getText()));

            myEdit.apply();

            Snackbar.make(
                    binding.layoutShared,
                    "Successfully added data to shared preferences",
                    Snackbar.LENGTH_SHORT
            ).show();

        });
    }
}