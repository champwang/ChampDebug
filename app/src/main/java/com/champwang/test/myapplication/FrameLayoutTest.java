package com.champwang.test.myapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class FrameLayoutTest extends AppCompatActivity {
    private android.widget.FrameLayout root;
    private ImageView ivA, ivB;

    int[] imageIDs = new int[]
            {
                R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
                R.drawable.image6,
                R.drawable.image7,
                R.drawable.image8
            };

    int currentImageID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);

        ivA= (ImageView) findViewById(R.id.iv1);
        ivB = (ImageView) findViewById(R.id.iv2);

        showA();
        root  = (android.widget.FrameLayout) findViewById(R.id.root);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ivA.getVisibility() == View.VISIBLE)
                {
                  showB();
                }
                else
                {
                    showA();
                }
            }
        });

        final Handler myHandler  = new Handler()
        {
            public void handleMessage (Message msg)
            {
                if (msg.what == 0x12333)
                {
                    ivA.setImageResource(imageIDs[currentImageID++ % imageIDs.length]);
                    //ivB.setImageResource(imageIDs[currentImageID++ % imageIDs.length]);
                }
            }
        };

       new Timer().schedule(new TimerTask() {
           @Override
           public void run() {
               myHandler.sendEmptyMessage(0x12333);
           }
       }, 0, 1000);


    }

    private void showA(){
        ivA.setVisibility(View.VISIBLE);
        ivB.setVisibility(View.INVISIBLE);
    }

    private void showB(){
        ivA.setVisibility(View.INVISIBLE);
        ivB.setVisibility(View.VISIBLE);
    }
}
