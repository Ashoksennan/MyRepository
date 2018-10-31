package com.example.admin.myapplication.activity;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.myapplication.R;
import com.example.admin.myapplication.di.component.DaggerNetworkComponent;
import com.example.admin.myapplication.di.module.AppModule;
import com.example.admin.myapplication.di.module.DonorLoginModule;
import com.example.admin.myapplication.di.module.NetworkModule;
import com.example.admin.myapplication.di.module.SharedPreferenceModule;
import com.example.admin.myapplication.presenter.DonorLoginPresenter;
import com.example.admin.myapplication.presenter.contracts.IDonarLoginContract;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Retrofit;
import studio.carbonylgroup.textfieldboxes.ExtendedEditText;
import studio.carbonylgroup.textfieldboxes.TextFieldBoxes;

public class DonarLoginActivity extends AppCompatActivity implements IDonarLoginContract.view {
@Nullable
@BindView(R.id.text_field_boxes_donar_phno)TextFieldBoxes text_field_boxes_donar_phno;
@Nullable
@BindView(R.id.text_field_boxes_donar_password)TextFieldBoxes text_field_boxes_donar_password;
@Nullable
@BindView(R.id.edittext_donar_phno)ExtendedEditText edittext_donar_phno;
@Nullable
@BindView(R.id.edittext_donar_password)ExtendedEditText edittext_donar_password;
@Nullable
@BindView(R.id.cb_rememberme)CheckBox cb_rememberme;
@Nullable
@BindView(R.id.tv_forgotpassword)TextView tv_forgotpassword;
@Nullable
@BindView(R.id.tv_registernow)TextView tv_registernow;
@Nullable
@BindView(R.id.btn_login)Button btn_login;

@Inject
DonorLoginPresenter donorLoginPresenter;

@Inject
Retrofit retrofit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donar_login);
        ButterKnife.bind(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Donor Login");
        DaggerNetworkComponent.builder().appModule(new AppModule(getApplication())).networkModule(new NetworkModule("https://arid-conductor.000webhostapp.com")).sharedPreferenceModule(new SharedPreferenceModule()).donorLoginModule(new DonorLoginModule(this)).build().Inject(this);

        onClickFunctions();
    }

    private void onClickFunctions() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(DonarLoginActivity.this, "Login success!", Toast.LENGTH_SHORT).show();
            }
        });
        tv_registernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ik = new Intent(DonarLoginActivity.this,Donar_Register_Activity.class);
                startActivity(ik);
                finish();
            }
        });
    }


}
