package com.example.borgerkong;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView nameTextView;
    private TextView priceTextView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        Intent intent = getIntent();
        int itemID = intent.getIntExtra("ItemID", 0);
        Item item = ItemDatabase.getItemById(itemID);

        imageView = findViewById(R.id.detailPhoto);
        nameTextView = findViewById(R.id.detailName);
        priceTextView = findViewById(R.id.detailPrice);
        descriptionTextView = findViewById(R.id.detailDescription);

        imageView.setImageResource(item.getImageDrawableId());
        nameTextView.setText(item.getName());
        priceTextView.setText(String.format("$ %.2f", item.getCost()));
        descriptionTextView.setText(item.getDescription());


    }
}
