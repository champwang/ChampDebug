package com.champwang.test.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by champwang on 2018/7/31.
 */

public class FragmentMainActivity extends AppCompatActivity {

    public FragmentMainActivity() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main_root);

        if (savedInstanceState == null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
//                   .addToBackStack(null)
                    .add(R.id.containerFragment, new FragmentMain())
                    .commit();
        }
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState,
                         @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}
