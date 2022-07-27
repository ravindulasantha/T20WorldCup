package com.cricketapp.t20worldcup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class live_activity extends AppCompatActivity {

    LinearLayout fbGroup, teleGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);

        fbGroup = findViewById(R.id.fb_group);
        fbGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotUrl("https://play.google.com/store/apps/details?id=com.t20worldcup.cricketnmg");
            }
        });
    }
    private void gotUrl(String s)
    {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
