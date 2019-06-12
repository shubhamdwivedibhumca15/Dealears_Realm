package com.example.dealears_realm;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class Dealears_Application extends Application
{
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(getApplicationContext());

        RealmConfiguration encryptedConfig = new RealmConfiguration.Builder()
                .name("Dealears")
                .schemaVersion(1)
                .build();
        Realm.removeDefaultConfiguration();
        Realm.setDefaultConfiguration(encryptedConfig);

    }
}
