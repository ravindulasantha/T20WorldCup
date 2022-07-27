package com.cricketapp.t20worldcup;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class squardAdapter extends BaseExpandableListAdapter {

    Context context;

    String[] fags = {
            "Sri Lanka",
            "Afghanistan",
            "Australia",
            "Bangladesh",
            "England",
            "India",
            "Ireland",
            "Namibia",
            "Netherlands",
            "New Zealand",
            "Oman",
            "Pakistan",
            "Papua New Guinea",
            "Scotland",
            "South Africa",
            "West Indies",
    };

    String[][] answer = {
            {
                    "Squad: Dasun Shanaka (capt), Dhananjaya de Silva, Kusal Janith Perera, Dinesh Chandimal, Avishka Fernando, Bhanuka Rajapaksa, Charith Asalanka, Wanindu Hasaranga, Kamindu Mendis, Chamika Karunaratne, Nuwan Pradeep, Dushmantha Chameera, Praveen Jayawickrama, Lahiru Madushanka, Maheesh Theekshana\n" +
                            "\n" +
                            "Reserves: Lahiru Kumara, Binura Fernando, Akila Dananjaya, Pulina Tharanga"
            },
            {
                    "Squad: Mohammad Nabi (capt), Rashid Khan, Mujeeb Ur Rahman, Rahmanullah Gurbaz (wk), Karim Janat, Hazratullah Zazai, Gulbadin Naib, Usman Ghani, Naveen ul Haq, Asghar Afghan, Hamid Hassan, Sharafuddin Ashraf, Najibullah Zadran, Dawlat Zadran, Hashmatullah Shahidi, Shapoor Zadran, Mohammad Shahzad (wk), Qais Ahmad\n" +
                            "\n" +
                            "Reserves: Afsar Zazai, Fareed Ahmad"
            },
            {
                    "Squad: Aaron Finch (capt), David Warner, Steve Smith, Glenn Maxwell, Mitchell Marsh, Matthew Wade, Ashton Agar, Pat Cummins, Mitchell Starc, Kane Richardson, Adam Zampa, Josh Hazlewood, Marcus Stoinis, Mitchell Swepson, Josh Inglis\n" +
                            "\n" +
                            "Travelling reserves: Dan Christian, Nathan Ellis, Daniel Sams"
            },
            {
                    "Squad: Mahmudullah (capt), Mohammad Naim, Soumya Sarkar, Liton Das (wk), Shakib Al Hasan, Mushfiqur Rahim, Afif Hossain, Nurul Hasan, Mahedi Hasan, Nasum Ahmed, Mustafizur Rahman, Shoriful Islam, Taskin Ahmed, Mohammad Saifuddin, Shamim Hossain\n" +
                            "\n" +
                            "Reserves: Aminul Islam, Rubel Hossain",
            },
            {
                    "Squad: Eoin Morgan (capt), Moeen Ali, Jonny Bairstow, Sam Billings, Jos Buttler, Sam Curran, Chris Jordan, Liam Livingstone, Dawid Malan, Tymal Mills, Adil Rashid, Jason Roy, David Willey, Chris Woakes, Mark Wood\n" +
                            "\n" +
                            "Travelling reserves: Tom Curran, Liam Dawson, James Vince"
            },
            {
                "Squad: Virat Kohli (c), Rohit Sharma, KL Rahul, Suryakumar Yadav, Rishabh Pant (wk), Ishan Kishan (wk), Hardik Pandya, Ravindra Jadeja, Rahul Chahar, Ravichandran Ashwin, Axar Patel, Varun Chakravarthy, Jasprit Bumrah, Bhuvneshwar Kumar, Mohammad Shami\n" +
                        "\n" +
                        "Reserves: Shreyas Iyer, Deepak Chahar, Shardul Thakur"
            },
            {
                "Squad: Andy Balbirnie (capt), Mark Adair, Curtis Campher, Gareth Delany, George Dockrell, Shane Getkate, Graham Kennedy, Josh Little, Andrew McBrine, Barry McCarthy, Kevin O'Brien, Neil Rock, Simi Singh, Paul Stirling, Harry Tector, Lorcan Tucker, Ben White, Craig Young"
            },
            {
                "Squad: Gerhard Erasmus (capt), Stephan Baard, Karl Birkenstock, Michau du Preez, Jan Frylinck, Zane Green, Jan Nicol Loftie-Eaton, Bernard Scholtz, Ben Shikongo, JJ Smit, Ruben Trumpelmann, Michael van Lingen, David Wiese, Craig Williams, Pikky Ya France"
            },
            {
                "Squad: Pieter Seelaar (capt), Colin Ackermann (vice-capt), Philippe Boissevain, Bas de Leede, Paul van Meekeren, Ben Cooper, Max O'Dowd, Scott Edwards, Ryan ten Doeschate, Timm van der Gugten, Roelof van der Merwe, Brandon Glover, Fred Klaassen, Logan van Beek, Stephan Myburgh"
            },
            {
                "Squad: Kane Williamson (capt), Todd Astle, Trent Boult, Mark Chapman, Devon Conway, Lockie Ferguson, Martin Guptill, Kyle Jamieson, Daryl Mitchell, Jimmy Neesham, Glenn Phillips, Mitchell Santner, Tim Seifert (wk), Ish Sodhi, Tim Southee, Adam Milne (injury cover)"
            },
            {
                "Squad: Zeeshan Maqsood (capt), Aqib Ilyas (vice-capt), Jatinder Singh, Khawar Ali, Mohammad Nadeem, Ayan Khan, Suraj Kumar, Sandeep Goud, Nestor Dhamba, Kaleemullah, Bilal Khan, Naseem Khushi, Sufyan Mehmood, Fayyaz Butt, Khurram Khan"
            },
            {
                "Squad: Babar Azam (capt), Shadab Khan (vice-capt), Mohammad Rizwan (wk), Asif Ali, Sohaib Maqsood, Azam Khan (wk), Khushdil Shah, Mohammad Hafeez, Mohammad Nawaz, Mohammad Wasim Junior, Shaheen Afridi, Haris Rauf, Hasan Ali, Imad Wasim, Mohammad Hasnain.\n" +
                        "\n" +
                        "Reserves: Usman Qadir, Shanawaz Dahani, Fakhar Zaman"
            },
            {
                "Squad: Assad Vala (capt), Charles Amini, Lega Siaka, Norman Vanua, Nosaina Pokana, Kiplin Doriga (wk), Tony Ura, Hiri Hiri, Gaudi Toka, Sese Bau, Damien Ravu, Kabua Vagi-Morea, Simon Atai, Jason Kila, Chad Soper, Jack Gardner"
            },
            {
                "Squad: Kyle Coetzer (capt), Richard Berrington (vice-capt), Dylan Budge, Matthew Cross (wk), Josh Davey, Alasdair Evans, Chris Greaves, Oli Hairs, Michael Leask, Calum Macleod, George Munsey, Safyaan Sharif, Chris Sole, Hamza Tahir, Craig Wallace (wk), Mark Watt, Brad Wheal"
            },
            {
                "Squad: Temba Bavuma (capt), Keshav Maharaj, Quinton de Kock (wk), Bjorn Fortuin, Reeza Hendricks, Heinrich Klaasen, Aiden Markram, David Miller, Wiaan Mulder, Lungi Ngidi, Anrich Nortje, Dwaine Pretorius, Kagiso Rabada, Tabraiz Shamsi, Rassie van der Dussen"
            },
            {
                "Squad: Kieron Pollard (capt), Nicholas Pooran (vice-capt & wk), Fabian Allen, Dwayne Bravo, Roston Chase, Andre Fletcher (wk), Chris Gayle, Shimron Hetmyer, Evin Lewis, Obed McCoy, Ravi Rampaul, Andre Russell, Lendl Simmons, Oshane Thomas, Hayden Walsh Jr\n" +
                        "\n" +
                        "Reserves: Jason Holder, Akeal Hosein, Sheldon Cottrell, Darren Bravo"
            }


    };
    public squardAdapter(Context context) {
        this.context = context; }
    @Override
    public int getGroupCount() {
        return fags.length; }
    @Override
    public int getChildrenCount(int groupPosition) {
        return answer[groupPosition].length; }
    @Override
    public Object getGroup(int groupPosition) {
        return fags[groupPosition]; }
    @Override
    public Object getChild(int groupPosition, int childPostion) {
        return answer[groupPosition][childPostion]; }
    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition; }
    @Override
    public long getChildId(int groupPosition, int childPostion) {
        return childPostion; }
    @Override
    public boolean hasStableIds() {
        return false; }
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View converView, ViewGroup parent) {

        String questionFaq = (String)getGroup(groupPosition);
        if (converView==null) {
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            converView=inflater.inflate(R.layout.squard_questions,null);
        }
        TextView quetionFaq2 = converView.findViewById(R.id.fagTitleView);
        quetionFaq2.setTypeface(null, Typeface.BOLD);
        quetionFaq2.setText(questionFaq);
        return converView;
    }
    @Override
    public View getChildView(int groupPosition, int childPostion, boolean isLastChild, View convertView, ViewGroup parent) {

        final String answerFaq = (String)getChild(groupPosition,childPostion);
        if (convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.squard_answer,null);
        }
        TextView answerFaq2 = convertView.findViewById(R.id.descriptionFaqView);
        answerFaq2.setText(answerFaq);
        return convertView;
    }
    @Override
    public boolean isChildSelectable(int groupPosition, int childPostion) {
        return false; }}
