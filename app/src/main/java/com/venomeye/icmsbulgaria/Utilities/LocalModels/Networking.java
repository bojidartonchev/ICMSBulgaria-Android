package com.venomeye.icmsbulgaria.Utilities.LocalModels;


import android.util.Log;

import com.orm.SugarRecord;

import java.util.Date;
import java.util.GregorianCalendar;

public class Networking extends SugarRecord {

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    String title;
    String location;
    String content;
    String date;

    public Networking(){
    }

    public Networking(String title, String content, String location, String date){
        this.title=title;
        this.content=content;
        this.location=location;
        this.date=date;
    }


    public static void fillDatabaseIfNeeded(){
        if(Networking.count(Networking.class)==0){
            //11 may
            Networking network = new Networking("“Welcome” cocktail","It’ll take place at the Main Congress Venue on " +
                    "the 2nd Floor at 20:00h right after official opening ceremony. Participants will get the chance " +
                    "to introduce themselves, meet fellow colleagues and start making new friendships and unforgettable" +
                    " memories.","Main Congress Venue 2nd Floor", "Thursday, 11 May 2017, 20:00h");
            network.save();
            network = new Networking("“As Bulgarians” the project","This event will take place at …………." +
                    " at 20:00h. When you are participating ICMS 2017 you are obviously smart. But do you dare " +
                    "to try dancing and acting like traditional Bulgarians? If you have the required courage we are " +
                    "gladly expecting you.  We have organized for you an evening with typical Bulgarian cuisine and dances." +
                    " The entertainment is guaranteed for sure!","*The meeting point will be ………...", "Friday, 12 May 2017, 20:00h");
            network.save();
            network = new Networking("Free Sofia Walk Tour","We provide you an opportunity to dive into Sofia, to dive into history." +
                    " Through out to more than 1300 years you will have the chance to explore one of the oldest culture in Europe. " +
                    "The tour will take you to the temples and monuments emblematic for our country and folks.",
                    "*The meeting point will be in front of the National Palace of Culture at 19:30h.", "Saturday, 13 May 2017, 19:30h  ");
            network.save();
            network = new Networking("Closing party","We invite to private closing party to rock on together one last time. Suit up because " +
                    "the Theme of the party will be “Bone Marrow”. Your dress code must include Erythrocytes (red color), Leukocytes " +
                    "(white color) or Plate cells (black color). To get your free welcome drink at the entrance make sure to say the special " +
                    "   password. PASSWORD: I’m not a virus!!!",
                    "*Address: NDK, 1 Bulgaria Square, 1000 Sofia ( on the back of National Palace of Culture)", "Sunday, 14 May 2017, 22:00h");
            network.save();

        }
    }
}
