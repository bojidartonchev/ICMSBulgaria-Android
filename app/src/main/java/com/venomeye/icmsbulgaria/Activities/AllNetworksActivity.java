package com.venomeye.icmsbulgaria.Activities;


import android.content.Intent;
import android.net.Network;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.orm.query.Condition;
import com.orm.query.Select;
import com.venomeye.icmsbulgaria.R;
import com.venomeye.icmsbulgaria.Utilities.Adapters.NetworkAdapter;
import com.venomeye.icmsbulgaria.Utilities.Adapters.ProgramAdapter;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Networking;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Program;

import java.util.ArrayList;
import java.util.List;

public class AllNetworksActivity extends AppCompatActivity {

    private ListView mNetworks;
    private NetworkAdapter mAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_networks);

        List<Networking> networks = Networking.listAll(Networking.class);
        mNetworks = (ListView) findViewById(R.id.networks_listview);
        mAdapter = new NetworkAdapter(this, networks);
        mNetworks.setAdapter(mAdapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Networking");

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
