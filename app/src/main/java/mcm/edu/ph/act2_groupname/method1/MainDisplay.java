package mcm.edu.ph.act2_groupname.method1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mcm.edu.ph.act2_groupname.R;

public class MainDisplay extends AppCompatActivity implements View.OnClickListener{

    TextView textDisplay;
    Button btn1,btn2,btn3,btn4;
    int con=0;
    int con1, con1a;
    String conditionsMain = "The MC enrolled himself in an expensive school to study and met Kazuya and his friends. MC first introduced himself to \n\n\n\n\n Characters:\n MC(You)\n Mizuhara Chizuru\nRuka Sarashina \nSumi Sakurasawa \nMami Nanami \nKazuya Kinoshita";
    String txtdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindisplay);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        textDisplay = findViewById(R.id.txtDisplay);

        textDisplay.setText(conditionsMain);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }




    @Override
    public void onClick(View v){
        textDisplay = findViewById(R.id.txtDisplay);

        switch(v.getId()){
            case R.id.btn1:
                if (con > 0 && con1 > 0) { // a hacky condition to catch the 3rd condition layer,
                    con1a=1; //upon the 3rd condition layer, pushing button 1 sets your outcome to first choice
                    btn1.setEnabled(false); //disabling all the buttons after the final outcome
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break; //break allows us to catch the condition without actually being caught by other conditions below
                }
                if(con > 0){con1= 1;break;}
                if(con == 0){con=1;}
                break;

            case R.id.btn2:
                if (con > 0 && con1 > 0) {
                    con1a=2;
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;}
                if(con > 0){con1= 2;break;}
                if(con == 0){con=2;}
                break;

            case R.id.btn3:
                if (con > 0 && con1 > 0) {
                    con1a=3;
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;}
                if(con > 0){con1= 3;break;}
                if(con == 0){con=3;}
                break;

            case R.id.btn4:
                if (con > 0 && con1 > 0 ) {
                    con1a=4;
                    btn1.setEnabled(false);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    break;}
                if(con > 0){con1= 4;break;}
                if(con == 0){con=4;}
                break;
        }

        //The if-then conditions for storybuilding. Modify as you see fit.
        if(con==1){
            txtdialog = " MC introduced himself to Mizuhara. The MC, Kazuya, and his friends would hang out with each other talking about girls, models and how pretty their crush are. Suddenly Kazuya walks over with a girl" ;
            if(con1== 1){
                txtdialog = "Kazuya introduces and boast Ruka in front of his friends. The MC could not believe that Kazuya would have a beautiful girlfriend. Kazuya was offended. Because of that, Kazuya and The MC and Kazuya challenged each other to have a girlfriend at the end of the year. The MC is aware that no one would date him because he hangs out with friends who are social losers in the campus. So, he found a site that would rent him a girl as to be a pretend girlfriend. Eventually finding out Chizuru as a rental girlfriend. Aware of not making a scene, The MC spoke with Kazuya privately about Chizuru. Kazuya told the whole story and situation his in. The MC shows solidarity to Kazuya and wants to take part and experience of renting a girlfriend. Who does he rent?";
                if(con1a == 1){
                    txtdialog = "The MC is having fun renting  Mizuhara and eventually confessed his feelings. The MC ends up having a relationship, with his rental girlfriend. Having dates and going places, the MC is having the time of his life and one day he found out that he is running out of finances since his having fun and neglects his only source of income. The MC is dealing with stress for the reason of upcoming projects and struggling to make money to support himself. The MC is now making a desperate choice. The MC decides to act on his responsibilities, takes a break from friends to focus on himself and decides to confront Kazuya to call off the bet. The MC’s girlfriend is concerned of why the lack of presence and attention. Coincidentally, she overheard Kazuya and The MC’s conversation of the challenge. The girlfriend confronts the MC and throws a tantrum. The MC’s told her the whole story and about the situation his in. Promises were exchanged not to lie with each other and make bets anymore. And things got work out and back to normal.";
                }
                else if(con1a == 2){
                    txtdialog = "The MC rents Ruka. To Ruka, she was curious on how is she going to treat this date and why is MC renting her. At first, MC tells Ruka to keep quiet about him renting her but one day, Kazuya spots them while on a date. MC is forced to see Kazuya break down to tears as Ruka and MC are speechless. Kazuya eventually runs away. Weeks pass by and the MC and his gang of friends don't go out that much anymore. Mizuhara confronts the MC and asks why there is an awkward tension between him and kazuya. MC tries to lie about it, but Mizuhara already knows about the truth because she spoke to Ruka. Mizuhara disgusted by her friends actions, leaves. Mizuhara gets back to her place and looks at the sky then asks herself why she ever developed feelings for an idiot like MC. ";
                }
                else if(con1a == 3){
                    txtdialog = "The MC is having fun renting Sumi and eventually confessed his feelings. The MC ends up having a relationship, with his rental girlfriend. Having dates and going places all the time. While on a date Sumi asks MC why she picked her out of all the girls. Mizuhara was clearly superior among the rest. MC holds Sumi's hand and tells her that he accepts her for who she. A shooting star passes by and the MC says that his wish is that they stay together forever. The two then kiss. Mizuhara then watches from a distance. She tells herself she is happy for the Sumi and MC.";
                }
                else if (con1a == 4){
                    txtdialog = "The MC is having fun renting Mami but He feels that something is off. When they are not on dates, Mami seems to act hostile to the MC. The MC asks why is she acting like that but Mami makes up excuses for her behavior. Kazuya warns the MC about Mami's secret social media account. Kazuya says that Mami is only using you to get revenge because Mami and Kazuya used to date. A days later, the MC confronts Mami and breaks up with her. Mami expresses her anger to the MC but the MC tells her that she has to make up with Kazuya.";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Kazuya introduces and boasts Mizuhara in front of his friends. The MC could not believe that Kazuya would have a beautiful girlfriend. Kazuya was offended.Because of that, Kazuya and The MC and Kazuya challenged each other to have a girlfriend at the end of the year. The MC is aware that no one would date him because he hangs out with friends who are social losers in the campus. So, he found a site that would rent him a girl as to be a pretend girlfriend. Eventually finding out Chizuru as a rental girlfriend. Aware of not making a scene, The MC spoke with Kazuya privately about Chizuru. Kazuya told the whole story and situation his in. The MC shows solidarity to Kazuya and wants to take part and experience of renting a girlfriend. Who does he rent?";
                if (con1a == 1) {
                    txtdialog = "The MC decides to rent Mizuhara. Mizuhara denies it the request at first but she reconsiders since she needs the money for her acting classes. Kazuya invites MC to his house to confront him. After asking about Mizuhara, it eventually led to a fist fight. Mizuhara rushes in and stops the fight and slaps both of them saying that she will never hang out with them again";

                } else if (con1a == 2) {
                    txtdialog = "The MC rents Ruka. Despite being pushy and clingy towards the MC. She slowly develops feelings for the MC. On one of the dates, she tells MC that no one has ever raised heart beats per minute this much. Ruka then explains that she has a heart condition that makes her have low heart beats per minute. Ruka then asks the MC to go out with her. MC agrees and both of them  continue along with their date.";

                } else if (con1a == 3) {
                    txtdialog = "The MC is having fun renting Sumi and eventually confessed his feelings. The MC ends up having a relationship, with his rental girlfriend. Having dates and going places all the time. While on a date Sumi asks MC why she picked her out of all the girls. Mizuhara was clearly superior among the rest. MC holds Sumi's hand and tells her that he accepts her for who she. A shooting star passes by and the MC says that his wish is that they stay together forever. The two then kiss. Mizuhara then watches from a distance. She tells herself she is happy for the Sumi and MC.";

                } else if (con1a == 4) {
                    txtdialog = "The MC is having fun renting Mami but He feels that something is off. When they are not on dates, Mami seems to act hostile to the MC. The MC asks why is she acting like that but Mami makes up excuses for her behavior. Kazuya warns the MC about Mami's secret social media account. Kazuya says that Mami is only using you to get revenge because Mami and Kazuya used to date. A days later, the MC confronts Mami and breaks up with her. Mami expresses her anger to the MC but the MC tells her that she has to make up with Kazuya";
                }
            }
            else if(con1 == 3){
                txtdialog = "Kazuya introduces and boasts Sumi  in front of his friends. The MC could not believe that Kazuya would have a beautiful girlfriend. Kazuya was offended.Because of that, Kazuya and The MC and Kazuya challenged each other to have a girlfriend at the end of the year. The MC is aware that no one would date him because he hangs out with friends who are social losers in the campus. So, he found a site that would rent him a girl as to be a pretend girlfriend. Eventually finding out Chizuru as a rental girlfriend. Aware of not making a scene, The MC spoke with Kazuya privately about Chizuru. Kazuya told the whole story and situation his in. The MC shows solidarity to Kazuya and wants to take part and experience of renting a girlfriend. Who does he rent?";
                if (con1a == 1) {
                    txtdialog = "The MC is having fun renting  Mizuhara and eventually confessed his feelings. The MC ends up having a relationship, with his rental girlfriend. Having dates and going places, the MC is having the time of his life and one day he found out that he is running out of finances since his having fun and neglects his only source of income. The MC is dealing with stress for the reason of upcoming projects and struggling to make money to support himself. The MC is now making a desperate choice. The MC decides to act on his responsibilities, takes a break from friends to focus on himself and decides to confront Kazuya to call off the bet. The MC’s girlfriend is concerned of why the lack of presence and attention. Coincidentally, she overheard Kazuya and The MC’s conversation of the challenge. The girlfriend confronts the MC and throws a tantrum. The MC’s told her the whole story and about the situation his in. Promises were exchanged not to lie with each other and make bets anymore. And things got work out and back to normal.";

                } else if (con1a == 2) {
                    txtdialog = "The MC rents Ruka. Despite being pushy and clingy towards the MC. She slowly develops feelings for the MC. On one of the dates, she tells MC that no one has ever raised heart beats per minute this much. Ruka then explains that she has a heart condition that makes her have low heart beats per minute. Ruka then asks the MC to go out with her. MC agrees and both of them  continue along with their date.";

                } else if (con1a == 3) {
                    txtdialog = "The MC rents Sumi. Sumi having spent so much time Kazuya is too shy to go with MC. Sumi apologizes and keeps quiet about the MC's attempt to rent Sumi ";

                } else if (con1a == 4){
                    txtdialog = "The MC is having fun renting Mami but He feels that something is off. When they are not on dates, Mami seems to act hostile to the MC. The MC asks why is she acting like that but Mami makes up excuses for her behavior. Kazuya warns the MC about Mami's secret social media account. Kazuya says that Mami is only using you to get revenge because Mami and Kazuya used to date. A days later, the MC confronts Mami and breaks up with her. Mami expresses her anger to the MC but the MC tells her that she has to make up with Kazuya";
                }
            }
            else if(con1 == 4){
                txtdialog = "Kazuya introduces and boasts Mami  in front of his friends. The MC could not believe that Kazuya would have a beautiful girlfriend. Kazuya was offended.Because of that, Kazuya and The MC challenged each other to have a girlfriend at the end of the year. The MC is aware that no one would date him because he hangs out with friends who are social losers in the campus. So, he found a site that would rent him a girl as to be a pretend girlfriend. Eventually finding out Chizuru as a rental girlfriend. Aware of not making a scene, The MC spoke with Kazuya privately about Chizuru. Kazuya told the whole story and situation his in. The MC shows solidarity to Kazuya and wants to take part and experience of renting a girlfriend. Who does he rent?";
                if (con1a == 1) {
                    txtdialog = "The MC is having fun renting  Mizuhara and eventually confessed his feelings. The MC ends up having a relationship, with his rental girlfriend. Having dates and going places, the MC is having the time of his life and one day he found out that he is running out of finances since his having fun and neglects his only source of income. The MC is dealing with stress for the reason of upcoming projects and struggling to make money to support himself. The MC is now making a desperate choice. The MC decides to act on his responsibilities, takes a break from friends to focus on himself and decides to confront Kazuya to call off the bet. The MC’s girlfriend is concerned of why the lack of presence and attention. Coincidentally, she overheard Kazuya and The MC’s conversation of the challenge. The girlfriend confronts the MC and throws a tantrum. The MC’s told her the whole story and about the situation his in. Promises were exchanged not to lie with each other and make bets anymore. And things got work out and back to normal.";

                } else if (con1a == 2) {
                    txtdialog = "The MC rents Ruka. Despite being pushy and clingy towards the MC. She slowly develops feelings for the MC. On one of the dates, she tells MC that no one has ever raised heart beats per minute this much. Ruka then explains that she has a heart condition that makes her have low heart beats per minute. Ruka then asks the MC to go out with her. MC agrees and both of them  continue along with their date.";

                } else if (con1a == 3) {
                    txtdialog = "The MC is having fun renting Sumi and eventually confessed his feelings. The MC ends up having a relationship, with his rental girlfriend. Having dates and going places all the time. While on a date Sumi asks MC why she picked her out of all the girls. Mizuhara was clearly superior among the rest. MC holds Sumi's hand and tells her that he accepts her for who she. A shooting star passes by and the MC says that his wish is that they stay together forever. The two then kiss. Mizuhara then watches from a distance. She tells herself she is happy for the Sumi and MC.";

                } else if (con1a == 4){
                    txtdialog = "Mami accepts wholeheartedly while keeping the MC in the dark about her relationship with Kazuya. On one date Mami and the MC eat a cafe, to the MC's surprise kazuya was also invited even though the MC scheduled the date. Mami then lies to kazuya that the MC is trying to convince her to break up with him so that the MC can have her all for himself. The MC then tries to expalain himself but Kazuya has already grabbed the MC by the throat and threaten to hurt him more. All while this is happening, Mami is in the background with an evil grin. ";

                }
            }
        }

        else if(con==2){
            txtdialog = "MC introduced himself to Ruka. The MC, Kazuya, and his friends would hang out with each other talking about girls, models and how pretty their crush are. Suddenly Kazuya walks over with a girl.";
            if(con1== 1){
                txtdialog = "Kazuya introduces and boast Mizuhara in front of his friends. The MC could not believe that Kazuya would have a beautiful girlfriend. Kazuya was offended. Because of that, Kazuya and The MC and Kazuya challenged each other to have a girlfriend at the end of the year. The MC is aware that no one would date him because he hangs out with friends who are social losers in the campus. So, he found a site that would rent him a girl as to be a pretend girlfriend. Eventually finding out Chizuru as a rental girlfriend. Aware of not making a scene, The MC spoke with Kazuya privately about Chizuru. Kazuya told the whole story and situation his in. The MC shows solidarity to Kazuya and wants to take part and experience of renting a girlfriend. Who does he rent?";
                if(con1a == 1){
                    txtdialog = "MC rents Ruka. Ruka is happy that she is spending time with the MC since He was the first one she met in School. Mizuhara, Kazuya, MC and Ruka go on double dates all the time and share an everlasting friendship with Mami being remaining single";

                }
                else if(con1a == 2){
                    txtdialog = "MC rents Mizuhara. Mizuhara denies the MC because of her busy schedule. The MC tries to push Mizuhara to go out with him but Mizuhara says that Kazuya has already won her heart. They aren't dating yet but Mizuhara has developed feelings for Kazuya as well. Mizuhara walks away after apologizing to the MC for turning her down";
                }
                else if(con1a == 3){
                    txtdialog = "MC rents Sumi. On dates it is hard for Sumi to get along with the MC because of his outgoing personality. MC notices this and adjusts for Sumi. They eventually end the relationship on good terms because Sumi does not want the MC to change himself for her ";
                }
                else if (con1a == 4){
                    txtdialog = "MC rents Mami. At first, everything seem to go well. MC develops feelings for Mami, but Mami is just faking her personality for MC. The MC decides to confess to Mami but Mami denies him saying that he is not of use to her.";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Kazuya introduces and boast Ruka in front of his friends. The MC could not believe that Kazuya would have a beautiful girlfriend. Kazuya was offended. Because of that, Kazuya and The MC and Kazuya challenged each other to have a girlfriend at the end of the year. The MC is aware that no one would date him because he hangs out with friends who are social losers in the campus. So, he found a site that would rent him a girl as to be a pretend girlfriend. Eventually finding out Chizuru as a rental girlfriend. Aware of not making a scene, The MC spoke with Kazuya privately about Chizuru. Kazuya told the whole story and situation his in. The MC shows solidarity to Kazuya and wants to take part and experience of renting a girlfriend. Who does he rent?";
                if (con1a == 1) {
                    txtdialog = "MC rents Mizuhara. Mizuhara is happy because happy because he rented her. Mizuhara eventually tells the MC her feelings. She explains that being with MC is like a breath of fresh air to her because of all the things going on in her life. They both agree to a mutual relationship and continue their regular lives.";

                } else if (con1a == 2) {
                    txtdialog = "MC rents Ruka. Ruka and MC hang out on multiple dates. Ruka slowly develops feelings for the MC but she also has feelings for Kazuya. Confused. Ruka seems to be disconnected from her circle of friends including the girls and Kazuya and MC. MC goes to Ruka's house to confess to her, but when he gets there, He sees Ruka and Kazuya in the window having fun.";

                } else if (con1a == 3) {
                    txtdialog = "MC rents Sumi. On dates it is hard for Sumi to get along with the MC because of his outgoing personality. MC notices this and adjusts for Sumi. They eventually end the relationship on good terms because Sumi does not want the MC to change himself for her.";

                } else if (con1a == 4){
                    txtdialog = "MC rents Mami. At first, everything seem to go well. MC develops feelings for Mami, but Mami is just faking her personality for MC. The MC decides to confess to Mami but Mami denies him saying that he is not of use to her.";

                }
            }
            else if(con1 == 3){
                txtdialog = "Kazuya introduces and boast Sumi in front of his friends. The MC could not believe that Kazuya would have a beautiful girlfriend. Kazuya was offended. Because of that, Kazuya and The MC and Kazuya challenged each other to have a girlfriend at the end of the year. The MC is aware that no one would date him because he hangs out with friends who are social losers in the campus. So, he found a site that would rent him a girl as to be a pretend girlfriend. Eventually finding out Chizuru as a rental girlfriend. Aware of not making a scene, The MC spoke with Kazuya privately about Chizuru. Kazuya told the whole story and situation his in. The MC shows solidarity to Kazuya and wants to take part and experience of renting a girlfriend. Who does he rent?";
                if (con1a == 1) {
                    txtdialog = "MC rents Mizuhara. Mizuhara is happy because happy because he rented her. Mizuhara eventually tells the MC her feelings. She explains that being with MC is like a breath of fresh air to her because of all the things going on in her life. They both agree to a mutual relationship and continue their regular lives.";

                } else if (con1a == 2) {
                    txtdialog = "MC rents Ruka. Ruka is happy that she is spending time with the MC since He was the first one she met in School. Mizuhara, Kazuya, MC and Ruka go on double dates all the time and share an everlasting friendship with Mami being remaining single";

                } else if (con1a == 3) {
                    txtdialog = "MC tries rents Sumi. Sumi being the shy girl she is, hesitantly says no since she has feelings for kazuya. She does not want to acknowledge it but her feelings for Kazuya are strong. Sumi says sorry before walking away from the MC. ";
                } else if (con1a == 4){
                    txtdialog = "MC rents Mami. At first, everything seem to go well. MC develops feelings for Mami, but Mami is just faking her personality for MC. The MC decides to confess to Mami but Mami denies him saying that he is not of use to her.";

                }
            }
            else if (con1 == 4){
                txtdialog = "Kazuya introduces and boast Mami in front of his friends. The MC could not believe that Kazuya would have a beautiful girlfriend. Kazuya was offended. Because of that, Kazuya and The MC and Kazuya challenged each other to have a girlfriend at the end of the year. The MC is aware that no one would date him because he hangs out with friends who are social losers in the campus. So, he found a site that would rent him a girl as to be a pretend girlfriend. Eventually finding out Chizuru as a rental girlfriend. Aware of not making a scene, The MC spoke with Kazuya privately about Chizuru. Kazuya told the whole story and situation his in. The MC shows solidarity to Kazuya and wants to take part and experience of renting a girlfriend. Who does he rent?";
                if (con1a == 1) {
                    txtdialog = "MC rents Mizuhara. Mizuhara is happy because happy because he rented her. Mizuhara eventually tells the MC her feelings. She explains that being with MC is like a breath of fresh air to her because of all the things going on in her life. They both agree to a mutual relationship and continue their regular lives.";
                } else if (con1a == 2) {
                    txtdialog = "MC rents Ruka. Ruka is happy that she is spending time with the MC since He was the first one she met in School. Mizuhara, Kazuya, MC and Ruka go on double dates all the time and share an everlasting friendship with Mami being remaining single";

                } else if (con1a == 3) {
                    txtdialog = "MC rents Sumi. On dates it is hard for Sumi to get along with the MC because of his outgoing personality. MC notices this and adjusts for Sumi. They eventually end the relationship on good terms because Sumi does not want the MC to change himself for her.";

                } else if (con1a == 4) {
                    txtdialog = "Mami politely declines MC's request to rent her. After a few weeks. MC receives a text from Mami if he is still up for the rental. MC says yes. Little does MC know that Mami broke up with Kazuya for him. This leaves Kazuya and MC's relationship in an awkward state";
                }
            }
        }

        else if(con==3){
            txtdialog = "MC introduced himself to Sumi. The MC, Kazuya, and his friends would hang out with each other talking about girls, models and how pretty their crush are. Suddenly Kazuya walks over with a girl";
            if(con1== 1){
                txtdialog = "Kazuya intruced to his friends his rental girlfriend named Mizuhara, but they didn't know that because kazuya kept it as a secret. He knows that they would make fun of him when they found out she was only a rental girlfriend.";
                if(con1a == 1){
                    txtdialog = "The MC rented Sumi again for another day and when they were on their date on the mall they saw Mizuhara with another boy, when the other day comes the MC told Kazuya when they met at school that he saw Mizuhara with another boy which gives Kazuya no choice but to confess that she is only a rental girlfriend and to cheer him up he also told him that he has a rental girlfriend to.";
                }
                else if(con1a == 2){
                    txtdialog = "MC went again to the website where he met Sumi for the first time, while scrolling he found out that Mizuhara was just a rental girlfriend, but he kept it as a secret because he knows that Kazuya would be embarrassed to tell the truth.";
                }
                else if(con1a == 3){
                    txtdialog = "While the MC and sumi went on a date, he told Sumi about Kazuya's girlfriend and as he show her a picture of her Sumi knew her as one of many other rental girlfriends at her agencies, the MC was shocked that Mizuhara was only a rental girlfriend.";
                }
                else if (con1a == 4){
                    txtdialog = "Kazuya was about to rate Mizuhara for the date that they had, as he saw at the suggested section of the website he saw that the MC's girlfriend, was only a rental girlfriend. When the MC and Kazuya met at school, Kazuya quickly told the MC that he knew about Sumi while they were alone, as embarrassed the MC is Kazuya confessed that Mizuhara was only a rental girlfriend too and after that they laughed together at each other.";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Kazuya intruced to his friends his rental girlfriend named Ruka, but they didn't know that because kazuya kept it as a secret. He knows that they would make fun of him when they found out she was only a rental girlfriend.";
                if (con1a == 1) {
                    txtdialog = "The MC rented Sumi again for another day and when they were on their date on the mall they saw Ruka with another boy, when the other day comes the MC told Kazuya when they met at school that he saw Ruka with another boy which gives Kazuya no choice but to confess that she is only a rental girlfriend and to cheer him up he also told him that he has a rental girlfriend to.";
                } else if (con1a == 2) {
                    txtdialog = "MC went again to the website where he met Sumi for the first time, while scrolling he found out that Ruka was just a rental girlfriend, but he kept it as a secret because he knows that Kazuya would be embarrassed to tell the truth.";
                } else if (con1a == 3) {
                    txtdialog = "While the MC and sumi went on a date, he told Sumi about Kazuya's girlfriend and as he show her a picture of her Sumi knew her as one of many other rental girlfriends at her agencies, the MC was shocked that Ruka was only a rental girlfriend.";
                } else if (con1a == 4){
                    txtdialog = "Kazuya was about to rate Ruka for the date that they had, as he saw at the suggested section of the website he saw that the MC's girlfriend, was only a rental girlfriend. When the MC and Kazuya met at school, Kazuya quickly told the MC that he knew about Sumi while they were alone, as embarrassed the MC is Kazuya confessed that Ruka was only a rental girlfriend too and after that they laughed together at each other.";
                }
            }
            else if(con1 == 3){
                txtdialog = "Kazuya intruced to his friends his rental girlfriend named Mami, but they didn't know that because kazuya kept it as a secret. He knows that they would make fun of him when they found out she was only a rental girlfriend.";
                if (con1a == 1) {
                    txtdialog = "The MC rented Sumi again for another day and when they were on their date on the mall they saw Mami with another boy, when the other day comes the MC told Kazuya when they met at school that he saw Mami with another boy which gives Kazuya no choice but to confess that she is only a rental girlfriend and to cheer him up he also told him that he has a rental girlfriend to.";
                } else if (con1a == 2) {
                    txtdialog = "MC went again to the website where he met Sumi for the first time, while scrolling he found out that Mami was just a rental girlfriend, but he kept it as a secret because he knows that Kazuya would be embarrassed to tell the truth.";
                } else if (con1a == 3) {
                    txtdialog = "While the MC and sumi went on a date, he told Sumi about Kazuya's girlfriend and as he show her a picture of her Sumi knew her as one of many other rental girlfriends at her agencies, the MC was shocked that Mami was only a rental girlfriend.";
                } else if (con1a == 4){
                    txtdialog = "Kazuya was about to rate Mami for the date that they had, as he saw at the suggested section of the website he saw that the MC's girlfriend, was only a rental girlfriend. When the MC and Kazuya met at school, Kazuya quickly told the MC that he knew about Sumi while they were alone, as embarrassed the MC is Kazuya confessed that Mami was only a rental girlfriend too and after that they laughed together at each other.";
                }
            }
            else if (con1 == 4){
                txtdialog = "Kazuya introduced to his friends his rental girlfriend named Sumi, but he didn't new that the MC already knew Sumi as a rental girlfriend, which makes the atmosphere awkward between the MC and Sumi";
                if (con1a == 1) {
                    txtdialog = "Sumi ran away out of the embarrassment and awkwardness of the moment, which makes the MC confess that he knows that Sumi was just a rental and because he also rented her as her girlfriend that one time.";
                } else if (con1a == 2) {
                    txtdialog = "MC and Sumi stayed casual together while Kazuya was with them and as Kazuya went home and Sumi and MC were left they talked about what is happening, little did they know that Kazuya left his phone at Sumi's bag so he went back and saw them holding hands which breaks Kazuya's heart.";
                } else if (con1a == 3) {
                    txtdialog = "The MC never rented Sumi ever again in respect of Kazuya, he knows how it would crush Kazuya when founds out that MC knows and he rented Sumi first than him.";
                } else if (con1a == 4){
                    txtdialog = "Sumi disappeared and the MC and Kazuya never saw her again. Her profile was deactivated at the website which makes both of them worried so the MC confessed to Kazuya that he knows but they set aside that problem so that they could help each other fild Sumi.";
                }
            }
        }
        else if(con == 4){
            txtdialog = "MC introduced himself to Mami. The MC, Kazuya, and his friends would hang out with each other talking about girls, models and how pretty their crush are. Suddenly Kazuya walks over with a girl";
            if(con1== 1){
                txtdialog = "Kazuya introduced to them his girlfriend Ruka. As the other day came, MC and Mami were on a double date with Kazuya and Ruka, and while Kazuya was on a restroom she told the MC and Mami that she knows about Mami's job as a rental girlfriend which makes a problem for the MC and Mami that the other didn't know.";
                if(con1a == 1){
                    txtdialog = "MC told Mami that he will confess that him and Mami were just a fake couple and Mami was just a rental girlfriend because he knows that Kazuya would understand when it comes from him and because Ruka was also just a rental girlfriend and they could laugh all about it afterwards.";
                }
                else if(con1a == 2){
                    txtdialog = "Ruka gave them a condition so that she wouldn't tell Kazuya about them, and that condition is that the MC and Ruka would be in a serious relationship, because for the momment that Ruka saw the MC she was madly in love with him and you could also call it blackmail on what she is doing.";
                }
                else if(con1a == 3){
                    txtdialog = "Ruka told Kazuya after that day that Mami was also only a rental girlfriend that the MC was renting, and out of guiltiness he went to the MC's house to confess that Ruka was also only a rental girlfriend and the MC told Kazuya that he knows but they were still friends afterwards.";
                }
                else if (con1a == 4){
                    txtdialog = "Ruka told the MC and Mami that she would keep it as a secret because she felt sorry that she was blackmailing them both.";
                }
            }
            else if(con1 == 2) {
                txtdialog = "Kazuya introduced to them his girlfriend Sumi. As the other day came, MC and Mami were on a double date with Kazuya and Sumi, and while Kazuya was on a restroom she told the MC and Mami that she knows about Mami's job as a rental girlfriend which makes a problem for the MC and Mami that the other didn't know.";
                if (con1a == 1) {
                    txtdialog = "MC told Mami that he will confess that him and Mami were just a fake couple and Mami was just a rental girlfriend because he knows that Kazuya would understand when it comes from him and because Sumi was also just a rental girlfriend and they could laugh all about it afterwards.";
                } else if (con1a == 2) {
                    txtdialog = "Sumi gave them a condition so that she wouldn't tell Kazuya about them, and that condition is that the MC and Sumi would be in a serious relationship, because for the momment that Sumi saw the MC she was madly in love with him and you could also call it blackmail on what she is doing.";
                } else if (con1a == 3) {
                    txtdialog = "Sumi told Kazuya after that day that Mami was also only a rental girlfriend that the MC was renting, and out of guiltiness he went to the MC's house to confess that Mami was also only a rental girlfriend and the MC told Kazuya that he knows but they were still friends afterwards.";
                } else if (con1a == 4){
                    txtdialog = "Sumi told the MC and Mami that she would keep it as a secret because she felt sorry that she was blackmailing them both.";
                }
            }
            else if(con1 == 3){
                txtdialog = "Kazuya introduced to them his girlfriend Mizuhara. As the other day came, MC and Mami were on a double date with Kazuya and Mizuhara, and while Kazuya was on a restroom she told the MC and Mami that she knows about Mami's job as a rental girlfriend which makes a problem for the MC and Mami that the other didn't know.";
                if (con1a == 1) {
                    txtdialog = "MC told Mami that he will confess that him and Mami were just a fake couple and Mami was just a rental girlfriend because he knows that Kazuya would understand when it comes from him and because Mizuhara was also just a rental girlfriend and they could laugh all about it afterwards.";
                } else if (con1a == 2) {
                    txtdialog = "Mizuhara gave them a condition so that she wouldn't tell Kazuya about them, and that condition is that the MC and Mizuhara would be in a serious relationship, because for the momment that Mizuhara saw the MC she was madly in love with him and you could also call it blackmail on what she is doing.";
                } else if (con1a == 3) {
                    txtdialog = "Mizuhara told Kazuya after that day that Mami was also only a rental girlfriend that the MC was renting, and out of guiltiness he went to the MC's house to confess that Mizuhara was also only a rental girlfriend and the MC told Kazuya that he knows but they were still friends afterwards.";
                } else if (con1a == 4){
                    txtdialog = "Mizuhara told the MC and Mami that she would keep it as a secret because she felt sorry that she was blackmailing them both.";
                }
            }
            else if (con1 == 4){
                txtdialog = "Kazuya introducec to them his girlfriend Mami, but she didn't know that the MC and Kazuya were friends, that is why Mami breaks up with Kazuya.";
                if (con1a == 1) {
                    txtdialog = "Mami told the MC that she broken up with Kazuya because she can't handle the awkwardness when the three of them are together. But one day while the MC and Mami were on a date they were both saw by Kazuya which makes him furious because that's maybe the reason why Mami broken up with him, so he confronted the MC while on their date, and there he learned that the MC was the first one to rent her as her girlfriend.";
                } else if (con1a == 2) {
                    txtdialog = "Mami told the MC that she broken up with Kazuya because she can't handle the awkwardness when the three of them are together, but MC disagrees with Mami's decision because he cares more about his friend than a girlfriend who was just a rental and rejected his best friend.";
                } else if (con1a == 3) {
                    txtdialog = "Mami kept to herself that she broken up with Kazuya, while the MC didn't know about that it was weird when Mami and MC was talking about meeting up with his friends Mami would always disagrees, but he learned about the news through Kazuya that is mourning for weeks about the break up and that is why the MC also broke up with Mami because she hurt his best friend.";
                } else if (con1a == 4){
                    txtdialog = "Mami told the MC that she broken up with Kazuya and he must also not see him anymore as Mami requested. Even though it was evil for Mami to tell him that he couldn't be friends with Kazuya anymore the MC ignores the right thing to do and followed his heart becuase he had fallen in love with Mami even though she was just a rental girlfriend.";
                }
            }
        }
        textDisplay.setText(txtdialog);
    }

}