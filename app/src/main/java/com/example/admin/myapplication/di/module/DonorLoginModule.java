package com.example.admin.myapplication.di.module;

import com.example.admin.myapplication.presenter.contracts.IDonarLoginContract;

import dagger.Module;
import dagger.Provides;

@Module
public class DonorLoginModule {
    IDonarLoginContract.view view;

    public DonorLoginModule(IDonarLoginContract.view view) {
        this.view = view;
    }
    @Provides
    IDonarLoginContract.view provideIDonorView(){
        return this.view;
    }
}
