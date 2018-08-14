package com.champwang.test.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by champwang on 2018/8/14.
 */

public class MyRect extends View {
    public MyRect(Context context) {
        super(context);
    }

    public MyRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        int color = ta.getColor(R.styleable.MyView_rect_color, 0xffff0000);
        setBackgroundColor(color);
        ta.recycle();
    }



}
