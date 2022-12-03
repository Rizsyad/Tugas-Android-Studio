package com.bl.utstipeaganjil_1912500467_rizsyadar_af;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class CutomeViewPager extends ViewPager {

    public boolean mIsEnabledSwipe = false;

    public CutomeViewPager(Context context) {
        super(context);
    }

    public CutomeViewPager(Context context, AttributeSet attrs) {
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