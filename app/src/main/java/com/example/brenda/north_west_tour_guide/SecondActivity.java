package com.example.brenda.north_west_tour_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        Contact contact = (Contact) intent.getSerializableExtra("name");
        textView.setText(contact.getName());
    }

    }

