package com.bl.a1912500467_fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class CustomViewPager extends ViewPager {

    public boolean mIsEnabledSwipe = false;

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return mIsEnabledSwipe;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return mIsEnabledSwipe;
    }
}