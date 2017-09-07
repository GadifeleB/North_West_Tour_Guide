package com.example.brenda.north_west_tour_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.brenda.north_west_tour_guide.R.id.textView;

public class Third_Activity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_);

        text = (TextView)findViewById(R.id.third_text);

        Intent intent = getIntent();
        Contact contact = (Contact) intent.getSerializableExtra("name");
        text.setText(contact.getName());
    }
}
