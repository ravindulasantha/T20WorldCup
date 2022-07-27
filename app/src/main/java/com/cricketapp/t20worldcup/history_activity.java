package com.cricketapp.t20worldcup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class history_activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);



        Toolbar toolbar = findViewById(R.id.toolbarDisc);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.disc);

        textView.setText("The ICC Men's T20 World Cup (earlier known as ICC World Twenty20)[1] was first held in 2007. It was first decided that every two years an ICC T20 World Cup tournament is to take place, except in the event of an ICC Cricket World Cup being scheduled in the same year, in which case it will be held the year before. The first tournament was in 2007 in South Africa where India defeated Pakistan in the final. Two Associate teams had played in the first tournament, selected through the 2007 ICC World Cricket League Division One, a 50-over competition. In December 2007 it was decided to hold a qualifying tournament with a 20-over format to better prepare the teams. With six participants, two would qualify for the 2009 World Twenty20 and would each receive $250,000 in prize money.[2] The second tournament was won by Pakistan who beat Sri Lanka by 8 wickets in England on 21 June 2009. The 2010 ICC World Twenty20 tournament was held in West Indies in May 2010, where England defeated Australia by 7 wickets. The 2012 ICC World Twenty20 was won by the West-Indies, by defeating Sri Lanka at the finals. For the first time, a host nation competed in the final of the ICC World Twenty20. There were 12 participants for the title including Ireland and Afghanistan as 2012 ICC World Twenty20 Qualifier. It was the first time the World Twenty20 tournament took place in an Asian country. Pakistan was the only team to reach the last four in the first four editions of the tournament. 2014 saw the expansion to 16 teams featuring three teams making their debuts. Sri Lanka yet again made it to the Finals this time winning after their two other appearances in previous finals. The ICC Men's T20 World Cup has had five champions from six tournaments.\n" +
                "\n" +
                "Background\n" +
                "When the Benson & Hedges Cup ended in 2002, the ECB needed another one day competition to fill its place. Cricketing authorities were looking to boost the game's popularity with the younger generation in response to dwindling crowds and reduced sponsorship. It was intended to deliver fast-paced, exciting cricket accessible to thousands of fans who were put off by the longer versions of the game. Stuart Robertson, the marketing manager of the ECB, proposed a 20 over per innings game to county chairmen in 2001 and they voted 11–7 in favour of adopting the new format.[citation needed]\n" +
                "\n" +
                "Regional tournaments\n" +
                "The first official Twenty20 matches were played on 13 June 2003 between the English counties in the Twenty20 Cup.[3] The first season of Twenty20 in England was a relative success.[4] The first Twenty20 match held at Lord's, on 15 July 2004 between Middlesex and Surrey, attracted a crowd of 27,509, the largest attendance for any county cricket game at the ground other than a one-day final since 1953.[5]\n" +
                "\n" +
                "Soon after with the adoption of Twenty20 matches by other cricket boards, the popularity of the format grew with unexpected crowd attendance, new regional tournaments such as Pakistan's Faysal Bank T20 Cup and Stanford 20/20 tournament and the financial incentive in the format. West Indies regional teams competed in what was named the Stanford 20/20 tournament. The event was financially backed by billionaire Allen Stanford, who gave at least US$28,000,000 funding money. It was intended that the tournament would be an annual event.[6][7] A spin-off tournament, the Stanford Super Series was held in October 2008 between Middlesex and Trinidad and Tobago, the respective winners of the English and Caribbean Twenty20 competitions, and a Stanford Superstars team formed from West Indies domestic players.[8][9] On 1 November, the Stanford Superstars played England in what was expected to be the first of five fixtures in as many years with the winner claiming a US$20,000,000 in each match");


    }

}