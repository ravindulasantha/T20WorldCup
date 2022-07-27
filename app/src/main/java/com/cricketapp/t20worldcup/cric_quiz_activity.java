package com.cricketapp.t20worldcup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class cric_quiz_activity extends AppCompatActivity {

    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1, rb2, rb3, rb4;

    String questions[] = {
            "01. Which team has played in most T20 World Cup finals?",
            "02. The next ICC Men's T20 Cricket World Cup would be held in______.",
            "03. Where was the first edition of ICC Men's T20 Cricket World Cup held?",
            "04. Which of the following statements regarding ICC Men's T20 Cricket World Cup is correct?",
            "05. Which of the following country has not won a single title of ICC Men's T20 Cricket World Cup?",
            "06. India won the ICC Men's T20 Cricket World Cup under the captaincy of______.",
            "07. Which version of the ICC Men's T20 Cricket World Cup would be played in the year 2021?",
            "08. Which country has won the ICC Men's T20 Cricket World Cup title twice?",
            "09. Which country has won the very first edition of the ICC Men's T20 Cricket World Cup?",
            "10. How many teams will play in ICC Men's T20 Cricket World Cup 2021?",
            "11. Recently, Lasith Malinga has announced his retirement from all forms of cricket, represents which country?",
            "12. Who has been appointed as the new bowling coach of the Pakistan cricket team?",
            "13. The final of the 1992 Cricket World cup was held in:",
            "14. The 2021 ICC Men’s T20 World Cup is scheduled to begin on:",
            "15. Which team lost most Tests in the first cycle of the World Test Championship 2021?",
            "16. Which of these cricketer featured in each of Australia's 14 Tests during the first iteration of the World Test Championship 2021?",
            "17. Who was the only player to be dismissed for 199 during the first edition of the World Test Championship 2021?",
            "18. Who has bowled the most number of balls in the first season of the World Test Championship 2021?",
            "19. Which of these cricketers didn’t make their Test debut in a match from the World Test Championship 2021 cycle?",
            "20. In the 2015 World Cup final, who triggered New Zealand's collapse which saw them lose their last seven wickets for just 33 runs?",
            "21. In the 1996 World Cup final, only one bowler ended up picking multiple wickets. Who was it?",
            "22. Who remains the only captain to have not gotten a chance to bat in a World Cup final so far?",
            "23. The 2007 World Cup final in Barbados witnessed a farcical finish under dark skies. What confusion caused the controversy?",
            "24. Which edition holds the record for the most maidens in a World Cup final?",
            "25. Kapil Dev's memorable running catch to dismiss Sir Viv Richards in the 1983 World Cup final is known to all. Who was the bowler in that dismissal?",
            "26. Which bowler holds the unwanted record for the most expensive figures in a World Cup final?",
            "27. Chris Woakes recently spilled the beans about England's late tactical change in their third choice batsman for the Super Over in the 2019 WC final, whom did the think-tank zero in?",
            "28. Who among these pair did not bowl their full quota of overs in the 2011 World Cup final?",
            "29. Which wicket-keeper equalled Adam Gilchrist's 2003 World Cup record for most dismissals in a single edition?",
            "30. After the World Cup final and Super Over were tied, England won the match on boundary count. What would happen if the Super Over were to be tied today?(2019 WC)",
            "31. Rohit Sharma and David Warner scored more than 600 runs in the tournament. Who was the only other batsman to do so?(2019 WC)",
            "32. At which venue did Mustafizur Rahman, Jason Behrendorff, Shaheen Afridi and Mitchell Starc pick up five-wicket hauls?(2019 WC)",
            "33. Who dismissed Ravindra Jadeja in the India-New Zealand semi-final at Manchester?(2019 WC)",
            "34. Which of the following players did not score a 150-plus score in the tournament(2019 WC)",
            "35. Who was the most successful spinner in the 2019 World Cup?",
            "36. Other than Australia, which was the other team that went winless in the tournament? (Champions Trophy 2017)",
            "37. \"Pakistan cricket at its best. One minute down, next minute up.\"Nasser Hussain used the now-iconic phrase on air during the final to describe which moment? (Champions Trophy 2017)",
            "38. Which venue among the following didn't host any match during the 2017 edition of the Champions Trophy?",
            "39. Pakistan were 162/7 chasing a target of 237 against Sri Lanka in a do-or-die match. Who helped skipper Sarfaraz Ahmed take Pakistan over the line from that position and provided support in an unbeaten partnership of 75? (Champions Trophy 2017)",
            "40. Which was the losing team that succumbed to the highest successful run-chase in competition history (Champions Trophy 2017)",
            "41. Two Bangladesh batsmen scored centuries as they came back from the brink to topple New Zealand in Cardiff. One was Shakib-Al-Hasan, who was the other batsman? (Champions Trophy 2017)",
            "42. Who was the only bowler to take a 5-wicket haul in the tournament? (Champions Trophy 2017)",
            "43. Who was the only player in the tournament to have played his sixth consecutive ICC Champions Trophy in 2017?",
            "44. Hardik Pandya hit a hat-trick of sixes twice during Champions Trophy 2017. Shadab Khan was one bowler, who was the other one? (Champions Trophy 2017)",
            "45. AB de Villiers and David Miller were run-out in quick succession during the all-important clash against India. Who was their teammate involved in both of them? (Champions Trophy 2017)",
            "46. Where was Twenty20 World Cup 2016 held?",
            "47. By how many runs did New Zealand defeat India on 15/3/2016 in Twenty20 World Cup 2016?",
            "48. Which was the original venue for India vs Pakistan match in Twenty20 World Cup 2016?",
            "49. What was the result of India vs Bangladesh match in Twenty20 World Cup 2016?",
            "50. Who won Twenty20 World Cup 2016?",


    };

    String answers[] = {"Sri Lanka","Oman, UAE","South Africa","Pakistan won the ICC Men's T20 Cricket World Cup in 2009.","Australia","MS Dhoni","7th","West Indies","India",
            "16", "Sri Lanka", "Saqlain Mushtaq","Melbourne","17 October 2021","South Africa","Matthew Wade", "Faf du Plessis","Nathan Lyon","Zak Crawley","James Faulkner", "Aravinda de Silva",
            "Steve Waugh","Umpires feared that they had to return the next day and bowl the remaining overs","1983","Mohinder Amarnath.","Javagal Srinath","Jonny Bairstow","Munaf Patel-Sreesanth","Tom Latham","The Super Over would be played again",
            "Shakib Al Hasan","Lord's","Trent Boult", "Rohit Sharma","Yuzvendra Chahal","New Zealand","Virat Kohli's wicket","Sophia Gardens, Cardiff","Mohammad Amir","India","Mahmudullah","Josh Hazlewood","Shoaib Malik","Imad Wasim","Faf du Plessis",
            "India", "47", "Dharamshala", "India won by 1 run", "West Indies",};

    String opt[] = {
            "Sri Lanka", "India", "Australia", "Pakistan",
            "Australia","India","Oman, UAE","England",
            "India", "England", "South Africa", "Sri Lanka",
            "The first ICC Men's T20 Cricket World Cup was held in 2008.","Sri Lanka won the 2012 ICC Men's T20 Cricket World Cup.","Pakistan won the ICC Men's T20 Cricket World Cup in 2009","India has won the ICC Men's T20 Cricket World Cup 2 times so far",
            "Australia","Pakistan","England","Sri Lanka",
            "MS Dhoni","Virat Kohli","Sachin Tendulkar","Sourav Ganguly",
            "10th","9th","8th","7th",
            "India","West Indies","Australia","England",
            "Sri Lanka", "West Indies", "Pakistan", "India",
            "16","12","14","10",
            "India","Bangladesh","Sri Lanka", "South Africa",
            "Wasim Akram", "Waqar Younis", "Saeed Ajmal", "Saqlain Mushtaq",
            "Melbourne", "Sydney", "Adelaide", "Perth",
            "13 October 2021","15 October 2021","17 October 2021","19 October 2021",
            "England", "Sri Lanka", "South Africa", "Bangladesh",
            "David Warner","Marnus Labuschagne","Josh Hazlewood", "Matthew Wade",
            "Faf du Plessis","Joe Root","Marnus Labuschagne","Henry Nicholls",
            "Ravichandran Ashwin","Stuart Broad","Pat Cummins","Nathan Lyon",
            "Zak Crawley","Usman Shinwari", "Dwaine Pretorius","Jahmar Hamilton",
            "James Faulkner","Mitchell Johnson","Josh Hazlewood","Mitchell Starc",
            "Chaminda Vaas","Muttiah Muralitharan","Sanath Jayasuriya","Aravinda de Silva",
            "Steve Waugh","Ian Chappell","Wasim Akram","Graham Gooch",
            "Ricky Ponting denied the umpires' request as he wanted to bowl out the opposition", "Umpires feared that they had to return the next day and bowl the remaining overs","Sri Lanka were hell-bent to bat the remaining overs","Players were under the assumption DLS method can't be applied for bad light",
            "1975","1979","1983","1987",
            "Mohinder Amarnath.","Balwinder Sandhu","Roger Binny","Madan Lal",
            "Dilhara Fernando", "Trent Boult", "Nuwan Kulasekara", "Javagal Srinath",
            "Eoin Morgan", "Jason Roy","Jonny Bairstow","Joe Root",
            "Munaf Patel-Harbhajan Singh","Sreesanth-Yuvraj Singh","Munaf Patel-Sreesanth","Harbhajan Singh-Yuvraj Singh",
            "MS Dhoni", "Tom Latham", "Alex Carey", "Jos Buttler",
            "England win", "New Zealand win", "World Cup shared", "The Super Over would be played again",
            "Kane Williamson","Aaron Finch","Shakib Al Hasan","Joe Root",
            "Lord's","Southampton","Taunton","Birmingham",
            "Lockie Ferguson","Matt Henry","Trent Boult","James Neesham",
            "Jason Roy","Aaron Finch","Rohit Sharma","David Warner",
            "Adil Rashid","Yuzvendra Chahal","Rashid Khan","Imran Tahir",
            "Bangladesh", "South Africa", "New Zealand","Sri Lanka",
            "Hardik Pandya's run-out","Fakhar Zaman's dismissal off a no-ball","Shadab Khan's DRS review","Virat Kohli's wicket",
            "Sophia Gardens, Cardiff","Lord's, London", "Edgbaston, Birmingham", "Kennington Oval, London",
            "Faheem Ashraf", "Junaid Khan", "Mohammad Amir","Hasan Ali",
            "India","Sri Lanka","New Zealand","South Africa",
            "Tamim Iqbal","Mahmudullah","Mushfiqur Rahim","Soumya Sarkar",
            "Mohammad Amir","Liam Plunkett","Mitchell Starc","Josh Hazlewood",
            "Shoaib Malik","MS Dhoni","Shakib Al-Hasan","Mohammaed Hafee",
            "Mohammed Hafeez","Fakhar Zaman","Shoaib Malik","Imad Wasim",
            "Quinton de Kock","Hashim Amla","Faf du Plessis","JP Duminy",
            "Afghanistan","Sri Lanka","Zimbabwe","India",
            "47","81","36","78",
            "Udaipur", "Dharamshala", "Lucknow", "Bhopal",
            "Bangladesh won by 11 runs.","Bangladesh won by 3 wickets","India won by 1 run","India won by 7 wickets.",
            "India","Sri Lanka", "England", "West Indies",


    };

    int flag = 0;
    public static int marks = 0, correct = 0, wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cric_quiz);

        final TextView score = (TextView) findViewById(R.id.textView4);
        //  TextView textView = (TextView) findViewById(R.id.DispName);
        Intent intent = getIntent();
        String name = intent.getStringExtra("myname");

        submitbutton = (Button) findViewById(R.id.button3);
        quitbutton = (Button) findViewById(R.id.buttonquit);
        tv = (TextView) findViewById(R.id.tvque);

        radio_g = (RadioGroup) findViewById(R.id.answersgrp);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if (radio_g.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if (ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                } else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong.. Correct Ans :- "+answers[flag], Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText("" + correct*2);

                if (flag < questions.length) {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag * 4]);
                    rb2.setText(opt[flag * 4 + 1]);
                    rb3.setText(opt[flag * 4 + 2]);
                    rb4.setText(opt[flag * 4 + 3]);
                } else {
                    marks = correct;
                    Intent in = new Intent(getApplicationContext(), cric_quiz_result_activity.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton=findViewById(R.id.buttonquit);



        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cric_quiz_result_activity.class);
                startActivity(intent);

            }
        });

    }
}