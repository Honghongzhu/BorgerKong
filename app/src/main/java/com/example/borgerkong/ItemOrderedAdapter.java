package com.example.borgerkong;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemOrderedAdapter extends RecyclerView.Adapter<ItemOrderedAdapter.ItemOrderedViewHolder> {
    private ArrayList<Item> itemsToAdapt;

    public void setData(ArrayList<Item> itemsToAdapts){
        this.itemsToAdapt = itemsToAdapts;
    }

    @NonNull
    @Override
    public ItemOrderedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ordered, parent, false);
        ItemOrderedViewHolder itemOrderedvh = new ItemOrderedViewHolder(view);
        return itemOrderedvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemOrderedViewHolder holder, int position) {
        final Item itemAtPosition = itemsToAdapt.get(position);
        holder.itemImageView.setImageResource(itemAtPosition.getImageDrawableId());
        holder.nameTextView.setText(itemAtPosition.getName());
        holder.amountTextView.setText(String.format(Locale.getDefault(),"%dx",itemAtPosition.getAmountOrdered()));
    }

    @Override
    public int getItemCount() {
        return itemsToAdapt.size();
    }


    public class ItemOrderedViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView itemImageView;
        public TextView nameTextView;
        public TextView amountTextView;

        public ItemOrderedViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            itemImageView = itemView.findViewById(R.id.itemOrderedPhoto);
            nameTextView = itemView.findViewById(R.id.itemOrderedName);
            amountTextView = itemView.findViewById(R.id.itemOrderedAmount);
        }
    }
}
