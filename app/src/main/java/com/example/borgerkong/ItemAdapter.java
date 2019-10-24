package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<Item> itemsToAdapt;

    public void setData(ArrayList<Item> itemsToAdapt) {
        this.itemsToAdapt = itemsToAdapt;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(v);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        final Item itemAtPosition = itemsToAdapt.get(position);

        holder.itemImageView.setImageResource(itemAtPosition.getImageDrawableId());
        holder.nameTextView.setText(itemAtPosition.getName());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context, ItemDetailActivity.class);
                intent.putExtra("ItemID", itemAtPosition.getItemID());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemsToAdapt.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView itemImageView;
        public TextView nameTextView;

        public ItemViewHolder(@NonNull View v) {
            super(v);
            view = v;
            itemImageView = v.findViewById(R.id.itemPhoto);
            nameTextView = v.findViewById(R.id.itemName);
        }
    }
}
