package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("FAVf2T6vLssw6VO74YT50zZmzUVgSdfd1INzbuYz")
                .clientKey("Pozevc68vTlUCycNH0FO8JmBPaSi6Dsviu5p8TaI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
