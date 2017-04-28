package com.venomeye.icmsbulgaria;


import android.app.Application;

import com.orm.SugarContext;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.venomeye.icmsbulgaria.Utilities.ParseUtil.ParseNews;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Parse Initialization
        ParseObject.registerSubclass(ParseNews.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.parse_app_id))
                .clientKey(getString(R.string.parse_client_key))
                .server(getString(R.string.parse_server)).build());

        SugarContext.init(this);
        //Facebook SDK Initialization
        //FacebookSdk.sdkInitialize(getApplicationContext());
        //AppEventsLogger.activateApp(this);

        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        //installation.put("GCMSenderId", "838294079504");
        installation.saveInBackground();

    }

     @Override
    public void onTerminate() {
         super.onTerminate();
         SugarContext.terminate();
     }


}
