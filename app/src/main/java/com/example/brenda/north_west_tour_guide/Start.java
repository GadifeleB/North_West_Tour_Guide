package com.example.brenda.north_west_tour_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Start extends AppCompatActivity {

    ContactRecyclerView adapter;
    Contact mContact = new Contact();
    Contact mContactect = new Contact();
    Contact meContact = new Contact();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);



        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<Contact> mContactArratlist = new ArrayList<>();

        //adding info to arraylist

        mContact.setName("Accomodations in North West");
        mContact.setSurname("Where to stay ");
        mContact.setImage(R.drawable.belle);



        mContactect.setName("Events");
        mContactect.setSurname("Join us for our up coming Events,,,Where to go");
        mContactect.setImage(R.drawable.horses);




        meContact.setName("Resturants");
        meContact.setSurname("Where to eat in North West");
        meContact.setImage(R.drawable.mikes);

        mContactArratlist.add(mContact);
        mContactArratlist.add(mContactect);
        mContactArratlist.add(meContact);

        adapter = new ContactRecyclerView(this,mContactArratlist);
        recyclerView.setAdapter(adapter);
    }
    }

