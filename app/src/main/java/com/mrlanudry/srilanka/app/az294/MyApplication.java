package com.mrlanudry.srilanka.app.az294;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.onesignal.OneSignal;


public class MyApplication extends Application {



    private static MyApplication mInstense;




    public MyApplication(){


        mInstense = this;

    }


    @Override
    public void onCreate() {
        super.onCreate();

        mInstense = this;

        MobileAds.initialize(this);
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }



    public static synchronized  MyApplication getmInstense(){

        return mInstense;
    }





}
