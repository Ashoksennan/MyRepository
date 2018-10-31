package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.admin.myapplication.Adapter.ViewPagerAdapter;
import com.example.admin.myapplication.activity.DonarLoginActivity;
import com.example.admin.myapplication.activity.Donar_Register_Activity;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
LinearLayout sliderDotspanel;
int dotscount;
ImageView[] dots;
@BindView(R.id.lay_donate_blood)LinearLayout lay_donate_blood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        Timer timer = new Timer();
        timer.schedule(new MyTimerTask(),2000,4000);

        sliderDotspanel = (LinearLayout)findViewById(R.id.dot_lay);
        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];
        for(int i=0;i<dotscount;i++){
            dots[i]=new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.non_active_dots));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8,0,8,0);
            sliderDotspanel.addView(dots[i],params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dots));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                for(int j=0;j<dotscount;j++){
                    dots[j].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.non_active_dots));
                }
                dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dots));
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        onclickFunctions();

     }

    private void onclickFunctions() {
        lay_donate_blood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent im = new Intent(MainActivity.this,DonarLoginActivity.class);
                startActivity(im);
            }
        });
    }

    public class MyTimerTask extends TimerTask {

         @Override
         public void run() {
             MainActivity.this.runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     if(viewPager.getCurrentItem() == 0){
                         viewPager.setCurrentItem(1);
                     }else if(viewPager.getCurrentItem() == 1){
                         viewPager.setCurrentItem(2);
                     }else{
                         viewPager.setCurrentItem(0);
                     }
                 }
             });
         }
     }
}
