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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mNewsBtn = (Button)findViewById(R.id.news);
        mNewsBtn.setOnClickListener(this);
        mWorkshopsBtn = (Button)findViewById(R.id.workshops);
        mWorkshopsBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.news){
            Intent intent = new Intent(this, AllNewsActivity.class);
            startActivity(intent);
        } else if(v.getId() == R.id.workshops){
            Intent intent = new Intent(this, AllWorkshops.class);
            startActivity(intent);
        }
    }
}
