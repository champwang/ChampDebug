package com.champwang.test.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by champwang on 2018/8/3.
 */

public class LayoutWeightTest extends AppCompatActivity {

    WebView wv;
    EditText et;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser);

        et = (EditText)findViewById(R.id.etBrowser);
        wv = (WebView) findViewById(R.id.wvBrowser);

        findViewById(R.id.btnBrowser).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = et.getText().toString();
                System.out.println("champ_url:" + url);
                wv.loadUrl(url);
            }
        });

    }
}
