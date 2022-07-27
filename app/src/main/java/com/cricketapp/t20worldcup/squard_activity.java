package com.cricketapp.t20worldcup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ExpandableListView;



public class squard_activity extends AppCompatActivity {



    ExpandableListView expandableTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squard);



        expandableTextView = findViewById(R.id.Exp);
        squardAdapter adapter = new squardAdapter(squard_activity.this);
        expandableTextView.setAdapter(adapter);

    }

}