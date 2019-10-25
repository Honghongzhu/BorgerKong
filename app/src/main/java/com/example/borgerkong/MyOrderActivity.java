package com.example.borgerkong;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyOrderActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private TextView totalPrice;
    private double totalCost;
    private ArrayList<Item> ordered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        recyclerView = findViewById(R.id.rv_order);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        
        ordered = ItemDatabase.getOrderedItems();
        ItemOrderedAdapter itemOrderedAdapter = new ItemOrderedAdapter();
        itemOrderedAdapter.setData(ordered);
        recyclerView.setAdapter(itemOrderedAdapter);

        totalCost = 0.00;
        for (Item item: ordered ) {
            totalCost += item.getCost()* (double)item.getAmountOrdered();
        }
        totalPrice = findViewById(R.id.priceTextView);
        totalPrice.setText(String.format(Locale.getDefault(),"$ %.2f", totalCost));
        
    }
}
