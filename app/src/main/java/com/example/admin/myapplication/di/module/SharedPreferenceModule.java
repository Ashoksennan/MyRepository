package com.example.admin.myapplication.di.module;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.admin.myapplication.activity.SharedPreferenceHelpher;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = AppModule.class)
public class SharedPreferenceModule {
    public SharedPreferenceModule() {
    }
    @Provides
    @Singleton
    SharedPreferences provideSgaredPreferences(@Named("application")Application application){
        return PreferenceManager.getDefaultSharedPreferences(application);
    }
    @Provides
    @Singleton
    SharedPreferenceHelpher provideSharedPrefHelpher(){
        return new SharedPreferenceHelpher();
    }
}
