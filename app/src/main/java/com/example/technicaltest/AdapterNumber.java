package com.example.technicaltest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterNumber extends RecyclerView.Adapter<AdapterNumber.ViewHolderNumber> {

    ArrayList <String> listNumber;

    public AdapterNumber(ArrayList<String>listNumber) {
        this.listNumber = listNumber;
    }

    @NonNull
    @Override
    public ViewHolderNumber onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderNumber(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderNumber holder, int position) {
    holder.assignNumber(listNumber.get(position));
    }

    @Override
    public int getItemCount() {
        return listNumber.size();
    }

    public class ViewHolderNumber extends RecyclerView.ViewHolder {

        TextView number;
        public ViewHolderNumber(@NonNull View itemView) {
            super(itemView);
            number=itemView.findViewById(R.id.idNumber);
        }

        public void assignNumber(String numberr) {
            number.setText(numberr);
        }
    }
}
