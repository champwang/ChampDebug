package com.champwang.test.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by champwang on 2018/8/14.
 */

public class MyRect extends View {
    public MyRect(Context context) {
        super(context);
        initProperties();
    }

    public MyRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initProperties();
//        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.MyView);
//        int color = ta.getColor(R.styleable.MyView_rect_color, 0xffff0000);
//        setBackgroundColor(color);
//        ta.recycle();
    }

    public MyRect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initProperties();
    }

    private void initProperties()
    {
        p = new Paint();
        p.setColor(Color.BLUE);

    }
    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.translate(200, 200);
        canvas.rotate(degrees, 300, 300);

//        canvas.rotate(degrees);
        canvas.drawRect(50, 50, 200, 200, p);
        degrees ++;

        canvas.restore();

        System.out.println("drawRect");
        invalidate(); //会比较耗资源，建议用 handler 延时绘制
    }

    private Paint p;
    private float degrees = 0;
}
