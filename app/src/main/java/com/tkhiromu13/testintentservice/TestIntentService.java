package com.tkhiromu13.testintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class TestIntentService extends IntentService {

    public TestIntentService() {
        super("TestIntentService");
        Log.d("debug", "TestIntentService");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d("debug", "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.d("debug", "onStartCommand");

        return super.onStartCommand(intent,flags,startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.d("debug", "onHandleIntent");

        int count = 10;

        try {
            for(int i=0 ; i< count ; i++) {
                Thread.sleep(10000);

                Log.d("debug", "sleep: " + String.valueOf(i));
            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void onDestroy() {
        Log.d("debug", "onDestroy");

        super.onDestroy();
    }
}
