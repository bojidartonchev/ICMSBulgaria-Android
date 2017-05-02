package com.venomeye.icmsbulgaria.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.venomeye.icmsbulgaria.R;

public class WebActivity extends AppCompatActivity {

    private WebView mWebview ;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        mWebview  = (WebView) findViewById(R.id.webview);
        Intent intent = getIntent();
        String url = intent.getStringExtra("url");
        mWebview.loadUrl(url);
        setContentView(mWebview);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(intent.getStringExtra("name"));

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