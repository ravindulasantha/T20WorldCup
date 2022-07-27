package com.cricketapp.t20worldcup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class ranking_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        Toolbar toolbar = findViewById(R.id.toolbarDisc);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.disc);

        textView.setText("" +
                "1 ENGLAND\n" +
                "2 INDIA\n" +
                "3 PAKISTAN\n" +
                "4 NEW ZEALAND\n" +
                "5 SOUTH AFRICA\n" +
                "6 BANGLADESH\n" +
                "7 AUSTRALIA\n" +
                "8 AFGHANISTAN\n" +
                "9 WEST INDIES\n" +
                "10 SRI LANKA\n" +
                "11 ZIMBABWE\n" +
                "12 IRELAND\n" +
                "13 NEPAL\n" +
                "14 SCOTLAND\n" +
                "15 PAPUA NEW GUINEA\n" +
                "16 UAE\n" +
                "17 NETHERLANDS\n" +
                "18 OMAN\n" +
                "19 NAMIBIA\n" +
                "20 SINGAPORE");


    }
}