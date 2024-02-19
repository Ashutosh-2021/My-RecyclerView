package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton actionButton;
    ArrayList<ContactModel> arrContact = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         recyclerView = findViewById(R.id.recyclerview);
         actionButton = findViewById(R.id.add);

//        set the  recyclerview  show in  which form
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrContact.add(new ContactModel(R.drawable.man, "Ronit", "123456987"));
        arrContact.add(new ContactModel(R.drawable.programmer, "Ashe", "123456987"));
        arrContact.add(new ContactModel(R.drawable.woman, "Pooja", "123456987"));
        arrContact.add(new ContactModel(R.drawable.working, "AS", "123456987"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContact);
        recyclerView.setAdapter(adapter);



    }
}