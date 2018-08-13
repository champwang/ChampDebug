package com.champwang.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by champwang on 2018/8/3.
 */

public class ActivityAddWidgetCode extends AppCompatActivity implements View.OnClickListener {
    LinearLayout root;
    Button btnWidget;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        setContentView(root);

        for(int i = 0 ; i < 5 ; i++)
        {
            btnWidget = new Button(this);
            btnWidget.setText("button");
            btnWidget.setOnClickListener(this);
            LinearLayout.LayoutParams lp =  new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.weight = 1;
            root.addView(btnWidget,lp);
        }
    }

    @Override
    public void onClick(View v) {
        root.removeView(v);
    }
}
