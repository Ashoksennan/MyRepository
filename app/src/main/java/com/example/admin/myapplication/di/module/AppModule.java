package com.example.admin.myapplication.di.module;

import android.app.Application;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
@Module
public class AppModule {
    Application application;

    public AppModule(Application application) {
        this.application = application;
    }
    @Provides
    @Named("application")
    Application provideApplication(){
        return this.application;
    }
}
