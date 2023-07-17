package com.aviral.assignment.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aviral.assignment.R;

import java.util.ArrayList;

public class ListRecyclerAdapter extends RecyclerView.Adapter<ListRecyclerAdapter.ViewHolder> {

    private final ArrayList<String> stringArrayList;

    public ListRecyclerAdapter(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.text.setText(stringArrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
        }
    }

}
