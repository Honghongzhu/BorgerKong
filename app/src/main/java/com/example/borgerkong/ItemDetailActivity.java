package com.example.borgerkong;

import android.app.AppComponentFactory;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView nameTextView;
    private TextView priceTextView;
    private Button minButton;
    private TextView amountTextView;
    private Button plusButton;
    private Button addButton;
    private TextView descriptionTextView;
    private int amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();
        int itemID = intent.getIntExtra("ItemID", 0);
        final Item item = ItemDatabase.getItemById(itemID);

        imageView = findViewById(R.id.detailPhoto);
        nameTextView = findViewById(R.id.detailName);
        priceTextView = findViewById(R.id.detailPrice);
        minButton = findViewById(R.id.minButton);
        amountTextView = findViewById(R.id.amountTextView);
        plusButton = findViewById(R.id.plusButton);
        addButton = findViewById(R.id.addButton);
        descriptionTextView = findViewById(R.id.detailDescription);

        imageView.setImageResource(item.getImageDrawableId());
        nameTextView.setText(item.getName());
        priceTextView.setText(String.format("$ %.2f", item.getCost()));
        descriptionTextView.setText(item.getDescription());

        amount = 1;
        item.setAmountOrdered(1);
        amountTextView.setText(String.valueOf(amount));

        minButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(amount == 0)
                    amountTextView.setText(String.valueOf(amount));
                else {
                    amount--;
                    item.setAmountOrdered(amount);
                    amountTextView.setText(String.valueOf(amount));
                }
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount++;
                item.setAmountOrdered(amount);
                amountTextView.setText(String.valueOf(amount));
            }
        });

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //the item is added
                item.setOrdered(true);
            }
        });
    }
}
