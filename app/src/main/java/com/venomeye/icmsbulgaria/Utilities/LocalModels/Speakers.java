package com.venomeye.icmsbulgaria.Utilities.LocalModels;


import com.orm.SugarRecord;

public class Speakers extends SugarRecord {

    public String getTitle() {
        return title;
    }

    public String getPosition() {
        return position;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public String getUrl() {
        return url;
    }

    String title;
    String position;
    String imageTitle;
    String url;

    public Speakers(){
    }

    public Speakers(String title, String position, String imageTitle, String url){
        this.title=title;
        this.position=position;
        this.imageTitle=imageTitle;
        this.url=url;
    }


    public static void fillDatabaseIfNeeded(){
        if(Speakers.count(Speakers.class)==0){
            Speakers speaker = new Speakers("Dr. Mike Clark","MD","mikeclark","http://icmsbg.org/speaker/dr-mike-clark/");
            speaker.save();
            speaker = new Speakers("Prof. Parveen Kumar","CBE, BSc, MD, FRCP, FRCP(E)","parveenkumar","http://icmsbg.org/speaker/prof-parveen-kumar/");
            speaker.save();
            speaker = new Speakers("Prof. Gianni Angelini","MD, MCh, FRCS, FETCS, FMedSci","gianniangelini","http://icmsbg.org/speaker/prof-gianni-angelini/");
            speaker.save();

            speaker = new Speakers("Dr. Rebecca Spencer","MD","rebeccaspencer","http://icmsbg.org/speaker/dr-rebecca-spencer/");
            speaker.save();

            speaker = new Speakers("Prof. Robert Thomas","Mb, ChB, MRCP, MD, FRCR","robertthomas","http://icmsbg.org/speaker/prof-robert-thomas-2/");
            speaker.save();

            speaker = new Speakers("Prof. Tomas Hanke","MSc BSc PhD","tomashanke","http://icmsbg.org/speaker/prof-tomas-hanke/");
            speaker.save();



        }
    }
}
