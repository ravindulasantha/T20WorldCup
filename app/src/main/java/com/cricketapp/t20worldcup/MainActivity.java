package com.cricketapp.t20worldcup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.IUnityBannerListener;
import com.unity3d.services.banners.UnityBanners;

public class MainActivity extends AppCompatActivity {

    LinearLayout l1,l2,l3,l4,l5,l6, l7, community, rank, quiz, news, alert;
    //unity banner 1
    private String GameID = "4398093";
    private String bannerPlacement="Banner_Main_Activity";
    private boolean testMode = false;
    //unity banner 1

    //unity inter 1
    private String interPlacement="Inter_schedule_activity";
    //unity inter 1

    //unity reward 1
    private String rewardedPlacement = "Rewarded_Android";
    //unity reward 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //unity banner 2
        UnityAds.initialize(this, GameID, testMode);
        IUnityBannerListener bannerListener = new IUnityBannerListener() {
            @Override
            public void onUnityBannerLoaded(String s, View view) {
                ((ViewGroup)findViewById(R.id.banner_ad)).removeView(view);
                ((ViewGroup)findViewById(R.id.banner_ad)).addView(view);
            }

            @Override
            public void onUnityBannerUnloaded(String s) {

            }

            @Override
            public void onUnityBannerShow(String s) {

            }

            @Override
            public void onUnityBannerClick(String s) {

            }

            @Override
            public void onUnityBannerHide(String s) {

            }

            @Override
            public void onUnityBannerError(String s) {

            }
        };
        UnityBanners.setBannerListener(bannerListener);
        UnityBanners.loadBanner(this, bannerPlacement);
        //unity banner 2


        //unity inter 2
        IUnityAdsListener interListner = new IUnityAdsListener() {
            @Override
            public void onUnityAdsReady(String s) {

            }

            @Override
            public void onUnityAdsStart(String s) {

            }

            @Override
            public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {

            }

            @Override
            public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {

            }
        };
        UnityAds.setListener(interListner);
        UnityAds.load(interPlacement);
        //unity inter 2

        //unity reward 2
        IUnityAdsListener rewardListner = new IUnityAdsListener() {
            @Override
            public void onUnityAdsReady(String s) {

            }

            @Override
            public void onUnityAdsStart(String s) {

            }

            @Override
            public void onUnityAdsFinish(String s, UnityAds.FinishState finishState) {
                // Implement conditional logic for each ad completion status:
                if (finishState.equals(UnityAds.FinishState.COMPLETED)) {
                    // Reward the user for watching the ad to completion.
                   // Toast.makeText(MainActivity.this, "COMPLETED", Toast.LENGTH_SHORT).show();
                } else if (finishState == UnityAds.FinishState.SKIPPED) {
                    // Do not reward the user for skipping the ad.
                    //Toast.makeText(MainActivity.this, "SKIPPED", Toast.LENGTH_SHORT).show();
                } else if (finishState == UnityAds.FinishState.ERROR) {
                    // Log an error.
                    //Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String s) {

            }
        };
        UnityAds.setListener(rewardListner);
        UnityAds.load(rewardedPlacement);
        //unity reward 2


        l1 = findViewById(R.id.schedule);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //unity inter 3

                if (UnityAds.isReady(interPlacement))
                {
                    UnityAds.show(MainActivity.this,interPlacement);
                }

                //unity inter 3

                Intent i = new Intent(MainActivity.this, schedule_activity.class);
                startActivity(i);

            }
        });

        l2 = findViewById(R.id.squad);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, squard_activity.class);
                startActivity(i);


                //unity reward 3

                if (UnityAds.isReady(rewardedPlacement))
                {
                    UnityAds.show(MainActivity.this,rewardedPlacement);
                }

                //unity reward 3


            }
        });
        l3 = findViewById(R.id.History);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //unity inter 3

                if (UnityAds.isReady(interPlacement))
                {
                    UnityAds.show(MainActivity.this,interPlacement);
                }

                //unity inter 3
                Intent i = new Intent(MainActivity.this, history_activity.class);
                startActivity(i);
            }
        });
        l4 = findViewById(R.id.live);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, live_activity.class);
                startActivity(i);
            }
        });
        l5 = findViewById(R.id.highlights);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, highlights_activity.class);
                startActivity(i);
            }
        });
        l6 = findViewById(R.id.winnes);
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //unity inter 3

                if (UnityAds.isReady(interPlacement))
                {
                    UnityAds.show(MainActivity.this,interPlacement);
                }

                //unity inter 3
                Intent i = new Intent(MainActivity.this, winners.class);
                startActivity(i);
            }
        });
        l7 = findViewById(R.id.venues);
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //unity inter 3

                if (UnityAds.isReady(interPlacement))
                {
                    UnityAds.show(MainActivity.this,interPlacement);
                }

                //unity inter 3
                Intent i = new Intent(MainActivity.this, venus_activity.class);
                startActivity(i);
            }
        });
        community = findViewById(R.id.community);
        community.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, community_activity.class);
                startActivity(i);
            }
        });
        rank = findViewById(R.id.ranking);
        rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //unity inter 3

                if (UnityAds.isReady(interPlacement))
                {
                    UnityAds.show(MainActivity.this,interPlacement);
                }

                //unity inter 3

                Intent i = new Intent(MainActivity.this, ranking_activity.class);
                startActivity(i);
            }
        });

        quiz = findViewById(R.id.quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //unity inter 3

                if (UnityAds.isReady(interPlacement))
                {
                    UnityAds.show(MainActivity.this,interPlacement);
                }

                //unity inter 3

                Intent i = new Intent(MainActivity.this, cric_quiz_activity.class);
                startActivity(i);
            }
        });

        news = findViewById(R.id.News);
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotUrl("https://play.google.com/store/apps/details?id=com.t20worldcup.cricketnmg");
            }
        });

        alert = findViewById(R.id.alerts);
        alert.setOnClickListener(new View.OnClickListener() {
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