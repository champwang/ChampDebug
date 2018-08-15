package com.champwang.test.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by qingchen on 2018/8/15.
 */

public class MyViewTest extends AppCompatActivity implements View.OnClickListener {
    private MyRect mr;
    private LinearLayout ll;
    private Button btnMyRectTop;
    private Button btnMyRectBottom;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mr = new MyRect(this);
        setContentView(R.layout.myrect);

        btnMyRectTop = (Button) findViewById(R.id.btnMyRectTop);
        btnMyRectBottom = (Button) findViewById(R.id.btnMyRectBottom);

        btnMyRectTop.setOnClickListener(this);
        btnMyRectBottom.setOnClickListener(this);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnMyRectTop:
                AlphaAnimation aa = new AlphaAnimation(0,1);
                aa.setDuration( 2000);
                v.startAnimation(aa);
                break;

            case R.id.btnMyRectBottom:
                  //will cause Error:
                  //Error:Execution failed for task ':app:compileDebugJavaWithJavac'.
                  //> Compilation failed; see the compiler error output for details.
//                v.startAnimation(AnimationUtils.loadAnimation(MyViewTest.this, R.drawable.aa));
                break;

        }

    }
}
