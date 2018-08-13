package com.champwang.test.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

/**
 * Created by champwang on 2018/8/8.
 */

public class MulChoose extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private CheckBox cbA, cbB, cbC, cbD;
    private TextView tvResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mul_choose);

        cbA = (CheckBox) findViewById(R.id.cbA);
        cbB = (CheckBox) findViewById(R.id.cbB);
        cbC = (CheckBox) findViewById(R.id.cbC);
        cbD = (CheckBox) findViewById(R.id.cbD);

        tvResult = (TextView) findViewById(R.id.tvResult);

        cbA.setOnCheckedChangeListener(this);
        cbB.setOnCheckedChangeListener(this);
        cbC.setOnCheckedChangeListener(this);
        cbD.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String str = "select:  ";
        if (cbA.isChecked())
        {
            str += cbA.getText()+ "  ";
        }
        if (cbB.isChecked())
        {
            str += cbB.getText()+ "  ";
        }
        if (cbC.isChecked())
        {
            str += cbC.getText()+ "  ";
        }
        if (cbD.isChecked())
        {
            str += cbD.getText()+ "  ";
        }
        tvResult.setText(str);
    }
}
