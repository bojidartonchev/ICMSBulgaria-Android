package com.venomeye.icmsbulgaria.Activities;


import android.content.Intent;
import android.net.Network;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.orm.query.Condition;
import com.orm.query.Select;
import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.Adapters.NetworkAdapter;
import com.venomeye.icmsbulgaria.Utilities.Adapters.ProgramAdapter;
import com.venomeye.icmsbulgaria.Utilities.Adapters.SpeakersAdapter;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Networking;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Program;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Speakers;

import java.util.ArrayList;
import java.util.List;

public class AllSpeakersActivity extends AppCompatActivity implements ListView.OnItemClickListener{

    private ListView mSpeakers;
    private SpeakersAdapter mAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_speakers);

        List<Speakers> speakers = Speakers.listAll(Speakers.class);
        mSpeakers = (ListView) findViewById(R.id.speakers_listview);
        mAdapter = new SpeakersAdapter(this, speakers);
        mSpeakers.setAdapter(mAdapter);
        mSpeakers.setOnItemClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Speakers");

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
            {
                onBackPressed();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Speakers speaker = (Speakers)parent.getItemAtPosition(position);
        Intent intent = new Intent(this, WebActivity.class);
        intent.putExtra("url",speaker.getUrl());
        intent.putExtra("name",speaker.getTitle());
        startActivity(intent);
    }
}
