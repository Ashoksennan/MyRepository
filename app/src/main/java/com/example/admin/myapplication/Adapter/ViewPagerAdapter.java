package com.example.admin.myapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.admin.myapplication.R;

public class ViewPagerAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflator;
    Integer[] images={R.drawable.slide_1,R.drawable.slide__2,R.drawable.slide__3};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflator.inflate(R.layout.custom_layout,null);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);
        ViewPager vp = (ViewPager)container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager)container;
        View view = (View)object;
        vp.removeView(view);
    }
}
