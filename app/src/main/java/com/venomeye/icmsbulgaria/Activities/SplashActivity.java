package com.venomeye.icmsbulgaria.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.venomeye.icmsbulgaria.Utilities.LocalModels.Networking;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Program;
import com.venomeye.icmsbulgaria.Utilities.LocalModels.Speakers;


public class SplashActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        Program.fillDatabaseIfNeeded();
        Networking.fillDatabaseIfNeeded();
        Speakers.fillDatabaseIfNeeded();
        Intent intent = new Intent(this, MainMenuActivity.class);
        startActivity(intent);
        finish();
    }
}