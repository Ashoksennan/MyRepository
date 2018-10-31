package com.example.admin.myapplication.di.component;

import com.example.admin.myapplication.activity.DonarLoginActivity;
import com.example.admin.myapplication.di.module.AppModule;
import com.example.admin.myapplication.di.module.DonorLoginModule;
import com.example.admin.myapplication.di.module.NetworkModule;
import com.example.admin.myapplication.di.module.SharedPreferenceModule;

import dagger.Component;
import dagger.Module;

@Component(modules = {NetworkModule.class,AppModule.class,SharedPreferenceModule.class,DonorLoginModule.class})
public interface NetworkComponent {
    void Inject(DonarLoginActivity donarLoginActivity);
}
