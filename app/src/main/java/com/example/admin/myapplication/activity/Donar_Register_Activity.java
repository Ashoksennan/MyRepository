package com.example.admin.myapplication.activity;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.myapplication.MainActivity;
import com.example.admin.myapplication.R;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Donar_Register_Activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donar__register_);
        getSupportActionBar().setTitle("Donar Registration");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);
    }
}
