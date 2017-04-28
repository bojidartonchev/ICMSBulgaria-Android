package com.venomeye.icmsbulgaria.Utilities.LocalModels;


import android.util.Log;

import com.orm.SugarRecord;

import java.util.Date;
import java.util.GregorianCalendar;

public class Program extends SugarRecord {

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    String title;
    String location;
    String time;
    String date;

    public Program(){
    }

    public Program(String title, String location, String time, String date){
        this.title=title;
        this.location=location;
        this.time=time;
        this.date=date;
    }


    public static void fillDatabaseIfNeeded(){
        if(Program.count(Program.class)==0){
            //11 may
            Program program = new Program("Registration","Main Congress Venue","11:00 – 18:00", "May 11");
            program.save();
            program = new Program("Opening Ceremony","St. Ekaterina Aula Maxima","19:00 – 20:00", "May 11");
            program.save();
            //12 may
//
            program = new Program("Workshops","Rooms announced on the next pages","9:00- 11:00", "May 12");
            program.save();
            program = new Program("Coffee Break","Main Congress Venue 4th Floor","11:00 – 11:15", "May 12");
            program.save();
            program = new Program("Preclinic Oral and Poster Sessions I","'Zdrave' Lecture Hall I", "11:15 – 13:00", "May 12");
            program.save();
            program = new Program("Therapy Oral and Poster Sessions I","'Zdrave' Lecture Hall II","11:15 – 13:00", "May 12");
            program.save();
            program = new Program("Lunch Break","Main Congress Venue 4th Floor","13:00 – 13:30", "May 12");
            program.save();
            program = new Program("Preclinic Oral and Poster Sessions II","'Zdrave' Lecture Hall I","13:30 – 15:15", "May 12");
            program.save();
            program = new Program("Therapy Oral and Poster Sessions II","'Zdrave' Lecture Hall II","13:30 – 15:15", "May 12");
            program.save();
            program = new Program("Coffee Break ","Main Congress Venue 4th Floor","15:15 – 15:30 ", "May 12");
            program.save();
            program = new Program("Preclinic Oral and Poster Sessions III","'Zdrave' Lecture Hall I","15:30 – 17:15 ", "May 12");
            program.save();
            program = new Program("Therapy Oral and Poster Sessions III","'Zdrave' Lecture Hall II","15:30 – 17:15 ", "May 12");
            program.save();
            program = new Program("ICMS Special talks Assoc. Prof. Andrey Galev “Current vaccine prophylaxis: summary and key facts”","Main Congress Venue 4th Floor","17:15 – 17:35", "May 12");
            program.save();
            program = new Program("Keynote Lecture by Dr. Rebecca Spencer The ‘EVERREST’ Project: Can maternal gene therapy treat severe growth restriction? ","St. Ekaterina Aula Maxima","17:40 – 19:10", "May 12");
            program.save();
//
            //13 may
            program = new Program("Workshops","Main Congress Venue Rooms announced on the next pages","9:00- 11:00", "May 13");
            program.save();
            program = new Program("Coffee Break","Main Congress Venue 4th Floor","11:00 – 11:15", "May 13");
            program.save();
            program = new Program("Keynote Lecture by Prof. Robert Thomas 'Evidence for Lifestyle and nutritional strategies in the prevention and treatment of cancer and other chronic medical conditions'","St. Ekaterina Aula Maxima","11:15 – 12:45", "May 13");
            program.save();
            program = new Program("Lunch Break","Main Congress Venue 4th Floor","12:45 – 13:15", "May 13");
            program.save();
            program = new Program("Surgery Oral and Poster Sessions I","'Zdrave' Lecture Hall I","13:15 – 15:00", "May 13");
            program.save();
            program = new Program("Dentistry Oral Session","'Zdrave' Lecture Hall II","13:15 – 15:00", "May 13");
            program.save();
            program = new Program("Public Health and Medical Education Sessions ","'Zdrave' Lecture Hall III","13:15 – 15:00", "May 13");
            program.save();
            program = new Program("Coffee Break","Main Congress Venue 4th Floor","15:00 – 15:15 ", "May 13");
            program.save();
            program = new Program("Surgery Oral and Poster Sessions II","'Zdrave' Lecture Hall I","15:15 – 16:45", "May 13");
            program.save();
            program = new Program("Dentistry Poster Session","'Zdrave' Lecture Hall II","15:15 – 16:45", "May 13");
            program.save();
            program = new Program("Coffee Break ","Foyer of St. Ekaterina Hospital","16:45 – 17:00 ", "May 13");
            program.save();
            program = new Program("Keynote Lecture (Prof. Tomas Hanke) “Attacking HIV where it hurts”","St. Ekaterina Aula Maxima","17:00 – 18:30", "May 13");
            program.save();
            program = new Program("ICMS Special talks Аssoc. Prof. Borislav Georgiec “Arterial hypertension”","St. Ekaterina Aula Maxima","18:30 – 18:30", "May 13");
            program.save();
            //14 may
            program = new Program("Workshops","Main Congress Venue Rooms announced on the next pages","9:45- 11:45", "May 14");
            program.save();
            program = new Program("Lunch break  ","Main Congress Venue 4th Floor","11:45- 12:15", "May 14");
            program.save();
            program = new Program("Keynote Lecture: Prof. Gianni Angelini ‘Taking Engineering to the Heart’","St. Ekaterina Aula Maxima","12:15- 13:45", "May 14");
            program.save();
            program = new Program("Coffee break","Foyer of St. Ekaterina Hospital ","13:45- 14:00", "May 14");
            program.save();
            program = new Program("Poster Presentation Finals","Foyer of St. Ekaterina Hospital ","14:00- 14:45", "May 14");
            program.save();
            program = new Program("Oral Presentation Finals ","St. Ekaterina Aula Maxima ","15:00- 15:45", "May 14");
            program.save();
            program = new Program("Coffee break","Foyer of St. Ekaterina Hospital ","15:45- 16:00", "May 14");
            program.save();
            program = new Program("Duet Keynote Lecture: Prof. Parveen Kumar “Life is Not A Rehearsal” Dr. Michael Clark “The Challenges Of Writing A Medical Textbook”","St. Ekaterina Aula Maxima ","16:00- 17:30", "May 14");
            program.save();
            program = new Program("Closing Ceremony ","St. Ekaterina Aula Maxima ","17:30- 18:30", "May 14");
            program.save();
        }
    }
}
