package com.venomeye.icmsbulgaria.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.venomeye.icmsbulgaria.R;

public class WorkshopActivity extends AppCompatActivity {


    private TextView mTitleField;
    private TextView mContentField;
    private TextView mDateField;
    private TextView mLocationField;
    private ImageView mPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop_single);

        mTitleField = (TextView) findViewById(R.id.title);
        mContentField = (TextView) findViewById(R.id.content);
        mDateField = (TextView) findViewById(R.id.date);
        mLocationField = (TextView) findViewById(R.id.location);
        mPhoto = (ImageView) findViewById(R.id.photo);

        Intent intent = getIntent();

        mTitleField.setText(intent.getStringExtra("title"));
        mContentField.setText(intent.getStringExtra("content"));
        mDateField.setText(intent.getStringExtra("date"));
        mLocationField.setText(intent.getStringExtra("location"));
        Picasso.with(this).load(intent.getStringExtra("image")).into(mPhoto);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(mTitleField.getText().toString());

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
