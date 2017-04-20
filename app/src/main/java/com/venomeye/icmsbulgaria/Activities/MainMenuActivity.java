package com.venomeye.icmsbulgaria.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.venomeye.icmsbulgaria.R;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mNewsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        mNewsBtn = (Button)findViewById(R.id.news);
        mNewsBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.news){
            Intent intent = new Intent(this, AllNewsActivity.class);
            startActivity(intent);
        }
    }
}
