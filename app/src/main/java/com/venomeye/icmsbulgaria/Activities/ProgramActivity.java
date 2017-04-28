package com.venomeye.icmsbulgaria.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.orm.query.Condition;
import com.orm.query.Select;
import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.Adapters.ProgramAdapter;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Program;

import java.util.ArrayList;
import java.util.List;

public class ProgramActivity extends AppCompatActivity {

    private ListView mEvents;
    private ProgramAdapter mAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_single);

        Intent intent = getIntent();

        String date = intent.getStringExtra("date");
        List<Program> events = Program.find(Program.class, "date = ?", date);
        mEvents = (ListView) findViewById(R.id.single_event_listview);
        mAdapter = new ProgramAdapter(this, events);
        mEvents.setAdapter(mAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(date);

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
}
