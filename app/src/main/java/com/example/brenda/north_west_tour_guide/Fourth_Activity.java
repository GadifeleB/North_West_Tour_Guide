package com.example.brenda.north_west_tour_guide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Fourth_Activity extends AppCompatActivity {
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_);


        text1 = (TextView)findViewById(R.id.Fourt_Text_View);

        Intent intent = getIntent();
        Contact contact = (Contact) intent.getSerializableExtra("name");
        text1.setText(contact.getName());
    }
}
