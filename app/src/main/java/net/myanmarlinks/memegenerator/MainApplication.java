package net.myanmarlinks.memegenerator;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by soethihanaung on 12/8/15.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);


    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
