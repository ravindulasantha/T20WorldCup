package com.cricketapp.t20worldcup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class community_activity extends AppCompatActivity {

    LinearLayout fbGroup, teleGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        fbGroup = findViewById(R.id.fb_group);
        fbGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotUrl("https://www.facebook.com/groups/3141731212819046/");
            }
        });

        teleGroup = findViewById(R.id.telegram_group);
        teleGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotUrl("https://t.me/joinchat/JORBIMDIo_41OTc1");
            }
        });

    }
    private void gotUrl(String s)
    {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}