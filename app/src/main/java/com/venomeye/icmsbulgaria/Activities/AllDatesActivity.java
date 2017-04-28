package com.venomeye.icmsbulgaria.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.venomeye.icmsbulgaria.R;

import java.text.SimpleDateFormat;

public class AllDatesActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView mListView;
    private ArrayAdapter<String> mAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_dates);

        mListView = (ListView) findViewById(R.id.dates) ;

        String[] dates = {"May 11", "May 12", "May 13", "May 14"};
        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dates);
        mListView.setOnItemClickListener(this);
        mListView.setAdapter(mAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Program");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getApplicationContext(), ProgramActivity.class);

        String entry =  (String) parent.getItemAtPosition(position);
        if(entry!=null){

            intent.putExtra("date", entry);
            startActivity(intent);
        }
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
