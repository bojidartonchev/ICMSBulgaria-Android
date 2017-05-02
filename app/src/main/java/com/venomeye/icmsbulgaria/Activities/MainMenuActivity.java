package com.venomeye.icmsbulgaria.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.venomeye.icmsbulgaria.R;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mNewsBtn;
    private Button mWorkshopsBtn;
    private Button mProgramBtn;
    private Button mNetworkBtn;
    private Button mVenuesBtn;
    private Button mSessionsBtn;
    private Button mSpeakersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mNewsBtn = (Button)findViewById(R.id.news);
        mNewsBtn.setOnClickListener(this);
        mWorkshopsBtn = (Button)findViewById(R.id.workshops);
        mWorkshopsBtn.setOnClickListener(this);
        mProgramBtn = (Button)findViewById(R.id.program);
        mProgramBtn.setOnClickListener(this);
        mNetworkBtn = (Button)findViewById(R.id.networking);
        mNetworkBtn.setOnClickListener(this);
        mVenuesBtn = (Button)findViewById(R.id.venues);
        mVenuesBtn.setOnClickListener(this);
        mSessionsBtn = (Button)findViewById(R.id.sessions);
        mSessionsBtn.setOnClickListener(this);
        mSpeakersBtn = (Button)findViewById(R.id.speakers);
        mSpeakersBtn.setOnClickListener(this);
}

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.news){
            Intent intent = new Intent(this, AllNewsActivity.class);
            startActivity(intent);
        } else if(v.getId() == R.id.workshops){
            Intent intent = new Intent(this, AllWorkshops.class);
            startActivity(intent);
        } else if(v.getId()== R.id.program){
            Intent intent = new Intent(this, AllDatesActivity.class);
            startActivity(intent);
        } else if(v.getId()==R.id.networking){
            Intent intent = new Intent(this, AllNetworksActivity.class);
            startActivity(intent);
        } else if((v.getId()==R.id.venues)){
            Intent intent = new Intent(this, VenuesActivity.class);
            startActivity(intent);
        } else if((v.getId()==R.id.sessions)){
            Intent intent = new Intent(this, SessionsActivity.class);
            startActivity(intent);
        } else if((v.getId()==R.id.speakers)){
            Intent intent = new Intent(this, AllSpeakersActivity.class);
            startActivity(intent);
        }

    }
}
