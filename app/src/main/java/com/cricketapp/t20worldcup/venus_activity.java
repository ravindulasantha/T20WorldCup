package com.cricketapp.t20worldcup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class venus_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venus);

        Toolbar toolbar = findViewById(R.id.toolbarDisc);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView textView = findViewById(R.id.disc);

        textView.setText("Till now, the T20 World Cup 2021 Venue of all the matches to be held in the T20 World Cup were to be held in India. But in view of the continuing spread of Covid 19 and the threat of its third wave, all matches will now be held in the UAE. We are going to give you all the information about the venues of the matches. The T20 World Cup Venue 2021 has 4 stadiums in the UAE, which include Dubai International Stadium, Sheikh Zayed Stadium in Abu Dhabi, Sharjah Stadium and Oman Cricket Academy Ground.\n" +
                "\n" +
                "Dubai International Stadium\n" +
                "The Dubai International Cricket Stadium, also formerly known as Dubai Sports City Cricket Stadium, is one of the three cricket stadiums which is situated in Dubai, United Arab Emirates. Having a capacity of 25,000, this stadium can be called as an adopted home ground for Pakistan. This stadium has a round roof unlike others. This arena witnessed its first ODI game in April 2009 between Pakistan and Australia. Many more matches have been played here including a memorable England's collapse to spin which resulted in a 10-wicket defeat to the hands of Pakistan. It is a well equipped stadium having a unique feature naming its floodlights as “Ring of Fire”.\n" +
                "\n" +
                "Sheikh Zayed Stadium in Abu Dhabi\n" +
                "Sheikh Zayed Stadium is a multi-use stadium in Abu Dhabi. The stadium has been built at a cost of $2.5 million. It can accommodate 20000 people and has well-equipped facilities. The stadium has floodlights facilities and is a newer venue in Sharjah. Indian and Pakistan played a 'Friendship Series' in April, 2006. The series was expected to raise $10 million for the earthquake relief out if which 75 per cent will go to Pakistan and the rest to India. The stadium was opened in May 2004 and staged its first first-class match when Scotland played Kenya in the Intercontinental Cup that November. The venue is located in a remote area and is about 30 minutes drive from the city centre. There is no pavilion as such at the stadium but has large changing rooms under one of the stands, and teams watch from inside air-conditioned glass rooms.\n" +
                "\n" +
                "Sharjah Stadium\n" +
                "Sharjah Cricket Association Stadium was established in 1984. The rapidity with which the stadium acquired popularity and subsequently- one-day matches has astounded many. In a short span of 19 years i.e. till 2003, Sharjah Cricket Association Ground had hosted as many as 198 ODIs. The limited over matches in Sharjah Cricket Association Ground were always a part of a tournament involving not less than three teams. Most of the tournaments in Sharjah Cricket Association Ground organized under The Cricketers Benefit Fund Series, which aims at providing a part of the tournament purse to the retired cricketers from India and Pakistan. Sharjah Cricket Association Ground is one of those rare grounds where a test match has been hosted without the participation of the home team. In the wake of 11 September, Pakistan became the hotbed of internal turmoil, thus its cricket team had choose Sharjah Cricket Association ground for its test series against West Indies and later Australia. Sharjah Cricket Association Ground has a seating capacity of 27,000. Of late, hardly and any cricket of consequence has been played in this ground; the newly opened Sheikh Zayed Stadium in Abu Dhabi has appropriated the popularity that Sharjah Cricket Association Ground used to enjoy. It holds a world record of being the first stadium to have hosted 200 ODIs after the match between Pakistan and Sri Lanka in November 2011.\n" +
                "\n" +
                "Oman Cricket Academy Ground\n" +
                "Al Amerat Cricket Stadium, also known as the Oman Cricket Academy Ground, is a cricket ground in Muscat, Oman. The ground is owned by the Oman Cricket Board. In January 2021, the International Cricket Council (ICC) gave accreditation for the Ministry Turf 1 at the stadium to host Test cricket.");

    }
}