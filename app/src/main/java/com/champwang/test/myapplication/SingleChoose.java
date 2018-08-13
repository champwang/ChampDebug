package com.champwang.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * Created by champwang on 2018/8/7.
 */

public class SingleChoose extends AppCompatActivity {
    private Button btnSubmitter;
    private RadioButton rbB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_choose);
        btnSubmitter = (Button) findViewById(R.id.btnSubmit);
        rbB = (RadioButton) findViewById(R.id.rbB);

        btnSubmitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rbB.isChecked()){
                    Toast.makeText(SingleChoose.this, "Select is right",
                            Toast.LENGTH_SHORT).show();
                }  else {
                    Toast.makeText(SingleChoose.this, "Select is wrong",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
