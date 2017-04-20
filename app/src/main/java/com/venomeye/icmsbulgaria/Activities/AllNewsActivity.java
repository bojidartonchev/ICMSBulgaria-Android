package com.venomeye.icmsbulgaria.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.Adapters.NewsAdapter;
import com.parse.ParseObject;
import com.parse.ParseQueryAdapter;

        import java.util.List;
public class AllNewsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, ParseQueryAdapter.OnQueryLoadListener {

    private ListView mNews;

    private ParseQueryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_news);

        mNews = (ListView) findViewById(R.id.all_news_list_view) ;

        mAdapter = new NewsAdapter(this);
        mAdapter.addOnQueryLoadListener(this);
        mNews.setOnItemClickListener(this);
        mNews.setAdapter(mAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(getApplicationContext(), News.class);

        ParseObject entry = (ParseObject) parent.getItemAtPosition(position);
        if(entry!=null){
            startActivity(intent);
        }

    }

    @Override
    public void onLoading() {
        //DialogWindowManager.show(this);
    }

    @Override
    public void onLoaded(List objects, Exception e) {
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
