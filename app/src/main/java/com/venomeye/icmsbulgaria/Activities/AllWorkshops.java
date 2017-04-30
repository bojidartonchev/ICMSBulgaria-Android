package com.venomeye.icmsbulgaria.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.parse.ParseObject;
import com.parse.ParseQueryAdapter;
import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.Adapters.WorkshopsAdapter;

import java.text.SimpleDateFormat;
import java.util.List;

public class AllWorkshops  extends AppCompatActivity implements  AdapterView.OnItemClickListener, ParseQueryAdapter.OnQueryLoadListener{

    private ListView mWorkshops;
    private View mProgress;

    private ParseQueryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshops);

        mWorkshops = (ListView) findViewById(R.id.all_workshops_list_view) ;
        mProgress = findViewById(R.id.progress);
        mAdapter = new WorkshopsAdapter(this);
        mAdapter.addOnQueryLoadListener(this);
        mWorkshops.setOnItemClickListener(this);
        mWorkshops.setAdapter(mAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Workshops");

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(getApplicationContext(), WorkshopActivity.class);

        ParseObject entry = (ParseObject) parent.getItemAtPosition(position);
        if(entry!=null){

            intent.putExtra("title", entry.getString("title"));
            intent.putExtra("content", entry.getString("content"));
            intent.putExtra("date",new SimpleDateFormat("MMM-dd-yyyy").format(entry.getDate("date")));
            intent.putExtra("location",entry.getString("location"));
            try {
                intent.putExtra("image", entry.getParseFile("image").getUrl());
            }catch(NullPointerException ex){

            }
            startActivity(intent);
        }

    }

    @Override
    public void onLoading() {
        //DialogWindowManager.show(this);
    }

    @Override
    public void onLoaded(List objects, Exception e) {
        mProgress.setVisibility(View.GONE);
        //DialogWindowManager.dismiss();
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
